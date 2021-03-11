package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage extends BasePage {

    private final By dropdown = By.cssSelector("#dropdown");

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void selectOptionByVisibleText(String text) {
        getDropdownElement(dropdown).selectByVisibleText(text);
    }

    public List<String> getSelectedOption() {
        List<WebElement> allSelectedOptions = getDropdownElement(dropdown).getAllSelectedOptions();
        return allSelectedOptions
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}
