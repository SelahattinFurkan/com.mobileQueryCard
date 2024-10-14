package stepdefinitions;

import Page.senaPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.URL;

public class senaStepdefs extends senaPage {

    senaPage senaPage = new senaPage();
    private AndroidDriver driver;

    @When("The user logs in with valid login credentials.")
    public void the_user_logs_in_with_valid_login_credentials() {
        Driver.getAppiumDriver();
        ReusableMethods.wait(10);
        senaPage.profileButton.click();
        ReusableMethods.wait(2);
        senaPage.profileSignIn.click();
        ReusableMethods.wait(2);
        senaPage.useEmailText.click();
        ReusableMethods.wait(2);
        senaPage.boxEmail.sendKeys("senabetul.user@querycart.com");
        ReusableMethods.wait(2);
        senaPage.boxPassword.sendKeys("Query.71024");
        ReusableMethods.wait(2);
        senaPage.buttonSignIn.click();
        ReusableMethods.wait(2);
    }
    @When("The user clicks on the product under most popular on the home page, selects the size and adds it to the cart.")
    public void the_user_clicks_on_the_product_under_most_popular_on_the_home_page_selects_the_size_and_adds_it_to_the_cart() {
        senaPage.tShirtProduit.click();
        senaPage.tShirtSize.click();
        senaPage.buttonAddtoCart.click();
    }

    @Then("The user navigates to the Shipping Information page.")
    public void the_user_navigates_to_the_shipping_information_page() {
        senaPage.pageHome.click();
        senaPage.addToCart.click();
        senaPage.buttonCheckOut.click();
    }

    @When("Verifies that the Delivery and Pick Up buttons appear on the page.")
    public void verifies_that_the_delivery_and_pick_up_buttons_appear_on_the_page() {
        Assert.assertTrue(senaPage.delivery.isDisplayed());
        Assert.assertTrue(senaPage.pickUp.isDisplayed());
    }

    @When("Verifies that both buttons are clickable.")
    public void verifies_that_both_buttons_are_clickable() {
        Assert.assertTrue(senaPage.delivery.isEnabled());
        Assert.assertTrue(senaPage.pickUp.isEnabled());
    }

    @Then("The user clicks the Delivery button.")
    public void the_user_clicks_the_delivery_button() {
        senaPage.delivery.click();
    }
    @Then("Verify that the current address information is displayed on the page.")
    public void verify_that_the_current_address_information_is_displayed_on_the_page() {
        Assert.assertTrue(senaPage.address.isDisplayed());
    }
    @When("The user clicks Edit in the address information displayed.")
    public void the_user_clicks_edit_in_the_address_information_displayed() {
        Assert.assertTrue(senaPage.buttonEdit.isDisplayed());
        Assert.assertTrue(senaPage.buttonEdit.isEnabled());
    }
    @When("Edit and save address information.")
    public void edit_and_save_address_information() {
        senaPage.buttonEdit.click();
        senaPage.buttonEdit2.click();
        senaPage.buttonUpdateAddress.click();

    }
    @Then("Verifies that the edited address was successfully saved and displayed on the page.")
    public void verifies_that_the_edited_address_was_successfully_saved_and_displayed_on_the_page() {
       Assert.assertTrue(senaPage.editSuccess.isDisplayed());
    }
    @Then("The user clicks on the Add New Address button next to the address information.")
    public void the_user_clicks_on_the_add_new_address_button_next_to_the_address_information() {
        senaPage.addNewAddress.click();
    }
    @Then("Enters and saves new address information.")
    public void enters_and_saves_new_address_information() {

    }
    @Then("Verifies that the user's newly added address is displayed on the page.")
    public void verifies_that_the_user_s_newly_added_address_is_displayed_on_the_page() {

    }

    @Then("Verifies that the order details are displayed under the Order Summary heading at the bottom of the page.")
    public void verifies_that_the_order_details_are_displayed_under_the_order_summary_heading_at_the_bottom_of_the_page() {

    }

    @Then("Verifies that the Save & Pay button is visible and clickable on the page.")
    public void verifies_that_the_save_pay_button_is_visible_and_clickable_on_the_page() {

    }






}