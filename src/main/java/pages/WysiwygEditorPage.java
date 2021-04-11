package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class WysiwygEditorPage extends BasePage {

    private final String frameId = "mce_0_ifr";
    private final By textField = By.cssSelector("#tinymce");
    private final By increaseIndentButton = By.cssSelector("button[title='Increase indent']");
    private final By alignCenterButton = By.cssSelector("button[title='Align center']");
    private final By textParagraph = By.cssSelector("#tinymce p");
    private final By pageHeader = By.cssSelector("h3");
    private final By wysiwygEditor = By.cssSelector(".example");

    public WysiwygEditorPage(WebDriver driver) {
        super(driver);
    }

    public void clearText() {
        switchToFrame(frameId);
        findElement(textField).clear();
        switchToParentFrame();
    }

    public void fillText(String text) {
        switchToFrame(frameId);
        findElement(textField).sendKeys(text);
        switchToParentFrame();
    }

    public void clickIncreaseIndentButton(int clicksTimes) {
        for (int i = 0; i < clicksTimes; i++) {
            clickElement(increaseIndentButton);
        }
    }

    public void clickAlignCenterButton() {
        clickElement(alignCenterButton);
    }

    public String getIndentOfElement() {
        return getStyleAttributeOfParagraph();
    }

    public String getTextAlignOfText() {
        return getStyleAttributeOfParagraph();
    }

    public String getText() {
        switchToFrame(frameId);
        String text = getTextFromElement(textParagraph);
        switchToParentFrame();
        return text;
    }

    public void verifyWysiwygEditorPageIsDisplayed() {
        assertTrue(isElementDisplayed(pageHeader), "Page header was not displayed!");
        assertTrue(isElementDisplayed(wysiwygEditor), "WYSIWYG Editor was not displayed!");
    }

    private String getStyleAttributeOfParagraph() {
        switchToFrame(frameId);
        String styleAttribute = findElement(textParagraph).getAttribute("style");
        switchToParentFrame();
        return styleAttribute;
    }
}
