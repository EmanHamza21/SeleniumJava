package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ExerciseChapter3 {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement contentShifting = driver.findElement(By.linkText("Shifting Content"));
        contentShifting.click();

        WebElement menu = driver.findElement(By.xpath("//a[contains(.,'Menu ')]"));
        menu.click();

        List <WebElement> buttons = driver.findElements(By.cssSelector("ul>li"));
        System.out.println(buttons.size());

    }

    public static void main(String args[]){
        ExerciseChapter3 test = new ExerciseChapter3();
        test.setUp();
    }

    public void close(){
        driver.quit();
    }
}
