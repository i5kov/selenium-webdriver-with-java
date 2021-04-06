package add_remove_elements;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AddRemoveElementsPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class AddRemoveElementsTests extends BaseTest {

    @Test
    public void testVerifyElementIsAddedOnThePage() {
        AddRemoveElementsPage addRemoveElementsPage = homePage.clickAddRemoveElementsLink();
        assertTrue(addRemoveElementsPage.isPageDisplayed(), "Add/Remove Elements page was not displayed!");
        addRemoveElementsPage.clickAddElementButton();
        assertTrue(addRemoveElementsPage.isDeleteButtonDisplayed(), "Element was not added on the page!");
    }

    @Test
    public void testVerifyElementIsSuccessfullyDeleteFromThePage() {
        AddRemoveElementsPage addRemoveElementsPage = homePage.clickAddRemoveElementsLink();
        assertTrue(addRemoveElementsPage.isPageDisplayed(), "Add/Remove Elements page was not displayed!");
        addRemoveElementsPage.clickAddElementButton();
        assertTrue(addRemoveElementsPage.isDeleteButtonDisplayed(), "Element was not added on the page!");
        addRemoveElementsPage.clickDeleteButton();
        assertFalse(addRemoveElementsPage.isDeleteButtonDisplayed(), "Delete button was not removed from the page!");
    }

}
