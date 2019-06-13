package com.learning.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testlearning {
	
	public WebDriver driver;

	@Given("^user is  on homepage$")
	public void user_is_on_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankita\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver= new ChromeDriver();	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		String str= driver.getTitle();
		System.out.println(str);
		Thread.sleep(3000);
		
	}

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("hello");

	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("hello");
	}

}
