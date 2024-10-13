package stepdefinitions;

import io.cucumber.java.en.Given;

import static utilities.Driver.getAppiumDriver;

public class baslangıc {

    @Given("User makes driver adjustments")
    public void user_makes_driver_adjustments() {
        getAppiumDriver();
    }
}
