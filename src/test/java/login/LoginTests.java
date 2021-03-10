package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest {

    private static final String USERNAME = "tomsmith";

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        loginPage.fillUsername(USERNAME);
        loginPage.fillPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickSubmitButton();
        String successfulLoginMessage = secureAreaPage.getSuccessfulLoginMessage();
        assertTrue(successfulLoginMessage.contains("You logged into a secure area!"));
    }
}
