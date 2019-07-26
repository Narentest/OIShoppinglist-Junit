Feature: Add and delete new lists of items under the List

Scenario Outline: Create 1st list of items under the List
  Given User launched the OI Shopping List app and tapped on Hamburger menu icon on left hand side screen
                                          # 3 line menu bar or Navigation icon
  When  Tap on the "New list" option under the List header
  And   Enter name of new shopping list  name as "Sainsbury"
  Then  Add the items to list "<Items>" should be added to list and saved
  Examples:
  |Items|
  |Grocery|
  |Fruit|
  |Dairy|


  Scenario Outline: Create 2nd list of items under the List
    Given User launched the OI Shopping List app and tapped on Hamburger menu icon on left hand side screen
    When  Tap on the "New list" option under the List header
    And   Enter name of new shopping list  name as "Tesco"
    Then Add the items to list "<Items>" should be added to list and saved
    Examples:
      |Items|
      |Grocery|
      |Fruit|
      |Dairy|

  Scenario: Delete an item from any of one list
    Given User tapped on taped on Hamburger menu button
    And   Select the "Saisnbury" list under the List header
    When  Checked the "Grocery" item to delete an item
    And   User tapped on the Clean up list icon on the top menu bar
    And   Tap on the "Shopping" option to delete the first one item
    Then  The item should be deleted from the list

