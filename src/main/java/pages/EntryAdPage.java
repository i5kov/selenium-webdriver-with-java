package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage extends BasePage {

    private final By modal = By.cssSelector("#modal");
    private final By modalTitle = By.cssSelector(".modal-title h3");
    private final By modalClose = By.cssSelector(".modal-footer p");


    public EntryAdPage(WebDriver driver) {
        super(driver);
    }

    public boolean isModalDisplayed() {
        return findElement(modal).isDisplayed();
    }

    public String getModalTitle() {
        return findElement(modalTitle).getText();
    }

    public void closeModal() {
        clickElement(modalClose);
    }
}
