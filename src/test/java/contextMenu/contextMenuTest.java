package contextMenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class contextMenuTest extends BaseTests {

    @Test
    public void testContextMenu(){
      var menuBox =   homePage.clickContextMenuLink();
      menuBox.rightClick_HotSpotBox();
      assertEquals(menuBox.verifyAlertMsg(),"You selected a context menu","incorrect msg");
      menuBox.acceptAlert();

    }
}
