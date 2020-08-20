package step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import page.PageObject;

public class StepDefinition {

	WebDriver driver;
	PageObject pageObject;
	private String country;
	
	@Given("^I provide a nationality of \"([^\"]*)\"$")
	public void i_provide_a_nationality_of_Japan(String country) {
		this.country=country;
		pageObject = new PageObject(driver);
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    System.out.println("balls");

	}
}
