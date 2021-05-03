package Hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class hoverTest extends BaseTests {

    @Test
    public void testHoverUser1(){
       var hoverPage= homePage.clickHovers();
       var Caption = hoverPage.hoverOnFigure(1);
       assertTrue ( Caption.isCaptionDisplayed(),"Caption not displayed");
       assertEquals(Caption.title(),"name: user1","Title isn't correct");
       assertEquals(Caption.getLinkText(),"View profile","Link text isn't correct");
       assertTrue(Caption.getLink().endsWith("/users/1"),"The link isn't correct");
    }
}
