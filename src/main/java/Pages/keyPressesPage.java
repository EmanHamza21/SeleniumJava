package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class keyPressesPage {
    private WebDriver driver;
    private By pressKeyFeild = By.id("target");
    private By returnText = By.id("result");

    public keyPressesPage (WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(pressKeyFeild).sendKeys(text);
    }
    public void enterPi(){
        enterText(Keys.chord(Keys.ALT,"p") +"=3.14");
    }

    public String getResult(){
        return driver.findElement(returnText).getText();
    }


}
