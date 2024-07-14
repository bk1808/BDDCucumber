Feature: ShopperstackLogin 

@Regression 
Scenario: Validate shopper can login using valid credentials

Given browser is open and url is navigated
And shopper login is displayed
When user enters valid "qa_testmerchantdell@gmail.com" and "Password@123" 
And clicks on login button
Then shopper should be successfully loggedin
And Browser must e closed

