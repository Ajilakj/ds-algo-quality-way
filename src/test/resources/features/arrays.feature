Feature: To validate the  Array Page

  @tag1
  Scenario: user enters into Array page after logged in
    Given user is in home
    When clicks Get Started button under Array
    Then user is directed to array page

  @tag2
  Scenario: to test arrays-in-python page
    Given useris in array page
    And clicks Arrays in Python button
    Then user is directed to arrays-in-python page
    And user clicks Try here>>> button
    Then user is directed to tryEditor box

  @tag3
  Scenario: to test writing valid code in the try Editor
    Given user is already in tryeditor page
    When user enters valid code in tryEditor box
    And clicks Run button
    Then user gets valid output

  @tag4
  Scenario: to test writing invalid code in tryEditor
    Given user is already in tryeditor page
    When user enters invalid code in tryeditor box
    And clicks Run button
    Then an error dialog box appears
    And user clicks ok button inside dialog box
    Then user in the same tryEditor page with same code writte inside the tryEditor box

  @tag5
  Scenario: to click Arrays Using List text and navigate into arrays-using-list page after logged in
    Given User is in array page
    When clicks Array Using List text
    Then user is directed to arrays-using-list page

  @tag6
  Scenario: to navigate into Basic Operations in Lists Page
    Given user is already in arrays-using-List page
    When clicks Basic Operations in Lists Page text
    Then user is directed into basic-operations-in-lists page

  @tag7
  Scenario: to navigate into Applications of Array page
    Given user is already in basic-operations-in-lists page
    When clicks Applications of Array page
    Then user is directed to applications-of-array page
