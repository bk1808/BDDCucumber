Feature:

Scenario: User should be able to poll after log in 

Given Browser is open and URL is navigated
And user is logged in 
When user selects an option in community poll
Then the option must be recorded 