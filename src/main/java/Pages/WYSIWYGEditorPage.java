package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String editorIFrame = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseButton = By.cssSelector("#mceu_12 button");

    public WYSIWYGEditorPage (WebDriver driver){
        this.driver = driver;
    }

    private void switchToEditArea (){
        driver.switchTo().frame(editorIFrame);
    }

    public void clearEditArea (){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setEditArea (String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void clickIncreaseButton(){
        driver.findElement(increaseButton).click();
    }

    public String readTextFromEditArea(){
       switchToEditArea();
       String text =  driver.findElement(textArea).getText();
       switchToMainArea();
       return text;
     }


}
