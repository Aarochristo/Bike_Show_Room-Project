Feature: Homepage Actions

Scenario: user can able to see homepage and verify title
	Given user can choose either chrome or firefox browser to launch
	When  User can able to pass "https://www.samsung.com/in/"
	And   verify title of the page
    Then  quit the browser
    
@two
Scenario: user can able search product and verify the relevant product
      Given user can able to search product
      When  verify product with tile
      And   print the options
      Then   close the page

 