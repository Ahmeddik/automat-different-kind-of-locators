import Pages.DropDownPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest{
    @Test
    public void dropDownOpened(){
        DropDownPage dropDownPage =  homePage.dropDownPage();
        Assert.assertEquals(dropDownPage.dropDownHeaderCheck(), "Dropdown List", "Can't reach drop down page");
    }

    @Test
    public void dropDownChoiceTest(){
        DropDownPage dropDownPage =  homePage.dropDownPage();
        dropDownPage.selectFromDropDownMenu();
        Assert.assertEquals(dropDownPage.getSelectedOption(),"Option 1", "This is not option 1");
    }

}
