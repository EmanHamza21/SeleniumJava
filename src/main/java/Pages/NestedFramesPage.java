package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String leftFrameEditor = "frame-left";
    private String bottomFrameEditor = "frame-bottom";
    private String topFrameEditor = "frame-top";
    private By textBody = By.tagName("body");

    public NestedFramesPage (WebDriver driver){
        this.driver = driver;
    }

    private void switchToLeftFrame (){
        driver.switchTo().frame(topFrameEditor);
        driver.switchTo().frame(leftFrameEditor);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    private void switchToBottomFrame(){
        driver.switchTo().frame(bottomFrameEditor);
    }

    public String readTextFromLeftFrame(){
        switchToLeftFrame();
        String text = driver.findElement(textBody).getText();
        driver.switchTo().parentFrame();
        switchToMainArea();
        return text;
    }

    public String readTextFromBottomFrame(){
        switchToBottomFrame();
        String text = driver.findElement(textBody).getText();
        switchToMainArea();
        return text;
    }
}
