package pages;

import org.openqa.selenium.WebDriver;

public class ABTest extends BasePage {

    public ABTest(WebDriver driver) {
        super(driver);
    }

    public boolean isABTestPageDisplayed() {
        return isElementDisplayed(pageTitle);
    }

    public String getPageTitleText() {
        return findElement(pageTitle).getText();
    }
}
