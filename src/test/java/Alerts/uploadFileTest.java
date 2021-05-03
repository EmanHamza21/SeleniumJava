package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class uploadFileTest extends BaseTests {

    @Test
    public void testUploadFile(){
        var uploadPage= homePage.clickFileUpload();
        uploadPage.uploadFile("F:\\Software Testing\\Automation Testing\\Selenium_WebDriver\\webdriver_java\\resources\\chromedriver.exe");
        uploadPage.clickUploadButton();
        assertEquals(uploadPage.fileUploaded(),"chromedriver.exe");
    }
}
