package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage {

    private final By chooseFileButton = By.cssSelector("#file-upload");
    private final By uploadButton = By.cssSelector("#file-submit");
    private final By fileUploadedText = By.cssSelector("h3");
    private final By uploadedFile = By.cssSelector("#uploaded-files");

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void clickUploadButton() {
        clickElement(uploadButton);
    }

    public void uploadFile(String absolutePathOfFile) {
        findElement(chooseFileButton).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getFileUploadedText() {
        return findElement(fileUploadedText).getText();
    }

    public String getUploadedFileName() {
        return findElement(uploadedFile).getText();
    }
}
