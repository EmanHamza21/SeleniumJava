package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public loginPage clickFormAuthentication (){
        clickLinks("Form Authentication");
        return new loginPage (driver);
    }

    private void clickLinks (String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public dropDownPage dropDownLink (){
        clickLinks("Dropdown");
        return new dropDownPage(driver);
    }

    public forgetPasswordPage forgetPassword(){
        clickLinks("Forgot Password");
        return new forgetPasswordPage(driver);
    }

    public HoversPage clickHovers (){
        clickLinks("Hovers");
        return new HoversPage(driver);
    }

    public keyPressesPage clickKeyPresses(){
        clickLinks("Key Presses");
        return new keyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        clickLinks("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public javaScriptAlertsPage clickJavascriptAlerts(){
        clickLinks("JavaScript Alerts");
        return new javaScriptAlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clickLinks("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenuLink(){
        clickLinks("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WYSIWYGEditorPage clickWYSIWYGEditor(){
        clickLinks("WYSIWYG Editor");
        return new WYSIWYGEditorPage (driver);
    }

    public FramesPage clickFrames(){
        clickLinks("Frames");
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
        clickLinks("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDOMPage clickLargeAndDeepDOM(){
        clickLinks("Large & Deep DOM");
        return new LargeAndDeepDOMPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        clickLinks("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows(){
        clickLinks("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

}
