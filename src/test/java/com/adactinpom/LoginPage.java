package com.adactinpom;

import org.concept.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="username")
	private WebElement txtuser;
	
	@FindBy(name="password")
	private WebElement txtPass;
	
	@FindBy(name="login")
	private WebElement btnLogin;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void login(String userName, String Password) {
	sendkey(getTxtuser(), userName);	
	sendkey(getTxtPass(), Password);
	click(getBtnLogin());
	
	
	
	
	
	}
	
	

}
