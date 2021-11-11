package com.steps;

import org.junit.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;

public class LoginPageSteps extends TestBase{
	LoginPage lp;
	String title;
	
	@Given("I am on login Page")
	public void i_am_on_login_page() {
		initialization();
		lp= new LoginPage();
	  
	}

	@When("I get the title of the page")
	public void i_get_the_title_of_the_page() {
		title = lp.validateTitle();
		System.out.println("the title of page is :" + title);
	    
	}
	@Then("I validate the title as {string}")
	public void i_validate_the_title_as_login_my_store(String expectedTitle) {
	   
	Assert.assertEquals(title, expectedTitle);
			
	}
	
	@Then("Forgot Password link should be displyed")
	public void forgot_password_link_should_be_displyed() {
		
		String text = lp.forgetPassword();
		System.out.println("the text is "+ text);
	 
	}
	
	@When("I enters Username sonal04@gmail.com")
	public void i_enters_username_sonal04_gmail_com() {
	   lp.enterUsername();
	}

	@When("I enters password as abc@123")
	public void i_enters_password_as_abc() {
	 lp.enterpwd();
	}
	@When("I clicks on Login button")
	public void i_clicks_on_login_button() {
	  lp.clicksignin();
	}

}
