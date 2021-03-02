package stepdefinitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MenuManagementSteps {

	private static final String ErrorMessage = null;

	@Given("I have a menu item with name {string} and price {int}")
	public void i_have_a_menu_item_with_name_and_price(String string,Integer integer) {
		System.out.println("given: something to add");
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@When("I add that menu item")
	public void i_add_that_menu_item() {
		System.out.println("when: add");
			// Write code here that turns the phrase above into concrete actions
			// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Then("Menu Item with name {string} should be added")
	public void menu_Item_with_name_should_be_added(String string) {
		System.out.println("then: added");
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}
	
	@Then("Something happens")
	public void something_happens() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("Duplicate", ErrorMessage);
	    throw new io.cucumber.java.PendingException();
	}
	
}
