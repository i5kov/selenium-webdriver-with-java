package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private final WebDriver driver;
    private final By successLoginMessage = By.cssSelector("#flash");
    private final By logoutButton = By.cssSelector(".button");


    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickLogoutButton() {
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }

    public String getSuccessfulLoginMessage() {
        return driver.findElement(successLoginMessage).getText();
    }
}