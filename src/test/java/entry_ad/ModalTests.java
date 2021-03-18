package entry_ad;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.EntryAdPage;

import static org.testng.Assert.*;

public class ModalTests extends BaseTest {

    @Test
    public void testClosingOfModal() {
        EntryAdPage entryAdPage = homePage.clickEntryAdLink();
        assertTrue(entryAdPage.isModalDisplayed(), "Modal window is not displayed.");
        assertEquals(entryAdPage.getModalTitle(), "THIS IS A MODAL WINDOW", "Modal title is not correct.");
        entryAdPage.closeModal();
        assertFalse(entryAdPage.isModalDisplayed(), "Modal window is not closed.");
    }

}
