package step;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import page.PageObject;

public class StepDefinition {

	WebDriver driver;
	PageObject pageObject;
	private String country;
	private String reason;
	private String answer;

	@Before public void setUp() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
	}
	@Given("^I provide a nationality of \"([^\"]*)\"$")
	public void i_provide_a_nationality_of(String country) {
		this.country=country;
		
		pageObject = new PageObject(driver);
		pageObject.selectCountryValue(country);
		pageObject.selectButton();
	    

	}
	
	@Given("^I select the reason \"([^\"]*)\"$")
	public void i_select_the_reason(String reason)	
	{   this.reason=reason;
		//System.out.println(">>>>>>>>>>>>>>>>>>>>"+reason);
		if (reason.contentEquals("Study")){
				pageObject.selectStudy();
		}
		if (reason.contentEquals("Tourism")) {
			pageObject.selectTourism();
		}
		pageObject.selectButton();
		
	}
	

	@Given("^I state I am intending to stay for more than (\\d+) months$")
	public void i_state_I_am_intending_to_stay_for_more_than_months(int arg1) throws Throwable {
	    pageObject.selectMoreThanSixMonths();
	    pageObject.selectButton();

	}
	
	

	@Then("^I will be informed \"([^\"]*)\"$")
	public void i_will_be_informed_I_will_need_a_visa_to_study_in_the_UK(String answer){
		this.answer = answer;
	    //String expected = "You�ll need a visa to study in the UK";
		answer = answer.replace('\uFFFD','�');//this replaces the generic default code with the code on the screen. 
		//  https://en.wikipedia.org/wiki/Specials_(Unicode_block)
		String expected = answer;
	    String result = pageObject.visaResult();
	    assertEquals(expected, result);
	    
	}



	@Given("^I state I am not travelling or visiting a partner or family$")
	public void i_state_I_am_not_travelling_or_visiting_a_partner_or_family(){
	    pageObject.selectNoFamily();
	    pageObject.selectButton();  

	}

	/*@Then("^I will be informed 'I need a visa to come to the UK'$")
	public void i_will_be_informed_I_need_a_visa_to_come_to_the_UK() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}*/

	/*@Then("^I will be informed 'I won't need a visa to study in the UK'$")
	public void i_will_be_informed_I_won_t_need_a_visa_to_study_in_the_UK() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}*/
	
	/*@Then("^I will be informed 'I will need a visa to come to the UK'$")
	public void i_will_be_informed_You_ll_need_a_visa_to_come_to_the_UK() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}*/
	

	@Then("^I select family 'No'$")
	public void i_select_family_No() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}


	@After public void cleanUp() {
		driver.close();
	}
}
