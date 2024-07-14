@tag
Feature: Login

@Smoke @Regression
Scenario: Validate user is able to login using valid credentials

Given Browser is open and URL is navigated
And Login page is displayed
When user eneters valid username and valid password
And user clicks on login button
Then user should be successfully logged in
And browser should close