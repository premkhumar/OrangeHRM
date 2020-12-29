package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends LibGlobal{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//span[@class='quickLinkText'])[4]")
	private WebElement lkApplyLeave;
	
	@FindBy(xpath="(//span[@class='quickLinkText'])[1]")
	private WebElement lkAssignLeave;
	
	@FindBy(xpath="(//span[@class='quickLinkText'])[2]")
	private WebElement lkLeaveList;
	
	@FindBy(xpath="(//span[@class='quickLinkText'])[3]")
	private WebElement lkTimeSheets;
	
	@FindBy(xpath="(//span[@class='quickLinkText'])[5]")
	private WebElement lkMyLeave;
	
	@FindBy(xpath="(//span[@class='quickLinkText'])[6]")
	private WebElement lkMyTimeSheet;
	
	@FindBy(xpath="//a[@id='welcome']")
	private WebElement lkWelcome;

	public WebElement getLkApplyLeave() {
		return lkApplyLeave;
	}

	public WebElement getLkAssignLeave() {
		return lkAssignLeave;
	}

	public WebElement getLkLeaveList() {
		return lkLeaveList;
	}

	public WebElement getLkTimeSheets() {
		return lkTimeSheets;
	}

	public WebElement getLkMyLeave() {
		return lkMyLeave;
	}

	public WebElement getLkMyTimeSheet() {
		return lkMyTimeSheet;
	}

	public WebElement getLkWelcome() {
		return lkWelcome;
	}
	
	
	
}
