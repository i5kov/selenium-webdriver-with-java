package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class DropdownTests extends BaseTest {

    @Test
    public void testVerifySelectedElement() {
        String optionForSelect = "Option 2";
        DropdownPage dropdownPage = homePage.clickDropdownLink();
        dropdownPage.selectOptionByVisibleText(optionForSelect);
        List<String> selectedOption = dropdownPage.getSelectedOption();
        assertEquals(selectedOption.size(), 1, "Selected options from dropdown are more than expected!");
        assertEquals(selectedOption.get(0), optionForSelect, "Selected option is not correct!");
    }

}
