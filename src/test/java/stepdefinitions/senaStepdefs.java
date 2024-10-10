package stepdefinitions;

import io.cucumber.java.en.Then;
import utilities.ReusableMethods;

public class senaStepdefs {
    @Then("apk cihaza yuklenir")
    public void apk_cihaza_yuklenir() {
        ReusableMethods.apkYukle();
    }
}
