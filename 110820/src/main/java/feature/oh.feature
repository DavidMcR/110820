Feature: Confirm whether a visa is needed to come to the UK.

Scenario: Japanese Student
		Given I provide a nationality of "japan"
		And I select the reason "Study"
		And I state I am intending to stay for more than 6 months
		Then I will be informed 'I will need a visa to study in the UK'
Scenario: Russian tourist

		Given I provide a nationality of "russia"
		And I select the reason 'Tourism'
		
		And I state I am not travelling or visiting a partner or family
		
		
		Then I will be informed 'I need a visa to come to the UK'
		
Scenario: Japanese Tourist
	
		Given I provide a nationality of "japan"
		And I select the reason 'Tourism'
		
		Then I will be informed 'I won't need a visa to study in the UK'
		
Scenario: Russian Tourist
	
		Given I provide a nationality of "russia"
		And I select the reason 'Tourism'
		Then I select family 'No'
		Then I will be informed 'You'll need a visa to come to the UK'	