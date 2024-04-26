import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    String theInterNetHomePageURL = "https://the-internet.herokuapp.com/";

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get(theInterNetHomePageURL);
        homePage = new HomePage(driver);
    }

    @Test
    public void testHomePageOpened(){
        Assert.assertEquals(driver.findElement(By.className("heading")).getText(), "Welcome to the-internet", "Can't reach home page");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
