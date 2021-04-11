package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage extends BasePage {

    private final By sliderContainer = By.cssSelector(".sliderContainer");
    private final By slider = By.cssSelector(".sliderContainer input");
    private final By sliderResult = By.cssSelector("#range");

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSlider() {
        clickElement(sliderContainer);
    }

    public void moveSliderTo(int number) {
        for (int i = 0; i < number * 2; i++) {
            findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getSliderRangeResult() {
        return getTextFromElement(sliderResult);
    }
}
