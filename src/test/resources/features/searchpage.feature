Feature: SearchPage
  @wip1
  Scenario: The user go to the SearchPage and verifies that the user is on the SearchPage
    Given The user go to homepage succesfully
    When The user click "Search" button
    Then The user should be able to see sloganbar phrase "Find what you are looking for! <br>Anytime, Anywhere"