
Feature:As a registered user, I would like to have a page on the site where I can select and manage my address information before completing the payment.
  @2
  Scenario: Delivery and Pick Up buttons visible and active
    When The user logs in with valid login credentials.
    And  The user clicks on the product under most popular on the home page, selects the size and adds it to the cart.
    Then The user navigates to the Shipping Information page.
    When Verifies that the Delivery and Pick Up buttons appear on the page.
    And  Verifies that both buttons are clickable.

  Scenario: Viewing and editing existing address information and adding new addresses when Delivery is selected.
    When The user logs in with valid login credentials.
    Then The user navigates to the Shipping Information page.
    Then The user clicks the Delivery button.
    And  Verify that the current address information is displayed on the page.
    When The user clicks Edit in the address information displayed.
    And  Edit and save address information.
    Then Verifies that the edited address was successfully saved and displayed on the page.
    And  The user clicks on the Add New Address button next to the address information.
    And  Enters and saves new address information.
    And  Verifies that the user's newly added address is displayed on the page.

  Scenario: Viewing the order summary.
    When The user logs in with valid login credentials.
    Then The user navigates to the Shipping Information page.
    And  Verifies that the order details are displayed under the Order Summary heading at the bottom of the page.

  Scenario: Save & Pay Button Visible and Active.
    When The user logs in with valid login credentials.
    Then The user navigates to the Shipping Information page.
    And  Verifies that the Save & Pay button is visible and clickable on the page.