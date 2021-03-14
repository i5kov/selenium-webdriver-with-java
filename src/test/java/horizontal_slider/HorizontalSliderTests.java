package horizontal_slider;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTest {

    @Test
    public void testVerifyHorizontalSliderValueIsFour() {
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliderLink();
        horizontalSliderPage.clickOnSlider();
        horizontalSliderPage.moveSliderTo(4);
        int sliderRangeResult = Integer.parseInt(horizontalSliderPage.getSliderRangeResult());
        assertEquals(sliderRangeResult, 4, "Slider range result is not correct.");
    }
}
