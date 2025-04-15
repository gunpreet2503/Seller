package com.qa.testcases.ListingUpload;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.seller.qa.base.base;
import com.seller.qa.pages.listingUpload.AddListing;
import com.seller.testutils.TestUtil;

public class AddListingUpload extends base{
	AddListing add;
	
	public AddListingUpload() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

@BeforeMethod
public void setUp() throws IOException  {
	initialization();
	//AddListing = new AddListing();
	add=new AddListing();
	
}

public boolean login() {
	add.broker.click();
	add.username.sendKeys(prop.getProperty("username"));
	add.continu.click();
	add.password.sendKeys(prop.getProperty("password"));
	System.out.println("pass");
	add.submit.click();
	return add.login.isDisplayed();	
	
	
}

@Test(priority=1)
public void display() throws InterruptedException{
	
login();
boolean flag=add.login.isDisplayed();	
Assert.assertTrue(flag);

}



@Test(priority=2, dependsOnMethods= {"display"})
public void listingUpload() throws InterruptedException {
	login();
	driver.get(prop.getProperty("Listing"));
	Thread.sleep(500);
	add.residential.click();
	add.buy();
	
	
	
}

@AfterMethod
public void tear() {
	
	driver.quit();
}
	
}
