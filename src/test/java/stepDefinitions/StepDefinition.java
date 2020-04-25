package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {

	@Given("^User is in landing page$")
	public void user_is_in_landing_page() throws Throwable {
		System.out.println("User is in landing page");

	}

	@When("^User searches for given keyword \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_searches_for_given_keyword_something_and_something(String strArg1, String strArg2)
			throws Throwable {
		System.out.println(strArg1);
		System.out.println(strArg2);

	}

	@Then("^Page is populated with results$")
	public void page_is_populated_with_results() throws Throwable {
		System.out.println("Page successfully populated with the results");

	}

	@And("^The required page is \"([^\"]*)\"$")
	public void the_required_page_is_something(String strArg1) throws Throwable {
		System.out.println(strArg1);
	}

}
