package Page;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class US_13_14_15 {
    public US_13_14_15() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement emailTextBoxe;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement passwordTextBoxe;

    @FindBy(xpath = "(//*[@content-desc='Sign In'])[2]")
    public WebElement SignInButon;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Men\"]")
    public WebElement menCategories;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Adidas 3-Stripes Cushioned Crew Socks\n" +
            "0 (0  Reviews)\n" +
            "$15.00\"]/android.widget.ImageView")
    public WebElement like;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Adidas 3-Stripes Cushioned Crew Socks\n" +
            "0 (0  Reviews)\n" +
            "$15.00\"]")
    public WebElement socks;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Black\"]")
    public WebElement blackSocks;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Add To Cart\"]")
    public WebElement addToCartButon;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]")
    public WebElement back;


}
