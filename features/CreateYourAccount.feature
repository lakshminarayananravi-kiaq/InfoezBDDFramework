Feature: Create Account functionality of Infoez application


Scenario: create account with valid credentials 
When Click the sign in button
And Click the createoneButton
And Enter the Fullname as 'Lakshmin'
And Enter the Email as 'customer@infoez.com'
And Enter the Account password as Customer@123
When Click on the createaccount Button
Then Display the message as account created

Scenario: create account with invalid credentials
When Click the sign in button
And Click the createoneButton
And Enter the Fullname as '234566'
And Enter the Email as 'customer@infoez.com'
And Enter the Account password as Customer@123
When Click on the createaccount Button
Then Display the message as invalid details

