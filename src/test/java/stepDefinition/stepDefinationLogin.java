package stepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinationLogin {
	
	@Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
		 System.out.println("Deciding browser to open");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	 System.out.println("Browser is triggered");
    }

    @Then("^check if browser is displayed$")
    public void check_if_browser_is_displayed() throws Throwable {
    	 System.out.println("Browser opened successfully");
    }

	@Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("Navigate to login URL");
    }

	
	/*
	 * @When("^User login into application with username and password$") public void
	 * user_login_into_application_with_username_and_password() throws Throwable {
	 * System.out.println("logged in successfully");
	 * 
	 * }
	 */

	@When("User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_and(String string1, String string2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string1);
		System.out.println(string2);
	    
	}

	
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Home page successfully launched");
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_are_displayed(String string3) throws Throwable {
    	System.out.println(string3);
    }

    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
        List<List<String>> obj = data.asLists();
        obj.get(0).get(0);
        obj.get(0).get(1);
        obj.get(0).get(2);
        obj.get(0).get(3);
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
    }
    
    @When("^User login application with (.+) and (.+)$")
    public void user_login_application_with_and(String username, String password) throws Throwable {
    	System.out.println(username + password);
    }
    
   
}
