Feature: Confirm whether a visa is needed to come to the UK.

Scenario: Japanese Student
		Given I provide a nationality of "Japan"
		And I select the reason "Study"
		And I state I am intending to stay for more than 6 months
		Then I will be informed 'I will need a visa to study in the UK'