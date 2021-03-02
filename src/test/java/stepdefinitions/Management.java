package stepdefinitions;

import io.cucumber.java.en.*;
import linkedinlearning.cucumber.Ability;
import linkedinlearning.cucumber.ListOfAbilities;

public class Management {
	
	Ability NewAbility;
	ListOfAbilities List;

	//@Given("I wish for an ability named \"([^\"]+)\"")
	@Given("I wish for an ability named {string}")
	public void i_wish_for_an_ability_named(String string) {
		
	    NewAbility = new Ability(string, 0);
	}

	@When("I obtain that ability")
	public void i_obtain_that_ability() {

	    List = new ListOfAbilities();
	    List.addAbility(NewAbility);
	}

	@Then("I am now able to {string}")
	public void i_am_now_able_to(String string) {
		
		String ab = NewAbility.getName();

		System.out.println("Ability " + ab + " is there.");
	}
}
