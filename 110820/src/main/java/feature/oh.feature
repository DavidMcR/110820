Feature: Confirm whether a visa is needed to come to the UK.

Background:
	User opens the home office page. 
	
@SmokeTest @Study @Japan	
Scenario: Japanese Student
		Given I provide a nationality of "japan"
		And I select the reason "Study"
		And I state I am intending to stay for more than 6 months
		Then I will be informed "You’ll need a visa to study in the UK"
	
@Tourism @Russia
Scenario: Russian Tourist

		Given I provide a nationality of "russia"
		And I select the reason "Tourism"
		
		And I state I am not travelling or visiting a partner or family
		
		
		Then I will be informed "You’ll need a visa to come to the UK"
@Tourism	@Japan
Scenario: Japanese Tourist
	
		Given I provide a nationality of "japan"
		And I select the reason "Tourism"
		
		Then I will be informed "You won’t need a visa to come to the UK"
@Study @Russia
Scenario: Russian Study
	
		Given I provide a nationality of "russia"
		And I select the reason "Study"
		And I state I am intending to stay for more than 6 months
		
		Then I will be informed "You’ll need a visa to study in the UK"	