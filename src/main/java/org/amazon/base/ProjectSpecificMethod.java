package org.amazon.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	
	public static ChromeDriver driver;
	
	@BeforeMethod
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	

}
