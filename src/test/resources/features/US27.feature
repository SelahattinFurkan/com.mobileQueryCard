Feature: As a registered user, I want to have a favorite products page on the site and
  I want to be able to manage this page.

  Scenario: user clicks on the wishlist and confirms that they went to the wishlist page

    When The user opens the mobile app
    And  5 sn wait
    And  user sees the Cart icon on the home page


  Scenario: user clicks on the wishlist and confirms that they went to the wishlist page

    When user clicks shopping cart
    And  5 sn wait
    And  shopping cart page opens


  Scenario: user clicks on the wishlist and confirms that they went to the wishlist page

    When user clicks shopping cart
    And  5 sn wait
    And  user clicks "Go To Shopping"
    And  user confirms return to homepage

@US27
  Scenario: user clicks on the wishlist and confirms that they went to the wishlist page

    When user clicks "premierProduit"
    And  user clicks "Size M"
    And  user clicks "Add To Cart"
    And  user clicks "Shopping Cart"



  @US27
  Scenario: user clicks on the wishlist and confirms that they went to the wishlist page

    When user clicks "CartHomePage"
    And  sees the remove button


  Scenario: user clicks on the wishlist and confirms that they went to the wishlist page

    When user clicks "CartHomePage"
    And  subtotal yazisini ve karsisindaki degeri gorur


  Scenario: user clicks on the wishlist and confirms that they went to the wishlist page

    When kullanici sepete gider
    And  subtotal yazisini ve karsisindaki degeri gorur

  Scenario: user clicks on the wishlist and confirms that they went to the wishlist page

    When kullanici sepete gider
    And  odemeye devam et butonu gorunurdur

  Scenario: user clicks on the wishlist and confirms that they went to the wishlist page

    When kullanici sepete gider
    And  odemeye devam et butonuna tiklar
    And odeme sayfasina gider















