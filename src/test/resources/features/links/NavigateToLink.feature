Feature: Navigate to link

  In order to bet on horses
  As a potential user
  I want to be able to navigate to the racing page
  @sporting
  Scenario: Should be able to navigate to racing page
    Given I am on the main page
    When I navigate to the 'Racing' page
    Then I am able to view title 'Horse Racing Betting Tips | Racecards, Live Results & News | Sporting Life'
