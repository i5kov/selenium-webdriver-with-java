package file_upload;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTest {

    @Test
    public void testVerifyFileUploadSuccessfully() {
        String resourceForUpload = "chromedriver.exe";
        String absolutePath = String.format("C:\\iPetkov\\repositories\\selenium-webdriver-with-java\\resources\\%s", resourceForUpload);
        FileUploadPage fileUploadPage = homePage.clickFileUploadLink();
        fileUploadPage.uploadFile(absolutePath);
        assertEquals(fileUploadPage.getFileUploadedText(), "File Uploaded!", "File uploaded text is not displayed.");
        assertEquals(fileUploadPage.getUploadedFileName(), resourceForUpload,
                String.format("%s is not uploaded", resourceForUpload));
    }


}
