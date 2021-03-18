package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage extends BasePage {

    private final By result = By.cssSelector("#result");
    private final String clickForJSSpecificButton = "//button[text()='Click for JS %s']";

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    public void clickForJSAlertButton() {
        clickElement(By.xpath(String.format(clickForJSSpecificButton, "Alert")));
    }

    public void clickForJSConfirmButton() {
        clickElement(By.xpath(String.format(clickForJSSpecificButton, "Confirm")));
    }

    public void clickForJSPromptButton() {
        clickElement(By.xpath(String.format(clickForJSSpecificButton, "Prompt")));
    }

    public void alert_acceptAlert() {
        switchToAlertPopUp().accept();
    }

    public void confirm_clickCancelButton() {
        switchToAlertPopUp().dismiss();
    }

    public void prompt_fillTextInPromptPopUp(String text) {
        switchToAlertPopUp().sendKeys(text);
        alert_acceptAlert();
    }

    public String getTextFromAlert() {
        return getAlertText();
    }

    public String getResult() {
        return findElement(result).getText();
    }
}
