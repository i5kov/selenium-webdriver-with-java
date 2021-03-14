package key_presses;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.*;

public class KeyPressesTests extends BaseTest {

    @Test
    public void testVerifyBackSpaceIsPressed() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPressesLink();
        assertFalse(keyPressesPage.isResultDisplayed(), "Result filed is displayed.");
        keyPressesPage.fillInputField("A" + Keys.BACK_SPACE);
        assertTrue(keyPressesPage.isResultDisplayed(), "Result field is not displayed.");
        assertEquals(keyPressesPage.getResultText(), "You entered: BACK_SPACE", "Result text is not correct");
    }
}
