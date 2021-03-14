package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BasePage {

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

}
