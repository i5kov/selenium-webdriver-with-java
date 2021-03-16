package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationLink() {
        clickLinkByText("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdownLink() {
        clickLinkByText("Dropdown");
        return new DropdownPage(driver);
    }

    public CheckboxesPage clickCheckboxesLink() {
        clickLinkByText("Checkboxes");
        return new CheckboxesPage(driver);
    }

    public FileUploadPage clickFileUploadLink() {
        clickLinkByText("File Upload");
        return new FileUploadPage(driver);
    }

    private void clickLinkByText(String linkText) {
        clickElement(By.linkText(linkText));
    }

}
