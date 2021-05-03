package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1Field = By.linkText("Example 1: Element on page that is hidden");
    private By example2Field = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public example1DynamicLoadPage clickExample1(){
        driver.findElement(example1Field).click();
        return new example1DynamicLoadPage(driver);
    }

    public example2DynamicLoadPage clickExample2(){
        driver.findElement(example1Field).click();
        return new example2DynamicLoadPage(driver);
    }

}
