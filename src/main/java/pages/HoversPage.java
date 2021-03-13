package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HoversPage extends BasePage {

    private final By figure = By.cssSelector(".figure");
    private final By captionTitle = By.cssSelector(".figcaption h5");
    private final By captionLink = By.cssSelector(".figcaption a");

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    public void hoverOverFigure(int figureIndex) {
        WebElement figureElement = getElementByIndex(figureIndex, figure);
        actions().moveToElement(figureElement).perform();
    }

    public boolean isCaptionDisplayed(int figureIndex) {
        String captionSelector = String.format("//h5[contains(text(), 'user%d')]/parent::div", figureIndex);
        return findElement(By.xpath(captionSelector)).isDisplayed();
    }

    public String getCaptionTitle(int figureIndex) {
        WebElement figCaptionTitle = getElementByIndex(figureIndex, captionTitle);
        return figCaptionTitle.getText();
    }

    public String getCaptionLink(int figureIndex) {
        WebElement figCaptionLink = getElementByIndex(figureIndex, captionLink);
        return figCaptionLink.getAttribute("href");
    }

    private WebElement getElementByIndex(int index, By selector) {
        return findElements(selector).get(index - 1);
    }
}
