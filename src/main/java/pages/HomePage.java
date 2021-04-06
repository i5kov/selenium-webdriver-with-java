package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public ABTest clickABTestingLink() {
        clickLinkByText("A/B Testing");
        return new ABTest(driver);
    }

    public AddRemoveElementsPage clickAddRemoveElementsLink() {
        clickLinkByText("Add/Remove Elements");
        return new AddRemoveElementsPage(driver);
    }

    public LoginPage clickFormAuthenticationLink() {
        clickLinkByText("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdownLink() {
        clickLinkByText("Dropdown");
        return new DropdownPage(driver);
    }

    public CheckboxesPage clickCheckboxesLink() {
        clickLinkByText("Checkboxes");
        return new CheckboxesPage(driver);
    }

    public HoversPage clickHoversLink() {
        clickLinkByText("Hovers");
        return new HoversPage(driver);
    }

    public FileUploadPage clickFileUploadLink() {
        clickLinkByText("File Upload");
        return new FileUploadPage(driver);
    }

    public KeyPressesPage clickKeyPressesLink() {
        clickLinkByText("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderLink() {
        clickLinkByText("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public JavaScriptAlertsPage clickJavascriptAlertsLink() {
        clickLinkByText("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    public EntryAdPage clickEntryAdLink() {
        clickLinkByText("Entry Ad");
        return new EntryAdPage(driver);
    }

    public ContextMenuPage clickContextMenuLink() {
        clickLinkByText("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditorLink() {
        clickLinkByText("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }
}