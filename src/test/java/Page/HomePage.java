package Page;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }


    @FindBy(xpath = "(//android.view.View)[6]")
    public WebElement PageTitle;

    @FindBy(xpath = "(//android.view.View)[10]")
    public WebElement productName;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Back to sign in\"]")
    public WebElement backToSignInButton;

    @FindBy(xpath = "//android.widget.EditText")
    public WebElement emailBox;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Success\n"+ "The User verify is successfully.\"]")
    public WebElement successNotification;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Reset Password\"]")
    public WebElement resetPassPageTitle;



}
