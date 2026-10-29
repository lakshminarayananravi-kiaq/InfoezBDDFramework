Feature: Login functionality of Infoez application


Scenario: Login with valid credentials
When Click the sign in button
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button
Then It should launch the HomePage

Scenario: Login with invalid credentials
When Click the sign in button
And Enter the username as 'customer@kiaq.com'
And Enter the password as Customer@123
When Click on the Login button
Then The Invalid Credentials message should be displayed

Scenario: Login with empty email credentials
When Click the sign in button
And user click emailfield without entering details
And Enter the password as Customer@123
When Click on the Login button
Then The toast message should display as Please fill out this field

Scenario: Login with empty password credentials
When Click the sign in button
And Enter the username as 'customer@infoez.com'
And user click passwordfield without entering password
When Click on the Login button
Then The toast message should display as Please fill out this field

Scenario: Verify Welcome message after login
When Click the sign in button
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button
And It should launch the HomePage
Then The Welcome message should be displayed







