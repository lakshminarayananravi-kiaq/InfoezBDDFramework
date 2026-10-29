Feature: Search Business functionality of Infoez application

Scenario: user search the business with valid details
When Click the sign in button
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button
Then It should launch the HomePage
And Enter the Business in the textField
And Enter the city in the textField
When Click the search button
Then launch the Explore Business page

Scenario: user search the business with invalid details
When Click the sign in button
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button
Then It should launch the HomePage
And Enter the Business in the textField
And Enter the city in the textField
When Click the search button
Then launch the Explore Business page










