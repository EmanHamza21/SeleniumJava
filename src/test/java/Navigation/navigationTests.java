package Navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class navigationTests extends BaseTests {

    @Test
    public void testNavigator (){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testMultipleWindows(){
        homePage.clickMultipleWindows().clickClickHereLink();
        getWindowManager().switchToTab("New Window");
    }
}
