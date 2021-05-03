package KeyPresses;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressesTest extends BaseTests {

    @Test
    public void testBackSpace(){
       var keyPressesPage= homePage.clickKeyPresses();
       keyPressesPage.enterText("A" + Keys.BACK_SPACE);
       assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE","incorrect text");
    }

    @Test
    public void testPi (){
        var keyPressesPage =homePage.clickKeyPresses();
        keyPressesPage.enterPi();

    }

}
