package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class dropDownPage {

    private WebDriver driver;
    private By dropDownFeild = By.id("dropdown");

    public dropDownPage (WebDriver driver) {
        this.driver = driver;
    }

    private Select findDropDownElements(){
        return new Select(driver.findElement(dropDownFeild));
    }

    public void selectFromDropDown (String option){
        findDropDownElements().selectByVisibleText(option);
    }

    public List <String> getSelectedOptions(){
        List <WebElement> selectedElements = findDropDownElements().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public void dropDownOptions(){
        String script = "arguments[0].setAttribute('multiple', '')";
        var JSExecutor = (JavascriptExecutor)driver;
        JSExecutor.executeScript(script,findDropDownElements());
    }



}
