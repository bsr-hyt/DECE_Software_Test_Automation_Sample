Feature: ClassifyPage

  @wip3
  Scenario: The user go to the ClassifyPage and verifies that the user is on the ClassifyPage
    Given The user go to homepage succesfully
    When The user click "Classify" button
    Then The user should be able to see sloganbar phrase "Semantic &nbsp;Classification for<br>Strong Data Protection"