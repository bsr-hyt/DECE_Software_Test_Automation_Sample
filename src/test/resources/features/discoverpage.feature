Feature: DiscoverPage
  @wip2
  Scenario: The user go to the DiscoverPage and verifies that the user is on the DiscoverPage
    Given The user go to homepage succesfully
    When The user click "Discover" button
    Then The user should be able to see sloganbar phrase "Protection Starts <br>with Discovery"