package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormAuthenticationPage {
    private WebDriver driver;
    private String userName = "username", passWord = "password", logInCssSelector = "button.radius";

    private By userNameField = By.id(userName);
    private By passWordField = By.id(passWord);
    private By logInButton = By.cssSelector(logInCssSelector);
    public FormAuthenticationPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName (String userName){
        driver.findElement(userNameField).sendKeys(userName);
    }

    public void setPassWord (String passWord){
        driver.findElement(passWordField).sendKeys(passWord);
    }

    public SecureAreaPage clickOnLogInButton (){
        driver.findElement(logInButton).click();
        return new SecureAreaPage(driver);
    }

    public String headerheck(String header){
        return driver.findElement(By.cssSelector(header)).getText();
    }

}
