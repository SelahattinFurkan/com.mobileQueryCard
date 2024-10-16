Feature: As a registered user, I want to be able to change my password when I forget it

  @ab
  Scenario: Verify Forgot Password Functionality

    * Launch the app and navigate to the homepage.
    * User clicks the "Profile" button.
    * User clicks the "Sign In" button.
    * User clicks the "Forgot Password" button.
    * Verify that the "Back to sign in" link is visible and active on the Forgot Password page.
    * User clicks the "*Use Email Instead" button.
    * User sends "validEmail" to email box.
    * User clicks the "Get OTP" button.
    * Verify that an OTP request is triggered and redirected reset password page with success notification.
