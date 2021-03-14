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

    public HoversPage clickHoversLink() {
        clickLinkByText("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPressesLink() {
        clickLinkByText("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderLink() {
        clickLinkByText("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public JavaScriptAlertsPage clickJavascriptAlertsLink() {
        clickLinkByText("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    private void clickLinkByText(String linkText) {
        clickElement(By.linkText(linkText));
    }

}
