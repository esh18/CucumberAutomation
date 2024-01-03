Feature: Login Feature
	Check Login Feature

  @LoginScenario
  Scenario: Check Login Feature Scenario
    Then Check that The login succesfully done or not
    Then Click on the Sandwitch menu and logout button
    Then Check the Logout is successfully happened 
    Then Enter the <username> and <password> and click on the Login button
    Then Check that Login successfully happened or not
    
    Examples:
    | username 								| password 			|
    | standard_user 					| secret_sauce 	|
    | locked_out_user 				|  secret_sauce |
    | problem_user 						| secret_sauce 	|
    | performance_glitch_user | secret_sauce 	|
    | error_user 							| secret_sauce 	|
    | visual_user 						| secret_sauce 	|
    