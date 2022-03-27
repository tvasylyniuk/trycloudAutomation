Feature: Login page functionality

  @NegativeLogin @wip
  Scenario Outline: Login with invalid credentials
    Given the user on the login page
    Then the user is logged in "<username>" and "<password>" with "<submitType>"


    @withSubmitButton
    Examples:
      | username | password    | submitType |
      | User21   | Userpass123 | submitType |
      | User51   | Userpass123 | submitType |
    # | User81   | Userpass123 | submitType |
    # | User111  | Userpass123 | submitType |

    @withEnterKey
    Examples:
      | username | password    | submitType |
      | User21   | Userpass123 | enter      |
      | User51   | Userpass123 | enter      |
    # | User81   | Userpass123 | enter      |
    # | User111  | Userpass123 | enter      |