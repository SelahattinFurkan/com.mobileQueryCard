package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.ReusableMethods;

import static utilities.Driver.getAppiumDriver;

public class selahattinSteps {
    @Given("User makes driver adjustments")
    public void user_makes_driver_adjustments() {
        getAppiumDriver();
        ReusableMethods.wait(10);

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
