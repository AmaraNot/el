package com.qa.p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBase {
	public static WebDriver driver;
	String projectLocation=System.getProperty("user.dir");
	//public String browsername;
	
	
	
	@Parameters("browsername")
	@BeforeTest
	public void initialization(String browsername){
		if(browsername.equalsIgnoreCase("FF")){
			System.setProperty("webdriver.gecko.driver", projectLocation+"\\src\\main\\java\\com\\qa\\libs\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", projectLocation+"\\src\\main\\java\\com\\qa\\libs\\chromedriver.exe");
			driver=new ChromeDriver();}
		
	else if(browsername.equalsIgnoreCase("ie")){
		System.setProperty("webdriver.ie.driver", projectLocation+"\\src\\main\\java\\com\\qa\\libs\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	
	}
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.MILLISECONDS);
}
	
		@AfterTest
		public void tearDown(){
			try {
				driver.quit();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Closed the page by driver.quit");
			WindowsUtils.killByName("IEDriverServer.exe");
		
			System.out.println("Closed the page by IE");
		}
	
	
}
