package com.crm.comcast.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.genericUtlilty.Webdriveruti;

public class CreatePurchasePage extends Webdriveruti {
	
	private WebDriver driver;

	public CreatePurchasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "subject")
	private WebElement purchaseordersub;
	
	@FindBy(xpath = "//img[@alt='Select']")
	private WebElement vendorplusicon;
	
	@FindBy(name = "search_text")
	private WebElement vendornamesearch;
	
	@FindBy(name = "search_field")
	private WebElement vendorsearchdropdown;
	
	@FindBy(name = "search")
	private WebElement vendorsearchfor;
	
	@FindBy(xpath = "//a[@href='javascript:window.close();']/../../../tr[2]/td[1]/a")
	private WebElement vendornameclick;
	
	public WebElement getVendorsearchdropdown() {
		return vendorsearchdropdown;
	}

	public WebElement getVendornameclick() {
		return vendornameclick;
	}

	@FindBy(name ="button")
	private WebElement savevendor;
	
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement verifyvendorprodinfo;

	@FindBy(name = "bill_street")
	private WebElement billingadress;
	
	@FindBy(xpath = "//input[@onclick='return copyAddressRight(EditView)']")
	private WebElement cpybillingad;
	
	@FindBy(name = "ship_street")
	private WebElement shippingadress;

	public WebElement getBillingadress() {
		return billingadress;
	}

	public WebElement getCpybillingad() {
		return cpybillingad;
	}

	public WebElement getShippingadress() {
		return shippingadress;
	}

	public WebElement getVerifyvendorprodinfo() {
		return verifyvendorprodinfo;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPurchaseordersub() {
		return purchaseordersub;
	}

	public WebElement getVendorplusicon() {
		return vendorplusicon;
	}

	public WebElement getVendornamesearch() {
		return vendornamesearch;
	}

	public WebElement getVendorsearcdropdown() {
		return vendorsearchdropdown;
	}

	public WebElement getVendorsearchfor() {
		return vendorsearchfor;
	}

	public WebElement getSavevendor() {
		return savevendor;
	}
	
	public String Createvendorinpurchase(String vendorsubname,String vendorname, String billingaddress) throws InterruptedException {
		String pid = driver.getWindowHandle();
		purchaseordersub.sendKeys(vendorsubname);
		vendorplusicon.click();
		swithToWindow(driver, "Popup&html=Popup_picker&popuptype=specific_vendor_address&form=EditView&fromlink=");
		vendornamesearch.sendKeys(vendorname);
		select(vendorsearchdropdown, 0);
		vendorsearchfor.click();
		vendornameclick.click();
		driver.switchTo().window(pid);
		String verifyven = verifyvendorprodinfo.getText();
		billingadress.sendKeys(billingaddress);
		cpybillingad.click();
		savevendor.click();
		Thread.sleep(3000);

		
		return verifyven;

		
		
		
	}
	

}
