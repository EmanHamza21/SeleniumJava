package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputFeild = By.id("file-upload");
    private By uploadButton = By.className("button");
    private By confirmUploadedFile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputFeild).sendKeys(absolutePathOfFile);
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }
    public String fileUploaded(){
        return driver.findElement(confirmUploadedFile).getText();
    }
}
