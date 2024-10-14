package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class senaPage {

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Profile\"]")
    public WebElement profileButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Sign In\"]")
    public WebElement profileSignIn;

    @FindBy(xpath = "//android.view.View[@content-desc=\"*Use Email Instead\"]")
    public WebElement useEmailText;

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[1]")
    public WebElement boxEmail;

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    public WebElement boxPassword;

    @FindBy(xpath = "(//android.view.View[@content-desc=\"Sign In\"])[2]")
    public WebElement buttonSignIn;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Flower Print Foil T-shirt\n" +
            "0 (0  Reviews)\n" +
            "$65.00\"]")
    public WebElement tShirtProduit;

    @FindBy(xpath = "//android.view.View[@content-desc=\"M\"]")
    public WebElement tShirtSize;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Add To Cart\"]")
    public WebElement buttonAddtoCart;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    public WebElement addToCart;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Proceed to Checkout\"]")
    public WebElement buttonCheckOut;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Home\"]")
    public WebElement pageHome;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Delivery\"]")
    public WebElement delivery;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Pick Up\"]")
    public WebElement pickUp;

    @FindBy(xpath = " //android.widget.ImageView[@content-desc=\"sena\n" +
            "+26212345678910\n" +
            "    senasena@gmail.com\n" +
            "    AmericanSamoa,23456\n" +
            "    dghjjjj\"]")
    public WebElement address;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Edit\"]")
    public WebElement buttonEdit;

    @FindBy(xpath = "//android.view.View[@content-desc=\"sena\n" +
            "+26212345678910\n" +
            "senasena@gmail.com\n" +
            "  American Samoa,  23456\n" +
            "dghjjjj\"]/android.widget.ImageView[1]")
    public WebElement buttonEdit2;

    @FindBy(xpath = "(//android.view.View[@content-desc=\"Update Address\"])[2]")
    public WebElement buttonUpdateAddress;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Success\n" +
            "    Address Updated Successfully!\"]")
    public WebElement editSuccess;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Add New Address\"]")
    public WebElement addNewAddress;




}
