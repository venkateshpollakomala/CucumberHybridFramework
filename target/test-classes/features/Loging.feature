Feature: Login functionality 

Scenario: Login with valid credentials
Given User has navigate to login page
When User has enter valid emailaddress "pvenky.mba9@gmail.com" in to email field
And User has enter valid password "Venky!23" in to password field
And User clicks on login button
Then User should get successfully logged in

Scenario: Login with invalid credentials
Given User has navigate to login page
When User has enter invalid emailaddress "pvenky.mba1@gmail.com" in to email field
And User has enter invalid password "Venky@123" in to password field
And User clicks on login button
Then User should get proper warning message about credentials mismatch

Scenario: Login with login email and invalid password
Given User has navigate to login page
When User has enter valid emailaddress "pvenky.mba9@gmail.com" in to email field
And User has enter invalid password "Venky@123" in to password field
And User clicks on login button
Then User should get proper warning message about credentials mismatch

Scenario: Ligin with invalid emailaddress and valid password
Given User has navigate to login page
When User has enter invalid emailaddress "pvenky.mba11@gmail.com" in to email field
And User has enter valid password "Venky!23" in to password field 
And User clicks on login button
Then User should get proper warning message about credentials mismatch

Scenario: Login without providing credentials
Given User has navigate to login page
When User dont enter emailaddress in to email field
And User dont enter password in to password field
And User clicks on login button
Then User should get proper warning message about credentials mismatch

