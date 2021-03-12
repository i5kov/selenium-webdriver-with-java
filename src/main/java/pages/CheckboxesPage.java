package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPage extends BasePage {

    private final By checkboxes = By.cssSelector("#checkboxes input");

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getAllCheckboxes() {
        return findElements(checkboxes);
    }

    public boolean isElementSelected(int element) {
        List<WebElement> allCheckboxes = getAllCheckboxes();
        return allCheckboxes.get(element - 1).isSelected();
    }

}
