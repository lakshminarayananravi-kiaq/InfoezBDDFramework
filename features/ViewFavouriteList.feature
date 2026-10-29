Feature: View Favourite list of Infoez application

Background:
When Click the sign in button
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button

Scenario:  Search the favourite business and remove if present 
Then The Welcome message should be displayed
When  Click on the username button
And Click on the favourite button
And Click on the business saved as favourite
When Click on the saved button
Then Display the message as removed from favourites

Scenario: Search the Business and create if absent
Then The Welcome message should be displayed
When  Click on the username button
And Click on the favourite button
And Click on the explore button
And Click the categories dropdown and select the business
And Click the SortBy dropdown and select the option
And Click the Business
When Click on the save button
Then Display the message as saved to favourites


