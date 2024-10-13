package Page;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US26_WebElement {

    public US26_WebElement(){

        PageFactory.initElements(Driver.getAppiumDriver(),this);
    }

    @FindBy(xpath = "//*[@content-desc='Wishlist']")
    public WebElement wishList;

    @FindBy(xpath = "//*[@content-desc='*Use Email Instead']")
    public WebElement userEmailInstad;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement emailTextBoxe;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement passwordTextBoxe;

    @FindBy(xpath = "(//*[@content-desc='Sign In'])[2]")
    public WebElement SignInButon;

    @FindBy(xpath = "(//*[@class='android.view.View'])[7]")
    public WebElement oneProductsFound;
















}
