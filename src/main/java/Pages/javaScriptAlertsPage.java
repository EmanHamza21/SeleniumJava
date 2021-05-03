package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class javaScriptAlertsPage {
    private WebDriver driver;
    private By jsAlertButton = By.xpath(".//button[.='Click for JS Alert']");
    private By jsConfirmButton = By.xpath(".//button[.='Click for JS Confirm']");
    private By jsPromptButton = By.xpath(".//button[.='Click for JS Prompt']");
    private By acceptAlert = By.cssSelector("#result");


    public javaScriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void alert_clickForJSAlertButton(){
        driver.findElement(jsAlertButton).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public String getResultMsg(){
        return driver.findElement(acceptAlert).getText();
    }

    public void alert_clickForJSConfirmButton(){
        driver.findElement(jsConfirmButton).click();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void alert_clickPromptButton(){
        driver.findElement(jsPromptButton).click();
    }

    public void alert_enterText(String text){
        driver.switchTo().alert().sendKeys(text);
    }

}
