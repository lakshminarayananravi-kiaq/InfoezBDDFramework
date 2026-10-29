Feature: ChoosePricing functionality of Infoez application

Background:
When Click the sign in button
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button
Then The Welcome message should be displayed

Scenario: User choosing the free plan & pricing
When Click the pricing button
And Click the free plan button
Then Display the message as subscription updated

Scenario: User choosing the starter plan & pricing
When Click the pricing button
And Click the starter plan button
Then Display the message as subscription updated

Scenario: User choosing the pro plan & pricing
When Click the pricing button
And Click the pro plan button
Then Display the message as subscription updated


Scenario: User choosing the enterprise plan & pricing
When Click the pricing button
And Click the enterprise plan button
Then Display the message as subscription updated
