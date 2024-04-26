import Pages.FormAuthenticationPage;
import Pages.SecureAreaPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LognInTest extends BaseTest{

    @Test
    public void formAuthenticationOpened(){
        FormAuthenticationPage formAuthenticationPage = homePage.formAuthenticationPage();
        Assert.assertEquals(formAuthenticationPage.headerheck("h2"), "Login Page", "Can't reach form authentication page.");
    }

    @Test
    public void testLogInSuccessfully(){
        FormAuthenticationPage formAuthenticationPage = homePage.formAuthenticationPage();
        formAuthenticationPage.setUserName("tomsmith");
        formAuthenticationPage.setPassWord("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = formAuthenticationPage.clickOnLogInButton();
        Assert.assertTrue(secureAreaPage.getAlertMessage().contains("You logged into a secure area!"),"Can't reach secure area page");

    }
}
