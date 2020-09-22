package com.qa.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.p1.TestBase;

public class testngBrowser extends TestBase {
	
	
	@Test(priority=1)
	public void GooglePage(){
		driver.navigate().to("https://www.google.co.uk/?gfe_rd=cr&dcr=0&ei=bPF6WrjPIcn38AfFibWwDw");
		System.out.println("opened Google");
	}
}
