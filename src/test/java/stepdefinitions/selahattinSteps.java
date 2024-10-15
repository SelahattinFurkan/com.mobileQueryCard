package stepdefinitions;

import Page.US_13_14_15;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;

import static utilities.Driver.getAppiumDriver;

public class selahattinSteps {
    US_13_14_15 us = new US_13_14_15();
    @Given("User makes driver adjustments")
    public void user_makes_driver_adjustments() {
        getAppiumDriver();
        ReusableMethods.wait(6);
        Actions actions = new Actions(getAppiumDriver());
    }

    @Given("User clicks the button with description {string}")
    public void user_clicks_the_button_with_description(String string) {
       ReusableMethods.scrollWithUiScrollableContentDesc(string);

    }
    @Given("User clicks the button email and sendKeys {string}")
    public void user_clicks_the_button_email_and_send_keys(String string2) {
        us.emailTextBoxe.click();
    us.emailTextBoxe.sendKeys(string2);
    }
    @Given("User clicks the button with description Password and sendKeys {string}")
    public void user_clicks_the_button_with_description_and_send_keys(String password2) {
        us.passwordTextBoxe.click();
    us.passwordTextBoxe.sendKeys(password2);
           }
    @Given("User clicks the button Sign In")
    public void user_clicks_the_button_sign_ın() {
       us.SignInButon.click();
    }

    @Given("In the body section, the {string} category and subcategories are visible and must be active.")
    public void ın_the_body_section_the_category_and_subcategories_are_visible_and_must_be_active(String string) {

    }
    @Given("Click on the {string} logo")
    public void click_on_the_logo(String string) {

    }
    @Given("Addition to the liked list")
    public void addition_to_the_liked_list() {

    }
    @Given("Product imaging is done")
    public void product_imaging_is_done() {

    }
    @Given("Add to cart")
    public void add_to_cart() {

    }
    @Given("Filter icons must be visible and active")
    public void filter_icons_must_be_visible_and_active() {

    }

}
