Feature: Login functionality of Leaftaps application

Scenario: Login with valid credentials

Given Launch the browser
And load the url
And Enter the username as 'Demosalsesmanager'
And Enter the password as crmsfa
When Click on the login button
Then it should navigate to the next page

Scenario: Login with invalid credentials

Given Launch the browser
And load the url
And Enter the username as Demo
And Enter the password as crmsfa
When Click on the login button
But it throws error message

