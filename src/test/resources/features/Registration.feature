Feature: Register functionality 

Scenario: User create an account with mandetory fields
Given User has navigate to Register Account page 
When User has enter the details into below fields 
|firstName|Venkatesh|
|LastName|Pollakoma|
|email|venky9.p@gmail.com|
|telephone|9908315494|
|password|Venky!23|
And User has select privacy policy 
And User has clicks on continue button
Then User account should get created successfully


Scenario: User create an account with All fields
Given User has navigate to Register Account page 
When User has enter the details into below fields 
|firstName|Venkatesh|
|LastName|Pollakoma|
|email|venky9.p@gmail.com|
|telephone|9908315494|
|password|Venky!23|
And User has select yes for Newsletter
And User has select privacy policy 
And User has clicks on continue button
Then User account should get created successfully

Scenario: User create an dupicate account
Given User has navigate to Register Account page 
When User has enter the details into below fields 
|firstName|Venkatesh|
|LastName|Pollakoma|
|email|pvenky.mba9@gmail.com|
|telephone|9908315494|
|password|Venky!23|
And User has select privacy policy 
And User has clicks on continue button
Then User should get proper waring message like it is dupicate 

Scenario: User creates an account whithout filling any deatils
Given User dont enter any details in to fields
And User has clicks on continue button
Then Proper warning message should be display under every field
