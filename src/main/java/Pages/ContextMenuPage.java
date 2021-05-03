package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By hotSpotBox = By.id("hot-spot");

    public ContextMenuPage (WebDriver driver){
        this.driver = driver;
    }

    public void rightClick_HotSpotBox(){
        WebElement box = driver.findElement(hotSpotBox);
        Actions actions = new Actions(driver);
        actions.contextClick(box).perform();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String verifyAlertMsg(){
        return driver.switchTo().alert().getText();
    }


}
