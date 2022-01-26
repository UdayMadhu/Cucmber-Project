package com.adactinpom;

import org.concept.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel extends BaseClass {
	
	public BookAHotel() {
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(name="first_name")
	private WebElement txtFirstname;
	
	@FindBy(name="last_name")
	private WebElement txtLastname;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCcNum;
	
	@FindBy(id="cc_type")
	private WebElement dDnCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement dDnCcExpMon;
	
	@FindBy(id="cc_exp_year")
	private WebElement dDnCcExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCvv;
	
	@FindBy(name="book_now")
	private WebElement btnBook;
	
	@FindBy(xpath="(//td[@class='login_title'])[2]")
	private WebElement txtBook;

	public WebElement getTxtFirstname() {
		return txtFirstname;
	}

	public WebElement getTxtLastname() {
		return txtLastname;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCcNum() {
		return txtCcNum;
	}

	public WebElement getdDnCardType() {
		return dDnCardType;
	}

	public WebElement getdDnCcExpMon() {
		return dDnCcExpMon;
	}

	public WebElement getdDnCcExpYear() {
		return dDnCcExpYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}
	
	public void bookHotel(String firstName, String lastName, String address, String ccNumber, String cardType, String cardExpMon, String cardExpYear, String cvv) {
		
		
		String text = getText(getTxtBook());
		boolean contains = text.contains("Book A Hotel");
		Assert.assertTrue("Verify Login Failure", contains);
		System.out.println("Book Hotel Successfull");
		
		sendkey(getTxtFirstname(), firstName);
		sendkey(getTxtLastname(), lastName);
		sendkey(getTxtAddress(), address);
		sendkey(getTxtCcNum(), ccNumber);
		selectOptionByText(getdDnCardType(), cardType);
		selectOptionByText(getdDnCcExpMon(), cardExpMon);
		selectOptionByText(getdDnCcExpYear(), cardExpYear);
		sendkey(getTxtCvv(), cvv);
		click(getBtnBook());
		
	}

	public WebElement getTxtBook() {
		return txtBook;
	}
	
	
	
}
