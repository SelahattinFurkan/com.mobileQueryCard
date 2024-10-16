package stepdefinitions;

import Page.HomePage;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class homePageStepDefs {

    static String categoryName;
    static String popularBrandName;
    static String productName;

    HomePage homePage = new HomePage();

    @Given("Locate the {string} heading on the homepage.")
    public void locate_the_categories_heading_on_the_homepage(String text) {
        ReusableMethods.wait(2);
        ReusableMethods.scrollWithUiScrollableContentDesc(text);

    }

    @Given("Verify all the categories are visible under the Categories heading.")
    public void verify_all_the_categories_are_visible_under_the_categories_heading() throws InvalidMidiDataException {

        List<String> expectedCategoryNames = new ArrayList<>(Arrays.asList("Men", "Men Clothing", "Men T-Shirt", "Men Shorts",
                "Men Coat", "Men Suit", "Men Shoes", "Men Sneakers", "Men Classic Shoes", "Men Boots",
                "Men Casual Shoes", "Men Accessories", "Men Bags", "Men Socks", "Men Watch", "Women", "Women Clothing",
                "Woman Dresses - Skirts", "Woman T-shirt", "Woman Trousers", "Woman Coat", "Women Shoes",
                "Women Casual Shoes", "Women Classic Shoes", "Women's Boots", "Women Sneakers", "Women Accessories",
                "Women Bags", "Women Watch", "Women Jewelry", "Juniors", "Juniors Clothing", "Girl Clothes",
                "Juniors Sleepwear", "Boy Clothes", "Baby Clothes", "Juniors Shoes", "Girl Shoes",
                "Boy Shoes", "Juniors Accessories", "Juniors Bags", "Juniors Hat & Beres", "Toys"));

        List<String> actualCategoryNames = getAllCategories();

        for (int i = 0; i < actualCategoryNames.size(); i++) {
            Assert.assertEquals(expectedCategoryNames.get(i), actualCategoryNames.get(i));
        }
    }

    @Given("Select {string} category.")
    public void select_category(String assignedCategoryName) {
        categoryName = assignedCategoryName;
        selectCategory(categoryName);
    }

    @Given("Verify that the product listing for the selected category is displayed.")
    public void verify_that_the_product_listing_for_the_selected_category_is_displayed() {
        Assert.assertTrue(homePage.PageTitle.isDisplayed());
        Assert.assertEquals("Category names are not equals!", categoryName, homePage.PageTitle.getAttribute("content-desc"));

    }

    @Given("Select {string} from the category.")
    public void select_from_the_category(String expectedProductName) {
        productName = expectedProductName;
        ReusableMethods.clickWithUiScrollableDescriptionContains(expectedProductName);

    }

    @Given("Verify that the product details page for the selected product is displayed.")
    public void verify_that_the_product_details_page_for_the_selected_product_is_displayed() {

        ReusableMethods.wait(2);
        System.out.println("Content Description: " + homePage.productName.getAttribute("content-desc"));
        System.out.println("Expected Product Name: " + productName);


        Assert.assertTrue(homePage.productName.getAttribute("content-desc").contains(productName));
    }

    @Given("Locate the Popular Brands heading on the homepage.")
    public void locate_the_popular_brands_heading_on_the_homepage() throws InvalidMidiDataException {
        OptionsMet.swipe(320, 2570, 320, 70);
        ReusableMethods.wait(3);
        OptionsMet.swipe(320, 2570, 320, 70);
    }

    @Given("Verify that all popular brands are visible under the Popular Brands section.")
    public void verify_that_all_popular_brands_are_visible_under_the_popular_brands_section() throws InvalidMidiDataException {
        List<String> expectedPopularBrands = new ArrayList<>(Arrays.asList
                ("Blossom Boutique", "Nike", "Dr. Martens", "Clarks", "Converse", "The North Face",
                        "Levis", "Vans", "Red Wing", "Allen Edmonds", "Adidas", "Lesurmesure", "Harrods",
                        "US Polo", "Street Style Co.", "Urban Casuals"));

        List<String> actualPopularBrands = getAllPopularBrands();

        for (int i = 0; i < actualPopularBrands.size(); i++) {
            Assert.assertEquals(expectedPopularBrands.get(i), actualPopularBrands.get(i));
        }

    }

    @Given("Select {string} brand.")
    public void select_brand(String expectedBrand) {
        popularBrandName = expectedBrand;
        ReusableMethods.scrollWithUiScrollableContentDescClick(expectedBrand);
    }

    @Given("Verify that the brand’s product listing page is displayed.")
    public void verify_that_the_brand_s_product_listing_page_is_displayed() {

        Assert.assertTrue(homePage.PageTitle.isDisplayed());
        Assert.assertEquals("Brand's names are not equals!", popularBrandName, homePage.PageTitle.getAttribute("content-desc"));
    }

    @Given("Verify that the {string} link is visible and active on the Forgot Password page.")
    public void verify_that_the_link_is_visible_and_active_on_the_forgot_password_page(String string) {
        Assert.assertTrue(homePage.backToSignInButton.isEnabled());
    }

    @Given("User sends {string} to email box.")
    public void user_sends_to_email_box(String validEmail) {
        homePage.emailBox.click();
        homePage.emailBox.sendKeys(ConfigReader.getProperty(validEmail));
        OptionsMet.hideKeyboard();
    }

    @Given("Verify that an OTP request is triggered and redirected reset password page with success notification.")
    public void verify_that_an_otp_request_is_triggered_and_redirected_reset_password_page_with_success_notification() {
        Assert.assertTrue(homePage.resetPassPageTitle.isDisplayed());
        Assert.assertTrue(homePage.successNotification.isDisplayed());
    }

    public List<String> getAllCategories() throws InvalidMidiDataException {
        List<String> allCategories = new ArrayList<>();
        boolean isEndOfList = false;

        while (!isEndOfList) {

            List<WebElement> visibleCategories = Driver.getAppiumDriver().findElements(By.xpath("(//android.view.View)[11]//android.view.View"));

            for (WebElement category : visibleCategories) {
                String categoryName = category.getAttribute("content-desc");

                if (categoryName != null && !categoryName.equals("null") && !categoryName.trim().isEmpty()) {
                    if (!allCategories.contains(categoryName)) {
                        allCategories.add(categoryName);
                    }
                }
            }

            OptionsMet.swipe(1188, 1162, 0, 1162);
            ReusableMethods.wait(1);

            List<WebElement> currentVisibleCategories = Driver.getAppiumDriver().findElements(By.xpath("(//android.view.View)[11]//android.view.View"));
            String currentCategoryName = currentVisibleCategories.get(currentVisibleCategories.size() - 1).getAttribute("content-desc");

            String lastCategory = allCategories.get(allCategories.size() - 1);

            if (currentCategoryName.equals(lastCategory)) {
                isEndOfList = true;
            }
        }
        return allCategories;
    }

    public void selectCategory(String categoryNameVariable) {
        List<String> allCategories = new ArrayList<>();
        boolean categoryFound = false;
        boolean reachedEnd = false;

        while (!categoryFound) {

            List<WebElement> visibleCategories = Driver.getAppiumDriver().findElements(By.xpath("(//android.view.View)[11]//android.view.View"));

            for (WebElement category : visibleCategories) {
                String categoryName = category.getAttribute("content-desc");

                if (categoryName != null && !categoryName.equals("null") && !categoryName.trim().isEmpty()) {
                    if (!allCategories.contains(categoryName)) {
                        allCategories.add(categoryName);

                        if (categoryName.equals(categoryNameVariable)) {
                            categoryFound = true;
                            category.click();
                            break;
                        }
                    }
                }
            }

            if (categoryFound) break;

            if (reachedEnd) {
                try {
                    OptionsMet.swipe(0, 1162, 1188, 1162);
                } catch (InvalidMidiDataException e) {
                    throw new RuntimeException(e);
                }
                ReusableMethods.wait(1);

            } else {

                String lastVisibleCategory = visibleCategories.get(visibleCategories.size() - 1).getAttribute("content-desc");

                try {
                    OptionsMet.swipe(1188, 1162, 0, 1162);
                } catch (InvalidMidiDataException e) {
                    throw new RuntimeException(e);
                }
                ReusableMethods.wait(1);

                visibleCategories = Driver.getAppiumDriver().findElements(By.xpath("(//android.view.View)[11]//android.view.View"));

                String newLastVisibleCategory = visibleCategories.get(visibleCategories.size() - 1).getAttribute("content-desc");
                if (lastVisibleCategory.equals(newLastVisibleCategory)) {
                    reachedEnd = true;
                }
            }
        }
    }

    public List<String> getAllPopularBrands() throws InvalidMidiDataException {
        List<String> allCategories = new ArrayList<>();
        boolean isEndOfList = false;

        while (!isEndOfList) {

            List<WebElement> visibleCategories = Driver.getAppiumDriver().findElements(By.xpath("(//android.view.View)[16]//android.view.View"));

            for (WebElement category : visibleCategories) {
                String categoryName = category.getAttribute("content-desc");

                if (categoryName != null && !categoryName.equals("null") && !categoryName.trim().isEmpty()) {
                    if (!allCategories.contains(categoryName)) {
                        allCategories.add(categoryName);
                    }
                }
            }

            OptionsMet.swipe(1300, 2300, 0, 2300);
            ReusableMethods.wait(1);

            List<WebElement> currentVisibleCategories = Driver.getAppiumDriver().findElements(By.xpath("(//android.view.View)[16]//android.view.View"));
            String currentCategoryName = currentVisibleCategories.get(currentVisibleCategories.size() - 1).getAttribute("content-desc");

            String lastCategory = allCategories.get(allCategories.size() - 1);

            if (currentCategoryName.equals(lastCategory)) {
                isEndOfList = true;
            }
        }
        return allCategories;
    }


}