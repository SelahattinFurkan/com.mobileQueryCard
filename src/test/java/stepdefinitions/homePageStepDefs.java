package stepdefinitions;
import Page.HomePage;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class homePageStepDefs {

    HomePage homePage = new HomePage();

    @Given("Locate the {string} heading on the homepage.")
    public void locate_the_categories_heading_on_the_homepage(String text) {
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
    public void select_category(String string) {

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
}
