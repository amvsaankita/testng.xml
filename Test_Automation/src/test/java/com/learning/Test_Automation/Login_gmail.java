package com.learning.Test_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login_gmail {
	
	
	public WebDriver driver;
	
	
	
	
	@BeforeClass
    @Parameters(value="browser")

	public void openbrpwser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankita\\Downloads\\chromedriver_win32\\chromedriver.exe");

		
		 driver= new ChromeDriver();
		}

	
	if(browser.equalsIgnoreCase("ie")) {
		
		System.out.println("browser is ie");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\ankita\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new InternetExplorerDriver();
	}
	
	}
@Test

public void launchurl() {
	driver.get("https://www.google.co.in/?gws_rd=ssl");
	String str= driver.getTitle();
	System.out.println(str);
	
	
	
}

@AfterClass
public void closebrowser() {
	driver.quit();
	
}
}
