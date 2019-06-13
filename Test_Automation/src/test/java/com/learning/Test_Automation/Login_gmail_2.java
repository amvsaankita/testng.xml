package com.learning.Test_Automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login_gmail_2 {
	
	
	public WebDriver driver;
	
	
	
	
	@BeforeClass
    @Parameters(value="browser")

	public void openbrpwser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			
			 final String USERNAME = "ankita177";
			  final String AUTOMATE_KEY = "LzmpsJNXrYpkddWtR2wo";
			  final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankita\\Downloads\\chromedriver_win32\\chromedriver.exe");
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("os_version", "11");
			caps.setCapability("device", "iPhone 8 Plus");
			caps.setCapability("real_mobile", "true");
			caps.setCapability("browserstack.local", "false");
		
	//	 driver= new ChromeDriver(caps);
		
		    try {
				 driver = new RemoteWebDriver(new URL(URL), caps);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		}

	
	if(browser.equalsIgnoreCase("ie")) {
		
		System.out.println("browser is ie");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\ankita\\Downloads\\chromedriver_win32\\chromedriver.exe");

	//	driver = new InternetExplorerDriver();
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
