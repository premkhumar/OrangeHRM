package org.test;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.HomePage;
import org.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite extends LibGlobal{
	
	@BeforeSuite
	private void browserLaunch() {

		browserLaunchChrome();
		maxWindows();
		launchUrl("https://opensource-demo.orangehrmlive.com/");
		implicitWait(20);
		
	}
	
	@Test(priority=-1)
	private void login() {

		LoginPage l = new LoginPage();
		sendValue(l.getTxtUserName(), "Admin");
		sendValue(l.getTxtPassWord(), "admin123");
		click(l.getBtnSubmit());
	}
	
	@Test
	private void homePage() {

		HomePage h = new HomePage();
		implicitWait(20);
		click(h.getLkAssignLeave());
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/leave/assignLeave",driver.getCurrentUrl(),"Assign Leave Link Passed" );
		back();
		
		click(h.getLkLeaveList());
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList", driver.getCurrentUrl(),"Leave List Link Passed");
		back();
		
		click(h.getLkMyTimeSheet());
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/time/viewMyTimesheet", driver.getCurrentUrl());
		back();
		
		click(h.getLkMyLeave());
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/leave/viewMyLeaveList", driver.getCurrentUrl());
		back();
		
		click(h.getLkApplyLeave());
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/leave/applyLeave", driver.getCurrentUrl());
		back();
		
		click(h.getLkTimeSheets());
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/time/viewEmployeeTimesheet", driver.getCurrentUrl());
		back();
	}
	
	
	

}
