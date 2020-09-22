package com.qa.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.p1.TestBase;

public class testingCRM extends TestBase {
	
	
	@Test(priority=1)
	public void CRMPage(){
		driver.navigate().to("https://www.freecrm.com/index.html");
		System.out.println("opened FreeCRM");
	}
}
