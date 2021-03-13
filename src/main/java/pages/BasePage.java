package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BasePage {

    private final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElement(By selector) {
        return driver.findElement(selector);
    }

    public List<WebElement> findElements(By selector) {
        return driver.findElements(selector);
    }

    public void clickElement(By selector) {
        findElement(selector).click();
    }

    public Select getDropdownElement(By selector) {
        return new Select(findElement(selector));
    }

    public Actions actions() {
        return new Actions(driver);
    }

}
