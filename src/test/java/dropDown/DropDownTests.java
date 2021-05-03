package dropDown;

import Pages.dropDownPage;
import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectedOptions(){

        var dropDownPAge = homePage.dropDownLink();
        String option = "Option 1";

        dropDownPAge.selectFromDropDown(option);
        var selectedOptions =  dropDownPAge.getSelectedOptions();

        assertEquals (selectedOptions.size(),1,"incorrect number of selection");
        assertTrue(selectedOptions.contains(option),"option not selected");

    }
}
