package ForgetPassword;

import Pages.emailSendPage;
import Pages.forgetPasswordPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgetPasswordTest extends BaseTests {

    @Test
    public void testForgetPassword(){
        forgetPasswordPage forgetPasswordPage = homePage.forgetPassword();
        forgetPasswordPage.enterEmail("tau@Example.com");
        emailSendPage emailSendPage = forgetPasswordPage.clickRetrievePassword();
        System.out.println (emailSendPage.messageAllert());
    }
}
