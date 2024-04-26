package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    WebDriver driver;
    private String alertMessageId = "flash";
    private By alertMessage = By.id(alertMessageId);
    public SecureAreaPage (WebDriver driver){
        this.driver = driver;
    }
    public String getAlertMessage(){
        return driver.findElement(alertMessage).getText();
    }
}
