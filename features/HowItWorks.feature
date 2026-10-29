Feature: How it works functionality of Infoez application

Background:
When Click the sign in button
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button
Then it should be navigated to the login page

Scenario: To verify clicking of "How It Works" option from navigation bar redirect the user to the "How Infoez works" page 

When Click on How it works option
Then launch the How Infoez works page

Scenario: To verify clicking of "start exploring" option from How Infoez page redirect the user to the "Explore Business" page 
When Click on How it works option
Then launch the How Infoez works page
And Click on the Start exploring Button
Then launch the Explore Business page


Scenario: To verify clicking of "List your Business" option from How Infoez works redirect the user to the "Create Account" page 

When Click on How it works option
Then launch the How Infoez works page
And Click on the List your Business Button
Then launch the CreateAccountPage


