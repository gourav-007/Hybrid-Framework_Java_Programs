 Feature: Login page feature
 
 Scenario: Login page title
 Given user is on login page
 When user gets the title of the page
 Then page title should be "Login - My Store"
 
 Scenario: Forgot Password Link
 Given user is on login page
 Then forgot password link should be displayed
 
 Scenario: Login with correct credentials
 Given user is on login page
 When user enter his username as "gourav123@gmail.com"
 And password a "Abc@123"
 And click on login button
 Then user gets the title of the page
 And page title should be "My account - My Store"
 