Feature: As a registered user, I would like to have a page about the orders I want to return and be able to manage my product returns.

  Scenario: Verify that the user can request a return for delivered orders.
  TC01;

    * Navigate to the "Order History" page.
    * Select a delivered order.
    * Verify that the "Return Request" button is visible and enabled.
    * Click on the "Return Request" button.


  Scenario: Verify that the user can select products, add return details, and submit a return request.
  TC02;

    * On the "Request Return" page, select the product(s) to return.
    * Fill in the return reason, note, and attach a file (if needed).
    * Fill in the return reason, note, and attach a file (if needed).
    * Click on the "Request Return" button.


  Scenario: Verify that the return request is reflected on the "Return Orders" page.
  TC03;

    * Navigate to the "Return Orders" page.
    * Verify that the return request is listed with the correct status (e.g., "Return Started").


