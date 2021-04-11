package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContextMenuPage extends BasePage {

    private final By hotspotField = By.cssSelector("#hot-spot");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void rightClick() {
        actions().contextClick(findElement(hotspotField)).perform();
    }

    public String getTextFromAlert() {
        return getAlertText();
    }
}
