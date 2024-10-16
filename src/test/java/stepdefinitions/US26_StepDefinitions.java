package stepdefinitions;

import Page.US26_WebElement;
import Page.US27_WebElement;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class US26_StepDefinitions {

    US26_WebElement user =new US26_WebElement();
    US27_WebElement us27 =new US27_WebElement();

    public static String getTexte;

    public static AppiumDriver driver;
    @When("The user opens the mobile app")
    public void the_user_opens_the_mobile_app() throws InterruptedException {

            driver= Driver.getAppiumDriver();
            Thread.sleep(7);



    }
    @When("The user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() throws InterruptedException {
        ReusableMethods.waitForElementAndClick(user.wishList);
        ReusableMethods.waitForElementAndClick(user.userEmailInstad);

        int attempts = 0;
        while(attempts < 3) {
            try {
                ReusableMethods.waitForElementAndClick(user.emailTextBoxe);
                ReusableMethods.waitForElementAndSendkey(user.emailTextBoxe, ConfigReader.getProperty("emailAli"));
                break;
            } catch(StaleElementReferenceException e) {
                attempts++;
            }
        }

        attempts=0;
        while(attempts < 3) {
            try {
                ReusableMethods.waitForElementAndClick(user.passwordTextBoxe);
                ReusableMethods.waitForElementAndSendkey(user.passwordTextBoxe, ConfigReader.getProperty("password"));
                break;
            } catch(StaleElementReferenceException e) {
                attempts++;
            }
        }

        ReusableMethods.clickAtCoordinatesW3C(233,1858);

        ReusableMethods.waitForElementAndClick(user.SignInButon);




    }
    @When("The user navigates to the Wishlist section")
    public void the_user_navigates_to_the_wishlist_section() {
        ReusableMethods.waitForElementAndClick(user.wishList);
        Assert.assertTrue(user.wishList.isDisplayed());

    }


    @When("clicks the hollow heart icon to add the first product to favorites")
    public void clicks_the_hollow_heart_icon_to_add_the_product_to_favorites() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), Duration.ofSeconds(20));
        WebElement enableElement = wait.until(ExpectedConditions.elementToBeClickable(user.wishList));
        enableElement.isDisplayed();
        ReusableMethods.clickAtCoordinatesW3C(454,1371);

    }

    @When("the user confirms that it is a product in their wishlist")
    public void the_user_confirms_that_it_is_a_product_in_their_wishlist() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement enableElement = wait.until(ExpectedConditions.elementToBeClickable(user.oneProductsFound));
        enableElement.isDisplayed();
        String contentDesc = user.oneProductsFound.getAttribute("content-desc");;

        contentDesc=contentDesc.replaceAll("\\D","");
        System.out.println("urun adedi= "+contentDesc);

        int contentDescInt= Integer.parseInt(contentDesc);
        Assert.assertEquals(1,contentDescInt);

        WebElement enableElement1 = wait.until(ExpectedConditions.elementToBeClickable(user.wishList));
        enableElement1.isDisplayed();
        ReusableMethods.clickAtCoordinatesW3C(454,480);



    }

    @When("user clicks {string}")
    public void user_clicks(String button) {


        switch (button){

            case "Wishlist" :
                ReusableMethods.waitForElementAndClick(user.wishList);
                break;

            case "premierProduit" :
                ReusableMethods.waitForElementAndClick(user.premierProduit);
                break;

            case "favorite" :
                ReusableMethods.scrollWithUiScrollableContentDesc("Favorite");
                ReusableMethods.waitForElementAndClick(user.favorite);
                break;

            case "Go To Shopping" :
                ReusableMethods.waitForElementAndClick(us27.goToShopping);
                break;
        }

    }


    @When("{int} sn wait")
    public void sn_wait(Integer int1) throws InterruptedException {
       Thread.sleep(int1);
    }

    @When("user comes back")
    public void user_comes_back() {
       ReusableMethods.waitForElementAndClick(user.back);
    }

    @When("user sees the Cart icon on the home page")
    public void user_sees_the_cart_icon_on_the_home_page() {

        ReusableMethods.waitForElementIsDisplayed(us27.cart);
        Assert.assertTrue(us27.cart.isDisplayed());

    }





}
