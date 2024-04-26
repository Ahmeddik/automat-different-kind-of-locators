package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    WebDriver driver;
    private By dropDownPageHeader = By.cssSelector("h3");
    private By dropDrownBar = By.id("dropdown");
    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    public String dropDownHeaderCheck (){
        return driver.findElement(dropDownPageHeader).getText();
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropDrownBar));
    }

    public String getSelectedOption(){
        WebElement selectedOption = findDropDownElement().getFirstSelectedOption();
        return selectedOption.getText();
    }
    public void selectFromDropDownMenu(){
        findDropDownElement().selectByVisibleText("Option 1");
    }
}
