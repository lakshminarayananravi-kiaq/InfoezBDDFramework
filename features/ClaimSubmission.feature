Feature: Claim Submission of Infoez application

Scenario: Explore the business and submit claim 

When Click the sign in button
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button
Then The Welcome message should be displayed
When Click on the explore button
And Click the categories dropdown and select the business
And Click the SortBy dropdown and select the option
And Click the Business
And Click the claim button
And Enter the reason
And Enter URL option
When Click the submit claim button
Then Verify the Claim submission message



