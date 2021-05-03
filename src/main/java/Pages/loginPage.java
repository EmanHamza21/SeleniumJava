package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private WebDriver driver;
    private By UsernameFeild = By.id("username");
    private By PasswordFeild =By.id("password");
    private By loginButtonFeild = By.cssSelector("button.radius");

    public loginPage (WebDriver driver){
        this.driver = driver;
    }

    public void setUsername (String username){
        driver.findElement (UsernameFeild).sendKeys(username);
    }

    public void setPassword (String password){
        driver.findElement(PasswordFeild).sendKeys(password);
    }

    public secureArea clickLoginButton (){
        driver.findElement(loginButtonFeild).click();
        return new secureArea(driver);
    }

}
