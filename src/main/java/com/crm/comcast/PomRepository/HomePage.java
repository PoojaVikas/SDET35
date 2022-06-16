package com.crm.comcast.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.genericUtlilty.Webdriveruti;

public class HomePage extends Webdriveruti {
	
    Webdriveruti wuti = new Webdriveruti();
    WebDriver driver ;
    
    public HomePage(WebDriver driver)
	{
    	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement organsiationlink;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactslink;
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productslink;
	
	@FindBy (xpath = "//a[text()='More']")
	private WebElement morelnk;
	
	@FindBy(name = "Campaigns")
	private WebElement campaignslink;
	
	@FindBy(xpath = "//a[text()='Purchase Order']")
	private WebElement purchaselink;

	public WebElement getPurchaselink() {
		return purchaselink;
	}


	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement signimg;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signoutlink;
	
	public WebElement getSignimg() {
		return signimg;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}

	public WebElement getOrgansiationlink() {
		return organsiationlink;
	}

	public WebElement getContactslink() {
		return contactslink;
	}

	public WebElement getProductslink() {
		return productslink;
	}

	public WebElement getMorelnk() {
		return morelnk;
	}

	public WebElement getCampaignslink() {
		return campaignslink;
	}
	
	public void logout() {
		implicitwait(driver);
        mouseOverOnElement(driver, signimg);
		signoutlink.click();
		
	}
	
	public void campaignclick()
	{
		mouseOverOnElement(driver, morelnk);
		campaignslink.click();
		
	}
	
	public void purchaselinks() {
		mouseOverOnElement(driver, morelnk);
		getPurchaselink().click();
		
	}
}
