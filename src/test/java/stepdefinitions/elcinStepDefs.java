package stepdefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class elcinStepDefs {


    AppiumDriver<MobileElement> driver;

    @Given("the user is logged in with {string} and {string}")
    public void the_user_is_logged_in(String email, String password) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("chromedriverExecutable", "path_to_chromedriver");

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.get("https://querycart.com/#/home");

        // Login
        WebElement emailField = driver.findElement(By.id("login-email"));
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.id("login-password"));
        passwordField.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @When("the user navigates to the Payment Information page")
    public void the_user_navigates_to_payment_information_page() {
        WebElement paymentInformationLink = driver.findElement(By.xpath("//a[text()='Payment Information']"));
        paymentInformationLink.click();
    }

    @When("the user selects {string} as the payment method")
    public void the_user_selects_payment_method(String paymentMethod) {
        WebElement paymentDropdown = driver.findElement(By.id("payment-method-dropdown"));
        paymentDropdown.click();

        WebElement paymentOption = driver.findElement(By.xpath("//option[@value='" + paymentMethod.toLowerCase() + "']"));
        paymentOption.click();
    }

    @When("the user enters card details {string}, {string}, {string}")
    public void the_user_enters_card_details(String cardNumber, String expiryDate, String cvc) {
        WebElement cardNumberField = driver.findElement(By.name("cardnumber"));
        cardNumberField.sendKeys(cardNumber);

        WebElement expiryDateField = driver.findElement(By.name("exp-date"));
        expiryDateField.sendKeys(expiryDate);

        WebElement cvcField = driver.findElement(By.name("cvc"));
        cvcField.sendKeys(cvc);
    }

    @When("the user clicks on the Confirm Order button")
    public void the_user_clicks_on_confirm_order() {
        WebElement confirmOrderButton = driver.findElement(By.id("confirm-order-button"));
        confirmOrderButton.click();
    }

    @Then("the order confirmation message should be displayed")
    public void the_order_confirmation_message_should_be_displayed() {
        WebElement confirmationMessage = driver.findElement(By.id("order-confirmation-message"));
        assert confirmationMessage.isDisplayed();
        System.out.println("Order confirmed successfully!");
    }

    @Then("the user should be able to view order details and invoice")
    public void the_user_should_view_order_details_and_invoice() {
        WebElement orderDetailsButton = driver.findElement(By.id("view-order-details"));
        orderDetailsButton.click();

        WebElement invoiceButton = driver.findElement(By.id("view-invoice"));
        invoiceButton.click();
    }

    @Then("the user should be able to continue shopping")
    public void the_user_should_continue_shopping() {
        WebElement continueShoppingButton = driver.findElement(By.id("continue-shopping"));
        continueShoppingButton.click();
        driver.quit();


            AppiumDriver<MobileElement> driver;


        @Given("the user is logged in with email {string} and password {string}")
        public void the_user_is_logged_in (String email, String password) throws Exception {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("deviceName", "emulator-5554");
            caps.setCapability("browserName", "Chrome");
            caps.setCapability("chromedriverExecutable", "path_to_chromedriver");

            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.get("https://querycart.com/#/home");

            // Login
            WebElement emailField = driver.findElement(By.id("login-email"));
            emailField.sendKeys(email);

            WebElement passwordField = driver.findElement(By.id("login-password"));
            passwordField.sendKeys(password);

            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();
        }

        @When("the user navigates to the Order History page")
        public void the_user_navigates_to_the_order_history_page () {
            WebElement dashboardLink = driver.findElement(By.xpath("//a[text()='Dashboard']"));
            dashboardLink.click


        }
    }

}





