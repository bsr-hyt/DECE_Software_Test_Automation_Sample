Feature: MaskPage
  @wip4
  Scenario: The user go to the MaskPage and verifies that the user is on the MaskPage
    Given The user go to homepage succesfully
    When The user click "Mask" button
    Then The user should be able to see sloganbar phrase "Hide Sensitive Information"