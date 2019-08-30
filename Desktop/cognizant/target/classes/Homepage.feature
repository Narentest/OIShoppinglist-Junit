Feature: Validating the Guardian news
  Scenario: Validating the guardian web link
    Given User launched the Firefox
    When  User enters "https://www.theguardian.com/tone/news"
    Then  Website should be launched
    And   Validate the expected weblink and entered weblink are same

    Scenario: Validating the Fake News
      Given User landed on the guardian website
      When  User get the "<first news article>" from the guardian website
      And   Searched for news on Google/other resources
      Then  The article/information should confirm article is valid
