package Login;
import Pages.loginPage;
import Pages.secureArea;
import base.BaseTests;
import org.testng.annotations.Test;import static org.testng.Assert.assertTrue;

public class loginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin (){
          loginPage loginPage = homePage.clickFormAuthentication();
          loginPage.setUsername("tomsmith");
          loginPage.setPassword("SuperSecretPassword!");
          secureArea secureArea = loginPage.clickLoginButton();
          System.out.println(secureArea.AllertMessage());
    }
}
