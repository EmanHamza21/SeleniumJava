package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class emailSendPage {
    private WebDriver driver;
    private By messageFeild = By.id("content");

    public emailSendPage (WebDriver driver){
        this.driver = driver;
    }
    public String messageAllert(){
      return driver.findElement(messageFeild).getText();
    }
}
