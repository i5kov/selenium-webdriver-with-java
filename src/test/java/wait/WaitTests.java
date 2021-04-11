package wait;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest {

    @Test
    public void testVerifyElementIsHidden() {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        dynamicLoadingPage.clickExampleLinkByNumber(1);
        dynamicLoadingPage.clickStartButton();
        assertEquals(dynamicLoadingPage.getLoadedText(), "Hello World!", "Loaded text not correct!");
    }

}
