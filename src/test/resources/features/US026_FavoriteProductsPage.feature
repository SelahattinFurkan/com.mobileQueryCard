Feature: As a registered user, I want to have a favorite products page on the site and
         I want to be able to manage this page.

  Scenario: user clicks on the wishlist and confirms that they went to the wishlist page

    When The user opens the mobile app
    And  5 sn wait
    And  The user logs in with valid credentials
    And  The user navigates to the Wishlist section


  Scenario: user favorites the product without clicking on the product

    When The user opens the mobile app
    And  5 sn wait
    And  The user logs in with valid credentials
    And  clicks the hollow heart icon to add the first product to favorites
    And  user clicks "Wishlist"
    And  the user confirms that it is a product in their wishlist


  Scenario: user favorites the product without clicking on the product

    When The user opens the mobile app
    And  5 sn wait
    And  The user logs in with valid credentials
    And  user clicks "premierProduit"
    And  user clicks "favorite"
    And  user comes back
    And  user clicks "Wishlist"
    And  user clicks "Wishlist"
    And  the user confirms that it is a product in their wishlist





