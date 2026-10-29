Feature: Home page option fucntionality of infoez application 


Background:
When Click the sign in button
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button
Then it should be navigated to the login page
When  Click on the username button


Scenario: verify all option clickable on the username option 
When Click on the My review button
Then It launch the Review page
When Click on the My enquiry button
Then It launch the Enquiry page
When Click on the Notification button
Then It launch the Notification page
When Click on the Subscription button
Then It launch the Pricing page


