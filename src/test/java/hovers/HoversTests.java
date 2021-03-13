package hovers;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoversTests extends BaseTest {

    @Test
    public void testHoversOverSecondFigure() {
        int elementIndex = 2;
        String expectedCaptionText = String.format("name: user%d", elementIndex);
        String expectedLinkHrefText = String.format("/users/%d", elementIndex);

        HoversPage hoversPage = homePage.clickHoversLink();
        hoversPage.hoverOverFigure(elementIndex);
        assertTrue(hoversPage.isCaptionDisplayed(elementIndex), String.format("Caption %d is not displayed.", elementIndex));
        assertEquals(hoversPage.getCaptionTitle(elementIndex), expectedCaptionText, "Caption text is not correct.");
        assertTrue(hoversPage.getCaptionLink(elementIndex).endsWith(expectedLinkHrefText), "Caption link is not correct");
    }

}
