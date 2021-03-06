package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example1DynamicLoadPage {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.cssSelector("#loading");
    private By loadedText = By.id("finish");

    public example1DynamicLoadPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickStartButton (){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }


}
