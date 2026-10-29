Feature: Profile Management As a registered user want to create and update profile details

Scenario: Successfully create and save profile details
When Click the sign in button
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
And Click on the Login button
Then The Welcome message should be displayed
When  Click on the username button
And Click on the profile button
And Enter the name as 'laskhmi'
And Enter the phonenumber as '9636739812'
When Click on the savechanges button
Then profile update messages should be displayed







