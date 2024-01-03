Feature: Search and Select Product
	Check Search and Select Product
    
  @SelectProductScenario
  Scenario: Check Search and Select Product Scenario
    Then Select all the filter
    Then Click on the any product
    Then Click on the add to cart button 
    Then Click on the cart button
    Then Click on the checkout button
    Then Enter the <firstname> , <lastname> and <zipcode> and click on the continue button
    Then Click on the finish button 
    Then Click on the Back Home button
    
    Examples:
    
    | firstname | lastname | zipcode |
    | Aman			| Kumar		 | 572831	 |