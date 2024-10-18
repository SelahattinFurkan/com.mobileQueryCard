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

    @FindBy(xpath = "//*[@content-desc='M']")
    public WebElement SizeM;

    @FindBy(xpath = "//*[@content-desc='Add To Cart']")
    public WebElement addToCart;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[13]")
    public WebElement shoppingCartDansLeProduit;

    @FindBy(xpath = "//*[@content-desc='Remove']")
    public WebElement remove;














}
