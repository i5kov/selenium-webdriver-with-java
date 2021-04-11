package context_menu;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTest {

    @Test
    public void testRightClickingOnElement() {
        String expectedText = "You selected a context menu";
        ContextMenuPage contextMenuPage = homePage.clickContextMenuLink();
        contextMenuPage.rightClick();
        assertEquals(contextMenuPage.getTextFromAlert(), expectedText, "Alert text is not correct.");
    }

}
