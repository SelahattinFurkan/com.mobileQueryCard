package Page;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }


    @FindBy(xpath = "(//android.view.View)[6]")
    public WebElement categoryPageTitle;

    @FindBy(xpath = "(//android.view.View)[10]")
    public WebElement productName;
}
