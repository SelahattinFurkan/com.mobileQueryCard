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







}
