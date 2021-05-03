package base;

import Pages.HomePage;
import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.EventReporter;
import utils.windowManager;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    private EventFiringWebDriver driver;
    protected HomePage homePage;

     @BeforeClass
       public void setUp(){
         System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
         driver = new EventFiringWebDriver(new ChromeDriver());
         driver.register(new EventReporter());
         goHome();
         setCookie();
         homePage = new HomePage(driver);
       }

       @BeforeMethod
    public void goHome(){
           driver.get("https://the-internet.herokuapp.com/");
       }

       public windowManager getWindowManager(){
         return new windowManager(driver);
       }

       @AfterMethod
    public void recordFailure(ITestResult result){
         if (ITestResult.FAILURE == result.getStatus()){
             var camera = (TakesScreenshot)driver;
             File screenShot = camera.getScreenshotAs(OutputType.FILE);

             try{
                 Files.move(screenShot, new File("resources/screenShots/" + result.getName() + ".png"));
             }catch (IOException e){
                 e.printStackTrace();
             }
         }
       }

       private void setCookie (){
           Cookie cookie = new Cookie.Builder("tau", "123")
                   .domain("the-internet.herokuapp.com")
                   .build();
           driver.manage().addCookie(cookie);
       }

       @AfterClass
    public void closeChrome(){
         driver.quit();
       }

}
