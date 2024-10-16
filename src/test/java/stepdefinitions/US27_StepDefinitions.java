package stepdefinitions;

import Page.US26_WebElement;
import Page.US27_WebElement;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.When;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import utilities.ReusableMethods;

public class US27_StepDefinitions {

    US26_WebElement user =new US26_WebElement();
    US27_WebElement us27 =new US27_WebElement();

    public static String getTexte;

    public static AppiumDriver driver;
    @When("user clicks shopping cart")
    public void user_clicks_shopping_cart() {

        ReusableMethods.waitForElementAndClick(us27.cart);


    }
    @When("shopping cart page opens")
    public void shopping_cart_page_opens() {

        String contentDesc = us27.shoppingCart.getAttribute("content-desc");
        Assert.assertEquals("Shopping Cart",contentDesc);

    }

    @When("user confirms return to homepage")
    public void user_confirms_return_to_homepage() {
        String contentDesc = us27.home.getAttribute("content-desc");
        Assert.assertEquals("Home",contentDesc);
    }


}
