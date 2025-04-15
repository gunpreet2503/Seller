package com.seller.qa.pages.listingUpload;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.seller.qa.base.base;

public class AddListing extends base {

	

	@FindBy(xpath = "//div//a[contains(.,'Seller')]")
	public WebElement login;
	
	@FindBy(xpath = "//input[@type='password']")
	public WebElement password;
	

	@FindBy(xpath = "//button[contains(.,'Submit')]")
	public WebElement submit;

	@FindBy(xpath = "//div[@class='PRE_LOGIN_MORE_INFO css-3nwatc']//div//div[contains(.,'Broker/Builder')]")
	public WebElement broker;

	@FindBy(xpath = "//input[@type='tel']")
	public WebElement username;
	
	@FindBy(xpath = "//button[contains(.,'Continue')]")
	public WebElement continu;
	
	@FindBy(xpath = "//div[@class='css-i1kau8']//input[@type='text']")
	public WebElement address;
	
	@FindBy(xpath = "//div[@class='toggle-label'][normalize-space()='Sell']")
	public WebElement buy;
	@FindBy(xpath = "//div[@class='property-icon independent floor']")
	public WebElement propertytype;
	@FindBy(xpath = "//li[contains(.,'Ajmer')]")
	public WebElement citydropdown;
	@FindBy(xpath = "//div[@class='addressParent css-74ds4j']//input[@type='text']")
	public WebElement apartment;
	@FindBy(xpath = "//div[contains(text(),'2 BHK')]")
	public WebElement bhk;
	@FindBy(xpath = "//div[@class='rf-group radio-group total_balcony_count']//div[@class='rf-toggle radio radio-1 toggle-tag pills']")
	public WebElement balcony;
	@FindBy(xpath = "//div[@class='rf-group radio-group covered_parking_count']//div[@class='toggle-label'][normalize-space()='1']")
	public WebElement coveredParking;
	@FindBy(xpath = "//div[@class='rf-group radio-group open_parking_count']//div[@class='rf-toggle radio radio-1 toggle-tag pills']")
	public WebElement openParking;
	@FindBy(xpath = "//span[normalize-space()='Fully Furnished']")
	public WebElement furnishType;
	@FindBy(xpath = "//div[contains(text(),'Resale')]")
	public WebElement transactiontype;
	@FindBy(xpath = "//input[@paramstate='flat_details.built_up_area']")
	public WebElement builtArea;
	@FindBy(xpath = "//input[@paramstate='floor_number']")
	public WebElement floorNo;
	
	@FindBy(xpath = "//div[@class='rf-toggle radio radio-1 toggle-tag pills']//div[@class='toggle-label'][normalize-space()='2']")
	public WebElement bathroom;
	
	@FindBy(xpath = "//input[@shortlabel='Total Floors']")
	public WebElement TotalFloot;
	
	@FindBy(xpath = "//div[@class='rf-group radio-group is_buy_brokerage_chargeable']//div[@class='rf-toggle radio radio-1 toggle-tag pills']")
	public WebElement brokerage;
	
	
	@FindBy(xpath = "//div[contains(text(),'Ready to Move')]")
	public WebElement constructionResale;
	@FindBy(xpath = "//input[@paramstate='flat_details.age_of_property']")
	public WebElement Age;
	
	@FindBy(xpath = "//div[contains(text(),'Residential')]")
	public WebElement residential;
	
	@FindBy(xpath = "//li[contains(.,'Nirala Hills, Pragati Nagar')]")
	public WebElement apartmentSelect;
	
	@FindBy(xpath = "//input[@plottitle='Plot Price']")
	public WebElement price;
	
	@FindBy(xpath = "//button[contains(.,'Next')]")
	public WebElement Addressnext;
	
	
	
	public AddListing() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}
	
	public void buy() throws InterruptedException {
		buy.click();
		Address_Common();
		propertytype.click();
		House_details();

		
		
		
	}
	public void Address_Common() throws InterruptedException {
	address.click();
	address.sendKeys("Ajmer");
	citydropdown.click();
	apartment.sendKeys("Nirala hills");
	apartmentSelect.click();
	Thread.sleep(500);
	}
	public void House_details() throws InterruptedException{
		bhk.click();
		Thread.sleep(500);
		bathroom.click();
		balcony.click();
		coveredParking.click();
		openParking.click();
		furnishType.click();
		Brokerage();
		transactiontype.click();
		construction();
		Thread.sleep(500);
		builtArea.click();
		builtArea.sendKeys("1000");
		floorNo.sendKeys("1");
		TotalFloot.sendKeys("2");
		price.sendKeys("2000000");
		Addressnext.click();
		
	}
	public void Brokerage() {
		brokerage.click();
		
	}
	public void construction() throws InterruptedException {
		
		constructionResale.click();
		//Thread.sleep(500);
		Age.sendKeys("3");
	}
}
