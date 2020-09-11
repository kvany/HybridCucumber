package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OHRM_Recruitmentaddcandidate {

WebDriver driver;
	
	public OHRM_Recruitmentaddcandidate(WebDriver driver) {
			
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "menu_recruitment_viewCandidates")
	WebElement Candidates;
//	@FindBy(id = "txtUsername")
//	WebElement username;
//	@FindBy(id = "txtPassword")
//	WebElement pwd;
//	@FindBy(className = "button")
//	WebElement Loginbutton;
//	
//	@FindBy(id="menu_recruitment_viewRecruitmentModule")
//	WebElement Recruitment;
	
	@FindBy(id="btnAdd")
	WebElement Addbtn;
	
	@FindBy(id="addCandidate_firstName")
	WebElement fname;
	
	@FindBy(id="addCandidate_lastName")
	WebElement lname;
	
	@FindBy(id="addCandidate_email")
	WebElement email;
	
	@FindBy(id="addCandidate_contactNo")
	WebElement ContactNo;
	
	@FindBy(id="addCandidate_resume")
	WebElement resume;
	
	@FindBy(id="addCandidate_appliedDate")
	WebElement date;
	
	@FindBy(xpath= "//a[contains(text(),'15')]")
	WebElement Specdate;
	
	@FindBy(id="btnSave")
	WebElement Savebtn;
//	public void login(String uname, String password) throws InterruptedException {
//
//		username.sendKeys(uname);
//		pwd.sendKeys(password);			
//		Loginbutton.click();
//		Thread.sleep(2000);
//		Loginbutton.click();
//		username.sendKeys(uname);
//		pwd.sendKeys(password);
//		Loginbutton.click();
//	}
	
	
	public void ClickRecurit(){
		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.elementToBeClickable(Recruitment));			
//		Recruitment.click();
	}

	public void ClickAdd(){
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(Addbtn));			
		Addbtn.click();
	}
	public void FullName(String firstname,String lastname)
	{
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
	}
	public void emailContact(String Email,String contact) {
		email.sendKeys(Email);
		ContactNo.sendKeys(contact);
	}
	public void Resume(String path) {
		resume.sendKeys(path);
	}
	
	public void Appdate() {
		date.click();
		Specdate.click();		
	}
	public void SaveButton() {
		Savebtn.click();
	}
	
}
