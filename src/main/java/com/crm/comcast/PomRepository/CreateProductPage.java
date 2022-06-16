package com.crm.comcast.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage {
	
	WebDriver driver ;
	public CreateProductPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(name = "productname")
	private WebElement newprodtxtbox;
	
	@FindBy(xpath = "//input[@class='crmbutton small save']")
	private WebElement newprodsave;
	
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement verifyprodcreation;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getNewprodtxtbox() {
		return newprodtxtbox;
	}

	public WebElement getVerifyprodcreation() {
		return verifyprodcreation;
	}

	public WebElement getNewprodsave() {
		return newprodsave;
	}
	
	public String createnewprod(String prodname ) {
		newprodtxtbox.sendKeys(prodname);
		newprodsave.click();
		String ptitle = verifyprodcreation.getText();
		return ptitle;
		
	}
}

