Feature: As a user, I should be able to delete a file/folder.

  @winByTatiana
  Scenario: Verify user can delete a file/folder

    Given user is on the dashboard page
    When  user clicks the "Files" module
    And user clicks action-icon from any file on the page
    And user chooses "Delete file" option
    When user clicks the "Deleted files" sub-module on the left side
    Then Verify the deleted file is displayed on the page