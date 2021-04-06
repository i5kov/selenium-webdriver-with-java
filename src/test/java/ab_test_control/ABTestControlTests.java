package ab_test_control;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ABTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ABTestControlTests extends BaseTest {

    @Test
    public void testVerifyPageTitleTextIsCorrect() {
        ABTest abTestingPage = homePage.clickABTestingLink();
        assertTrue(abTestingPage.isABTestPageDisplayed(), "AB Test Page was not displayed!");
        String pageTitleText = abTestingPage.getPageTitleText();
        assertEquals(pageTitleText, "A/B Test Control", "Page title is not correct!");
    }
}
