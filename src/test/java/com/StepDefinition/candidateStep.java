package com.StepDefinition;

import com.baseclass.Library;
import com.pages.OHRM_Recruitmentaddcandidate;

import cucumber.api.java.en.Given;
import io.cucumber.java.en.Then;

public class candidateStep extends Library {
	OHRM_Recruitmentaddcandidate c;
	
	@Given("^The user enters the correct credentials  for application$")
	public void the_user_enters_the_correct_credentials_for_application() throws InterruptedException{
		browserSetUp();
		OHRM_Recruitmentaddcandidate c=new OHRM_Recruitmentaddcandidate(driver);
	//    c.login("Admin", "admin123");
	}

	@Then("^press the recuritement then  add button and it will open the  candidate add page$")
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
		  
	   
	}


}
