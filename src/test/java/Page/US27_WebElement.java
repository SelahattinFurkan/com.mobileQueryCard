package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US27_WebElement {

    public US27_WebElement(){

        PageFactory.initElements(Driver.getAppiumDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[3]")
    public WebElement cart;

    @FindBy(xpath = "//*[@content-desc='Shopping Cart']")
    public WebElement shoppingCart;

    @FindBy(xpath = "//*[@content-desc='Go to Shopping']")
    public WebElement goToShopping;

    @FindBy(xpath = "//*[@content-desc='Home']")
    public WebElement home;








}
