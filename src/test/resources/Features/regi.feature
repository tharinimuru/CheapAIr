
Feature: Registration page of cheapair project

Scenario: Registration Page Scenario 
 		
 		When Enter the details for registration
 		  |Fields |	values1|values2|values3|values4|values5|values6|values7|values8|values9|
 			|FirstName |tharini |tharini   |tharini |tharini|tharini|tharini|tharini|tharini|tharini|
 			|MiddleName|M |K|T|J  |K   |L   |K    |Q|Y|
 			|LastName  |K     |Hello |hi  |funn   |jeenn  |keto  |kkk     |ram|joj|
 			|suffix    |Jr		|Jr     |Jr     |  Jr   |   Jr  |  Sr  |   Sr    |II|III|
 			|Gender    |F     |F      |F      |M      | F     | M    | F       |M|M|
 			|Month     |January|January|January|January|January|January|January|January|January|
 			|day			 |01		|01			|01			|01			|01			|01			|01			|01|01|
 			|year				|2000 |2000		|2000   |2000   |2000   |2000   |2000   |2000|2000|
 		Then Enter the card details
 		|Fields |	values1|
 		|ccNum|4408041234567890|
 		|month|01|
 		|year|2023|
 		|cvv|234|
 		|name|tharini|
 		|country|India|
 		|address|chennai|
 		|address|sameaddres|
 		|city|chennai|
 		|phone|9343557848|
 		|email|tharinim@tcs.com|
 		|password|welcome@1987|
 		|confirm|welcome@1987|
 		
 