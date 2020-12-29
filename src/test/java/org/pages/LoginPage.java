package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtUsername")
	private WebElement txtUserName;
	
	@FindBy(id="txtPassword")
	private WebElement txtPassWord;
	
	@FindBy(name="Submit")
	private WebElement btnSubmit;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	
	

}
