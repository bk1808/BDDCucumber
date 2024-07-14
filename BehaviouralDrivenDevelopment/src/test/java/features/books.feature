Feature: Books

Background: 

Given browser is open to welcome page
When user is logged in
| qa_testuser123@gmail.com | Password@123 |
And user clicks on books page 
And books page is displayed

Scenario: Validate useer can sort the page automatically


And user chooses A-Z in sort by drop down
Then page should be sorted alphabetically 

Scenario: Validate user can add Computing and internet book to cart


And user click on add to cart button for computing and internet book
Then book should be added to cart

Scenario: Valdate user can add health book to cart


And user click on add to cart button for health book
Then book should be added to cart
