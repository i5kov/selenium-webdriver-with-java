package frames;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

import static org.testng.Assert.assertEquals;

public class FrameTests  extends BaseTest {

    private static final String TEXT_FOR_TEST = "My IFRAME Test";

    @Test
    public void testIncreaseIndentOfTextThreeTimes() {
        WysiwygEditorPage wysiwygEditorPage = homePage.clickWysiwygEditorLink();
        wysiwygEditorPage.verifyWysiwygEditorPageIsDisplayed();
        wysiwygEditorPage.clearText();
        wysiwygEditorPage.fillText(TEXT_FOR_TEST);
        wysiwygEditorPage.clickIncreaseIndentButton(3);
        assertEquals(wysiwygEditorPage.getText(), TEXT_FOR_TEST, "Filled text in editor is not correct!");
        assertEquals(wysiwygEditorPage.getIndentOfElement(), "padding-left: 120px;", "Indent of text is not correct!");
    }

    @Test
    public void testVerifyFilledTextIsCentered() {
        WysiwygEditorPage wysiwygEditorPage = homePage.clickWysiwygEditorLink();
        wysiwygEditorPage.verifyWysiwygEditorPageIsDisplayed();
        wysiwygEditorPage.clearText();
        wysiwygEditorPage.fillText(TEXT_FOR_TEST);
        wysiwygEditorPage.clickAlignCenterButton();
        String textAlignOfText = wysiwygEditorPage.getTextAlignOfText();
        assertEquals(textAlignOfText, "text-align: center;", "Text was not centered");
    }
}
