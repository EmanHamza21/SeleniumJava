package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example2DynamicLoadPage {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By visibleText = By.id("finish");

    public example2DynamicLoadPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(visibleText)));
    }

    public String getVisibleText (){
        return driver.findElement(visibleText).getText();
    }
}
