package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage extends BasePage {

    private final By startButton = By.cssSelector("#start button");
    private final By loadedText = By.id("finish");
    private final By loadingBar = By.id("loading");
    private final WebDriverWait wait;

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 5);
    }

    public void clickExampleLinkByNumber(int number) {
        clickElement(By.xpath(String.format("//a[contains(@href, %s)]", ""+number)));
    }

    public void clickStartButton() {
        clickElement(startButton);
        wait.until(ExpectedConditions.invisibilityOf(findElement(loadingBar)));
    }

    public String getLoadedText() {
        return findElement(loadedText).getText();
    }

}
