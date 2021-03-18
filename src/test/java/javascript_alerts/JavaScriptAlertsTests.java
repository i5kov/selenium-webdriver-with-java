package javascript_alerts;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

import static org.testng.Assert.assertEquals;

public class JavaScriptAlertsTests extends BaseTest {

    private static final String INCORRECT_ALERT_TEXT = "Text of alert pop up is not correct";
    private static final String INCORRECT_RESULT_TEXT = "Result text is not correct.";

    @Test
    public void testVerifyResultAfterClickingForJSAlertsButton() {
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavascriptAlertsLink();
        javaScriptAlertsPage.clickForJSAlertButton();
        assertEquals(javaScriptAlertsPage.getTextFromAlert(), "I am a JS Alert", INCORRECT_ALERT_TEXT);
        javaScriptAlertsPage.alert_acceptAlert();
        String actualResult = javaScriptAlertsPage.getResult();
        assertEquals(actualResult, "You successfully clicked an alert", INCORRECT_RESULT_TEXT);
    }

    @Test
    public void testVerifyResultAfterClickCancelButtonInConfirmPopUp() {
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavascriptAlertsLink();
        javaScriptAlertsPage.clickForJSConfirmButton();
        assertEquals(javaScriptAlertsPage.getTextFromAlert(), "I am a JS Confirm", INCORRECT_ALERT_TEXT);
        javaScriptAlertsPage.confirm_clickCancelButton();
        assertEquals(javaScriptAlertsPage.getResult(), "You clicked: Cancel", INCORRECT_RESULT_TEXT);
    }

    @Test
    public void testVerifyResultAfterEnteringTextAndClickOnInPromptPopUp() {
        String textForFill = "TEST 123";
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavascriptAlertsLink();
        javaScriptAlertsPage.clickForJSPromptButton();
        assertEquals(javaScriptAlertsPage.getTextFromAlert(), "I am a JS prompt", INCORRECT_ALERT_TEXT);
        javaScriptAlertsPage.prompt_fillTextInPromptPopUp(textForFill);
        assertEquals(javaScriptAlertsPage.getResult(), "You entered: " + textForFill, INCORRECT_RESULT_TEXT);
    }

}
