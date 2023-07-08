Feature: This feature will cover the E2E flow using example table

  Scenario Outline: Performing E2E flow in SauceDemo.com

    Given user navigate to the application
    When user Login with the "<username>" and "<password>"
    Then user selects the products
    Then user go to the cart and clicks on checkout
    And user enters their "<firstname>" "<lastname>" and "<pincode>"
    Then user clicks on finish to buy the product

    Examples:
    |username               |password    |firstname|lastname|pincode|
    |standard_user          |secret_sauce|Newuser  |lastuser|0007   |
#    |locked_out_user        |secret_sauce|Rahul    |lastname|6969   |
#    |problem_user           |secret_sauce|parul    |lastname|1234   |
    |performance_glitch_user|secret_sauce|nehal    |lastname|0001   |

