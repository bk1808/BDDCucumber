@tag
Feature: Register

@Smoke @Regression
Scenario: User should be able to register using valid credentials

Given Browser is open
And url is navigated to register page
When user enters valid credentials

# data table is only applicable to the perticualr step
| M | Test | manualtest | qas_manualtest@gmail.com | Password@123 |
# | M | Test | manualtest | qa12_manualtest@gmail.com | Password@123 |
And clicks on register button
Then a new account should be created 
And browser must be closed