package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class secureArea {
    private WebDriver driver;
    private By allert = By.cssSelector("div.flash");

    public secureArea (WebDriver driver){
        this.driver = driver;
    }

    public String AllertMessage (){
       return driver.findElement(allert).getText();
    }
}
