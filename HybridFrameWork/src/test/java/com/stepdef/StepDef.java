package com.stepdef;


import org.openqa.selenium.support.PageFactory;

import com.common.Base;
import com.pageobject.PageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Base {
	PageObject pm;
@Given("^User able to go home page$")
public void user_able_to_go_home_page() throws Throwable {
    pm=PageFactory.initElements(driver, PageObject.class);
   getDriver();
}

@When("^User enter email address$")
public void user_enter_email_address() throws Throwable {
    pm.getEmail().sendKeys("sumonbd64ss@gmail.com");
    
   
}

@When("^user enter password$")
public void user_enter_password() throws Throwable {
    
   pm.getPassword().sendKeys("sheik1765");
}

@When("^user click on log in$")
public void user_click_on_log_in() throws Throwable {
    
   pm.getLogin().submit();
}

@Then("^User able to sing up successfully$")
public void user_able_to_sing_up_successfully() throws Throwable {
    
   
}



}
