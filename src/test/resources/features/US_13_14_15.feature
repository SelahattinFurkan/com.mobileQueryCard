Feature: As a registered user, I would like to be able to see the categories and products of the Menu menu on the home page.
  Background: User opens the app
    * User makes driver adjustments

  Scenario: Sign In
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button with description "*Use Email Instead"
    * User clicks the button email and sendKeys "selahattinfurkan.user@querycart.com"
    * User clicks the button with description Password and sendKeys "Query.71024"
    * User clicks the button Sign In



@Selahattin
  Scenario: View male section features
  * In the body section, the "men" category and subcategories are visible and must be active.
  * Click on the "men" logo
  * Addition to the liked list
  * Product imaging is done
  * Add to cart
  * Filter icons must be visible and active



