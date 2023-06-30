Feature: Search functionality

Scenario: User search for a valid product 
Given User has open the application
When User has enter the valid product "HP" in to search field 
And User has clicks on search button 
Then User should get valid product displayed in search results 

Scenario: User searches for an invalid product
Given User has open the application 
When User has enter the invalid product "Hond" in to search box field 
And User has clicks on search button 
Then User should get a message about no product matching 

Scenario: User searches without any product
Given User has open the application 
When User has dont enter any product name into search box field 
And User has clicks on search button
Then User should get a message about no product matching 
	
