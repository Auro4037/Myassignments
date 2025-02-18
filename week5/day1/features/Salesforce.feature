Feature: Login functionality and creation of new account for Salesforce application

Scenario: Login with valid credentials

Given Launch the browser
And load the 'https://login.salesforce.com/'
And Enter the username as 'vidyar@testleaf.com'
And Enter the password as 'Sales@123'
When Click on the login button
And click on toggle
And click on View All
And click on Sales
And click on Account
And click on New button
And Enter your Name as 'Auro'
And Select Ownership as Public
And click Save
Then verify Account Name
