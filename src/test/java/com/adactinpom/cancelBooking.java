package com.adactinpom;

import org.concept.BaseClass;
import org.junit.AfterClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cancelBooking extends BaseClass {
	
	public cancelBooking() {
		PageFactory.initElements(driver, this);
		
	
		}
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement btnItinerary;
	
	@FindBy(id="order_id_text")
	private WebElement txtOrderId;
	
	@FindBy(id="search_hotel_id")
	private WebElement btnSearch;
	
	@FindBy(name="ids[]")
	private WebElement btnCheckBox;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement btnCancel;

	public WebElement getBtnItinerary() {
		return btnItinerary;
	}

	public WebElement getTxtOrderId() {
		return txtOrderId;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getBtnCheckBox() {
		return btnCheckBox;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}
	
	public void cancel() {
		BookingConfirmation bookingConfirmation = new BookingConfirmation();
		String a = bookingConfirmation.confirmation();
		System.out.println(a);
		click(getBtnItinerary());
		
		sendkey(getTxtOrderId(),a);
		click(getBtnSearch());
		click(getBtnCheckBox());
		click(getBtnCancel());
		alertOk();
		
	}
	
	
	
	
	
	
	
	
}
