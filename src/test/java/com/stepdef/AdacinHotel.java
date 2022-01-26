package com.stepdef;

import java.util.List;

import java.util.Map;

import org.concept.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import com.adactinpom.BookAHotel;
import com.adactinpom.BookingConfirmation;
import com.adactinpom.LoginPage;
import com.adactinpom.SearchHotel;
import com.adactinpom.SelectHotel;
import com.adactinpom.cancelBooking;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdacinHotel extends BaseClass {
	WebDriver driver;

	@Given("I am in the adactin hotel login page")
	public void login() {
		getDriver();
		getUrl("http://adactinhotelapp.com/");
		maximize();

	}

	@When("Verify the login with {string} and {string}")
	public void loginDetails(String name, String pass) {
		LoginPage loginPage = new LoginPage();
		loginPage.login(name, pass);
	}

	@When("To search a hotel by {string},{string},{string},{string},{string},{string},{string},{string}")
	public void searchHotel(String location, String hotelName, String rType, String rNos, String chkIn, String chkOut,
			String adultNo, String childNo) throws InterruptedException {

		SearchHotel searchHotel = new SearchHotel();
		searchHotel.searchHotel(location, hotelName, rType, rNos, chkIn, chkOut, adultNo, childNo);
	}

	@When("Select the hotel from the list")
	public void selectHotel() {
		SelectHotel selectHotel = new SelectHotel();
		selectHotel.selHotel();

	}

	@When("Book a hotel by {string},{string},{string},{string},{string},{string},{string},{string}")
	public void book_a_hotel_by(String firstName, String lastName, String address, String ccNumber, String cardType,
			String cardExpMon, String cardExpYear, String cvv) {
		BookAHotel bookAHotel = new BookAHotel();
		bookAHotel.bookHotel(firstName, lastName, address, ccNumber, cardType, cardExpMon, cardExpYear, cvv);

	}

	@Then("Check the Booking Confirmation {string} and get order id")
	public void bookConfirmation(String confirm) throws InterruptedException {
		Thread.sleep(7000);
		BookingConfirmation bookingConfirmation = new BookingConfirmation();
		String confirmation = bookingConfirmation.confirmation();
		
	}
	
	@Then("cancel Booking")
	public void canceBooking() throws InterruptedException {
		Thread.sleep(7000);
		cancelBooking cancelBooking = new cancelBooking();
		cancelBooking.cancel();

	}
		
	

}
