package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BasePage {

    protected final By pageTitle = By.cssSelector("h3");
    private final WebDriver driver;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement findElement(By selector) {
        return driver.findElement(selector);
    }

    protected List<WebElement> findElements(By selector) {
        return driver.findElements(selector);
    }

    protected void clickElement(By selector) {
        findElement(selector).click();
    }

    protected void fillTextInField(By selector, String text) {
        findElement(selector).sendKeys(text);
    }

    protected Select getDropdownElement(By selector) {
        return new Select(findElement(selector));
    }

    protected Actions actions() {
        return new Actions(driver);
    }

    protected Alert switchToAlertPopUp() {
        return driver.switchTo().alert();
    }

    protected void switchToFrame(String frameId) {
        driver.switchTo().frame(frameId);
    }

    protected void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }

    protected boolean isElementDisplayed(By selector) {
        try {
            findElement(selector).isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    protected String getAlertText() {
        return switchToAlertPopUp().getText();
    }

    protected void clickLinkByText(String linkText) {
        clickElement(By.linkText(linkText));
    }

    protected String getTextFromElement(By locator) {
        return findElement(locator).getText();
    }
}
