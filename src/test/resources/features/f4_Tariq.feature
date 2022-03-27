
Feature: As a user, I should be able to access to Files module.
@wip
  Scenario: verify users can access to Files module
    Given user on the dashboard page
    When the user clicks "Files" module
    Then verify the page title is "Files - Trycloud QA.”
@wip2
  Scenario: verify users can select all the uploaded files from the page
    Given user on the dashboard page
    When the user clicks "Files" module
    And user click the top-left checkbox of the table
    Then verify all the files are selected