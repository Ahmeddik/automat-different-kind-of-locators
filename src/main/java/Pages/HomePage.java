package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnLink (String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public FormAuthenticationPage formAuthenticationPage(){
        clickOnLink("Form Authentication");
        return new FormAuthenticationPage(driver);
    }

    public DropDownPage dropDownPage (){
        clickOnLink("Dropdown");
        return new DropDownPage(driver);
    }
}
