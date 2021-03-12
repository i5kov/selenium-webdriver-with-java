package checkboxes;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CheckboxesPage;

import static org.testng.Assert.assertTrue;

public class CheckboxesTests extends BaseTest {

    @Test
    public void testWhetherElementIsSelected() {
        CheckboxesPage checkboxesPage = homePage.clickCheckboxesLink();
        boolean isSecondCheckboxSelected = checkboxesPage.isElementSelected(2);
        assertTrue(isSecondCheckboxSelected, "Element is not checked!");
    }

}
