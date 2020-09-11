package com.StepDefinition;

import com.baseclass.Library;
import com.pages.OHRM_Recruitmentaddcandidate;
import com.pages.OHRM_Recruitmentvacancies;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Vacancysteps extends Library {
	OHRM_Recruitmentvacancies OHRMvacancies;
	
	@Given("User logging to the applicatin and click on login")
	public void user_logging_to_the_applicatin_and_click_on_login() throws InterruptedException {
	browserSetUp();
	   OHRMvacancies = new OHRM_Recruitmentvacancies(driver);
	   OHRMvacancies.login("Admin", "admin123");
	  OHRMvacancies.clickonrecruitment();
	   
	}

	@When("Select recruitment and select vacancies")
	public void select_recruitment_and_select_vacancies() {
	
		OHRMvacancies = new OHRM_Recruitmentvacancies(driver);
		OHRMvacancies.clickonrecruitment();
		OHRMvacancies.SelectVacancy();
	}

	@Then("Select add and fill the entries and click on save")
	public void select_add_and_fill_the_entries_and_click_on_save() throws InterruptedException {
		OHRMvacancies.JobTitle("HR Manager");
		OHRMvacancies.Vacancy("CEO");
		OHRMvacancies.Hiring("Thomas Fleming");
		Thread.sleep(1000);
		OHRMvacancies.Positions("1");
		OHRMvacancies.descriptiont("Filling the position for  CEO vacancy");
		Thread.sleep(1000);
		OHRMvacancies.saveButton();
		
	}
	@Then("^add candidate details and save$")
	public void add_candidate_details_and_save() {
		OHRMvacancies.candidatebutton();
		OHRMvacancies.ClickAdd();
		OHRMvacancies.FullName("Honiball", "Chris");
		OHRMvacancies.emailContact("Chris@gmail.com", "7897989678");
		OHRMvacancies.Resume("C:\\Users\\KRISHNA PC\\Desktop\\Testing\\Hello.txt");
		OHRMvacancies.Appdate();
		OHRMvacancies.SaveButton();
	}}

	/*@Then("^press the recuritement then  add button and it will open the  candidate add page$")
	public void press_the_recuritement_then_add_button_and_it_will_open_the_candidate_add_page() {
		c = new OHRM_Recruitmentaddcandidate(driver);
		c.ClickRecurit();
		c.ClickAdd();
	}

	@Then("^enter the details and save$")
	public void enter_the_details_and_save() {
		c = new OHRM_Recruitmentaddcandidate(driver);
		c.FullName("Honiball", "Chris");
c.emailContact("Chris@gmail.com", "7897989678");
c.Resume("C:\\Users\\KRISHNA PC\\Desktop\\Testing\\Hello.txt");
c.Appdate();
c.SaveButton();
		  
	   */
	

	

