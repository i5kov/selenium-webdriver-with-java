package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage extends BasePage {

    private final By inputField = By.cssSelector("#target");
    private final By result = By.cssSelector("#result");

    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    public void fillInputField(String text) {
        fillTextInField(inputField, text);
    }

    public String getResultText() {
        return findElement(result).getText();
    }

    public boolean isResultDisplayed() {
        return findElement(result).isDisplayed();
    }


}
