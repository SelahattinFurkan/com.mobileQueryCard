package Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class US_24 {

    public static <MobileElement> void main(String[] args) {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("deviceName", "emulator-5554");
            caps.setCapability("browserName", "Chrome"); // If it's a web test
            caps.setCapability("chromedriverExecutable", "path_to_chromedriver"); // Ensure correct version of chromedriver

            // Initialize Appium Driver
            AppiumDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

            // Navigate to the payment page
            driver.get("https://querycart.com/#/home");

            // Log in as an existing user (elcin.manager@querycart.com)
            WebElement emailField = driver.findElement(By.id("login-email"));
            emailField.sendKeys("elcin.manager@querycart.com");

            WebElement passwordField = driver.findElement(By.id("login-password"));
            passwordField.sendKeys("Query.71024");

            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();

            // Navigate to the Payment Information page
            WebElement paymentInformationLink = driver.findElement(By.xpath("//a[text()='Payment Information']"));
            paymentInformationLink.click();

            // Select Payment Method
            WebElement paymentDropdown = driver.findElement(By.id("payment-method-dropdown"));
            paymentDropdown.click();

            // Select Stripe from dropdown
            WebElement stripeOption = driver.findElement(By.xpath("//option[@value='stripe']"));
            stripeOption.click();

            // Enter Stripe card details
            WebElement cardNumberField = driver.findElement(By.name("cardnumber"));
            cardNumberField.sendKeys("4242424242424242");

            WebElement expiryDateField = driver.findElement(By.name("exp-date"));
            expiryDateField.sendKeys("12/34");

            WebElement cvcField = driver.findElement(By.name("cvc"));
            cvcField.sendKeys("123");

            // Confirm the order
            WebElement confirmOrderButton = driver.findElement(By.id("confirm-order-button"));
            confirmOrderButton.click();

            // Verify confirmation message
            WebElement confirmationMessage = driver.findElement(By.id("order-confirmation-message"));
            if (confirmationMessage.isDisplayed()) {
                System.out.println("Order confirmed successfully!");
            }

            // View Order Details and Invoice
            WebElement orderDetailsButton = driver.findElement(By.id("view-order-details"));
            orderDetailsButton.click();

            WebElement invoiceButton = driver.findElement(By.id("view-invoice"));
            invoiceButton.click();

            // Continue shopping

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}

