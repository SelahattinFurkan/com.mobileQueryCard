package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;
import utilities.ReusableMethods;

public class CommonSteps {

    @Given("Launch the app and navigate to the homepage.")
    public void launch_the_app_and_navigate_to_the_homepage() {
        Driver.getAppiumDriver();
        ReusableMethods.wait(5);
    }
}
