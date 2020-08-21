package step;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import page.PageObject;

public class StepDefinition {

	WebDriver driver;
	PageObject pageObject;
	private String country;
	
	@Given("^I provide a nationality of \"([^\"]*)\"$")
	public void i_provide_a_nationality_of_Japan(String country) {
		this.country=country;
		driver = new ChromeDriver();
		pageObject = new PageObject(driver);
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		Select countrySelect = new Select(driver.findElement(By.xpath("//*[@id=\"response\"]")));
		countrySelect.selectByValue(country);
		driver.findElement(By.xpath("//*[@id=\"current-question\"]/button")).click();
	    

	}
	
	@Given("^I select the reason \"Study\"$")
	public void i_select_the_reason()
	
	{
		driver.findElement(By.xpath("//*[@id=\"response-2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"current-question\"]/button")).click();

	}

	@Given("^I state I am intending to stay for more than (\\d+) months$")
	public void i_state_I_am_intending_to_stay_for_more_than_months(int arg1) throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"current-question\"]/div/div/fieldset/div[2]/div[2]/label")).click();
	    driver.findElement(By.xpath("//*[@id=\"current-question\"]/button")).click();

	}

	@Then("^I will be informed 'I will need a visa to study in the UK'$")
	public void i_will_be_informed_I_will_need_a_visa_to_study_in_the_UK() throws Throwable {
	    String expected = "You�ll need a visa to study in the UK";
	    String result = driver.findElement(By.xpath("//*[@id=\"result-info\"]/div[2]/h2")).getText();
	    assertEquals(expected, result);
	    System.out.println("#####################"+expected);
	    

	}

	@Given("^I select the reason 'Tourism'$")
	public void i_select_the_reason_Tourism() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Given("^I state I am not travelling or visiting a partner or family$")
	public void i_state_I_am_not_travelling_or_visiting_a_partner_or_family() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^I will be informed 'I need a visa to come to the UK'$")
	public void i_will_be_informed_I_need_a_visa_to_come_to_the_UK() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^I will be informed 'I won't need a visa to study in the UK'$")
	public void i_will_be_informed_I_won_t_need_a_visa_to_study_in_the_UK() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^I select family 'No'$")
	public void i_select_family_No() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^I will be informed 'You'll need a visa to come to the UK'$")
	public void i_will_be_informed_You_ll_need_a_visa_to_come_to_the_UK() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}
}
