package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class forgetPasswordPage {
    private WebDriver driver;
    private By emailFeild = By.id("email");
    private By retrievePasswordFeild = By.id("form_submit");

    public forgetPasswordPage (WebDriver driver){
        this.driver = driver;
    }

    public void enterEmail (String email){
        driver.findElement(emailFeild).sendKeys(email);
    }
    public emailSendPage retrievePassword(String email){
        enterEmail(email);
        return clickRetrievePassword();
    }
    public emailSendPage clickRetrievePassword (){
        driver.findElement(retrievePasswordFeild).click();
        return new emailSendPage (driver);
    }

}
