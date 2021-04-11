package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePage {

    private WebDriver driver;
    private final By successLoginMessage = By.cssSelector("#flash");
    private final By logoutButton = By.cssSelector(".button");

    public SecureAreaPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public LoginPage clickLogoutButton() {
        clickElement(logoutButton);
        return new LoginPage(driver);
    }

    public String getSuccessfulLoginMessage() {
        return getTextFromElement(successLoginMessage);
    }
}