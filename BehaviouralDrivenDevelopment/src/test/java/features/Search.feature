@tag
Feature: Search

@Regression @Search
Scenario Outline: Validate when user enters text in search text field then the search result must be displayed

Given welcome page should be displayed
When user enters "<Search text>" in search text field
Then search results must be displayed

Examples:  

| Search text |
| Computer    |
| Books       |
| 10 					|
| 10.20       |