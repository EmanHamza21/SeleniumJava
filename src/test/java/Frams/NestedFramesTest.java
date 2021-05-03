package Frams;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTest extends BaseTests {

    @Test
    public void testNestedFrames(){
      var framePage = homePage.clickFrames();
      var nestedFramePage = framePage.clickNestedFrames();
        assertEquals(nestedFramePage.readTextFromLeftFrame(),"LEFT","incorrect");
        assertEquals(nestedFramePage.readTextFromBottomFrame(),"BOTTOM","incorrect");


    }
}
