Feature: Create Lead functionality of Leaftaps application

Scenario: Create Lead

Given Launch the browser
And load the url
And Enter the username as 'Demosalsesmanager'
And Enter the password as crmsfa
When Click on the login button
Then it should navigate to the next page
When click on CRMSFA link
When click on Leads link
When click on CreateLead link
When enter the company name
When enter the first name
When enter the last name
When click on Create Lead button
Then lead should be created
