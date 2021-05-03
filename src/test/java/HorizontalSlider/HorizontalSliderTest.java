package HorizontalSlider;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTest extends BaseTests {

    @Test
    public void testHorizontalSlider(){
        String value = "4";
        var HorizontalSliderPage = homePage.clickHorizontalSlider();
         HorizontalSliderPage.setSliderValue(value);
         assertEquals(HorizontalSliderPage.getSliderValue(),value,"incorrect value");
    }
}
