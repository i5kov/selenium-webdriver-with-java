package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;
    private final By usernameField = By.cssSelector("#username");
    private final By passwordField = By.cssSelector("#password");
    private final By loginButton = By.cssSelector("button[type='submit']");
    private final By errorMessage = By.cssSelector("#flash");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillUsername(String username) {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
    }

    public void fillPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickSubmitButton() {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

    public String getErrorMessageText() {
        return driver.findElement(errorMessage).getText();
    }
}
