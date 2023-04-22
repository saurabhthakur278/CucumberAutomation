package com.med.steps;

import com.med.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPage log = new LoginPage();

	@Given("User need to open medable site app")
	public void user_need_to_open_medable_site_app() {
		log.openApplication();
	}

	@When("^User need to change the (.+)$")
	public void user_need_to_change_the(String organisation) {
		log.setOrganisation(organisation);
	}

	 @When("^User enter (.+) and (.+) and attribute (.+)$")
	public void user_enter_and(String username, String password, String name) throws InterruptedException {
		log.enterCredentials(username, password, name);
	}

	@Then("^User able to login medable site app$")
	public void user_able_to_login_medable_site_app() throws InterruptedException {
		System.out.println(log.getTittleOfPage());
	}
}
