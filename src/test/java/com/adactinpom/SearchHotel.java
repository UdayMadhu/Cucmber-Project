package com.adactinpom;

import org.concept.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(name="location")
	private WebElement dDnLocation;
	
	@FindBy(name="hotels")
	private WebElement dDnHotels;
	
	@FindBy(id="room_type")
	private WebElement dDnRtype;
	
	@FindBy(id="room_nos")
	private WebElement dDnRnos;
	
	@FindBy(name="datepick_in")
	private WebElement txtChkIn;
	
	@FindBy(name="datepick_out")
	private WebElement txtChkOut;
	
	@FindBy(name="adult_room")
	private WebElement dDnAdultNos;
	
	
	@FindBy(id="child_room")
	private WebElement dDnChildNos;
	
	
	@FindBy(name="Submit")
	private WebElement btnSearch;
	
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement txtsearchHotel;


	public WebElement getdDnLocation() {
		return dDnLocation;
	}


	public WebElement getdDnHotels() {
		return dDnHotels;
	}


	public WebElement getdDnRtype() {
		return dDnRtype;
	}


	public WebElement getdDnRnos() {
		return dDnRnos;
	}


	public WebElement getTxtChkIn() {
		return txtChkIn;
	}


	public WebElement getTxtChkOut() {
		return txtChkOut;
	}


	public WebElement getdDnAdultNos() {
		return dDnAdultNos;
	}


	public WebElement getdDnChildNos() {
		return dDnChildNos;
	}


	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	
	public WebElement getTxtsearchHotel() {
		return txtsearchHotel;
	}


	public void searchHotel(String location, String hotelName, String rType, String rNos, String chkIn, String chkOut,String adultNo, String childNo ) {
		
		String text = getText(getTxtsearchHotel());
		boolean contains = text.contains("Search Hotel (Fields marked with Red asterix (*) are mandatory)");
		Assert.assertTrue("Verify Login Failure", contains);
		System.out.println("Login Successfull");
		
		selectOptionByText(getdDnLocation(), location);
		selectOptionByText(getdDnHotels(), hotelName);
		selectOptionByText(getdDnRtype(), rType);
		selectOptionByText(getdDnRnos(), rNos);
		inserJs(getTxtChkIn(), chkIn);
		inserJs(getTxtChkOut(),chkOut);
		selectOptionByText(getdDnAdultNos(), adultNo);
		selectOptionByText(getdDnChildNos(), childNo);
		click(getBtnSearch());
		
	}
	

}
