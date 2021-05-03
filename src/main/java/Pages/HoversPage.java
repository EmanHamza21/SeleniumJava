package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HoversPage {
    private WebDriver driver;
    private By figureFeild = By.cssSelector("div.figure");
    private By boxCaption = By.className("figcaption");

    public HoversPage (WebDriver driver){
        this.driver = driver;
    }

    public FigureCaption hoverOnFigure(int index){
        WebElement figure = driver.findElements(figureFeild).get(index -1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(boxCaption));
    }

    public class FigureCaption{

       private WebElement caption;
       private By header = By.tagName("h5");
       private By link = By.tagName("a");

       public FigureCaption(WebElement caption){
           this.caption = caption;
       }

       public String title (){
           return caption.findElement(header).getText();
       }

       public String getLink(){
           return caption.findElement(link).getAttribute("href");
       }

       public String getLinkText(){
           return caption.findElement(link).getText();
       }

       public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }
    }
}
