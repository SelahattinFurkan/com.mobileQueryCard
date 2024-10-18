Feature: As a registered user, I want to have a payment page where I can pay for my orders that I control.

  Scenario: Verify that the user can select a payment method and complete payment using Stripe.
    TC01;

    * Navigate to the "Payment Information" page.
    * Verify that the "Select Payment Method" menu is visible.
    * Select the "Stripe" payment method.
    * Verify that the Stripe card information form is visible.
    * Fill in the cardholder's name, card number, expiration date, and CVC.
    * Click on the "Confirm Order" button.
   # * Select a category (e.g., "Electronics").
   # * Verify that the product listing for the selected category is displayed.
   # * Select a product from the category (e.g., "Smartphone").
   # * Verify that the product details page for the selected product is displayed.

    Scenario: Verify that the order is completed, and the user can view order details and invoice.
    TC02;

    * After completing the payment, verify that a "Your order has been successfully completed" message is displayed.
    * Navigate to the order details page.
    * Verify that the order details and invoice are visible.
    * Verify that the user can click "Continue Shopping" and return to the main shopping page.
