package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsPage extends BasePage {

    private static final By addElementButton = By.xpath("//button[text()='Add Element']");
    private static final By deleteButton = By.cssSelector("button.added-manually");

    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageDisplayed() {
        return isElementDisplayed(addElementButton);
    }

    public void clickAddElementButton() {
        clickElement(addElementButton);
    }

    public void clickDeleteButton() {
        if (isElementDisplayed(deleteButton)) {
            clickElement(deleteButton);
        }
    }

    public boolean isDeleteButtonDisplayed() {
        return isElementDisplayed(deleteButton);
    }
}
