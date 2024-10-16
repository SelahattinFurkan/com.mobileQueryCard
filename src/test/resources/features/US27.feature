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

  @US27
  Scenario: user clicks on the wishlist and confirms that they went to the wishlist page

    When user clicks shopping cart
    And  5 sn wait
    And  user clicks "Go To Shopping"
    And  user confirms return to homepage


  Scenario: user clicks on the wishlist and confirms that they went to the wishlist page

    When user clicks "Go To Shopping"
    And  user clicks "Go To Shopping"
    And  user clicks "Go To Shopping"
    And  user clicks "Go To Shopping"
    And sees the remove button
    And user clicks "Go To Shopping"


  Scenario: user clicks on the wishlist and confirms that they went to the wishlist page

    When kullanici sepete gider
    And ekli urunlerden ilkini siler


  Scenario: user clicks on the wishlist and confirms that they went to the wishlist page

    When kullanici sepete gider
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















