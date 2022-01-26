package com.adactinpom;

import org.concept.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(name="radiobutton_0")
	private WebElement btnRadio;
	
	@FindBy(name="continue")
	private WebElement btncontinue;
	
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement txtSelect;

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
	public WebElement getTxtSelect() {
		return txtSelect;
	}

	public void selHotel() {
	
		String text = getText(getTxtSelect());
		boolean contains = text.contains("Select Hotel");
		Assert.assertTrue("Verify Login Failure", contains);
		System.out.println("Search Hotel Successfull");
		
		
		click(getBtnRadio());
		click(getBtncontinue());
		
		
		
	}
	
	
}
