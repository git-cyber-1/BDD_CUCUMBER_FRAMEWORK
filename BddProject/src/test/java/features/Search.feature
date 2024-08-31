Feature:Search

Scenario Outline:validate when user enters text in search text filed then search result must be display

Given welcome page is displayed
When user enters"<Search text>" in search textFiled
Then search results must be displayed

Examples:
      | Search text |
      | computer    |
      | books       |