package com.adactinpom;

import org.concept.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseClass {
	
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="order_no")
	private WebElement orderId;
	
	@FindBy(xpath="(//td[@class='login_title'])")
	private WebElement txtConfirm;

	public WebElement getOrderId() {
		return orderId;
	}
	
	public WebElement getTxtConfirm() {
		return txtConfirm;
	}

	public String confirmation() {
		
		String ordId = getAttribute(getOrderId());
		return ordId;
		
		}
	
	
	
	

}
