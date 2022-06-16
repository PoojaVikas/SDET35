package com.crm.comcast.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.genericUtlilty.Webdriveruti;

public class PurchasePage extends Webdriveruti {
	
	WebDriver driver;
	public PurchasePage (WebDriver driver) {
		this.driver=driver;
	   PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "search_text")
	private WebElement purchasesearchfor;
	
	@FindBy(id = "bas_searchfield")
	private WebElement purchasedropdown;
	
	@FindBy(name = "submit")
	private WebElement purchasesearchnow;
	
	@FindBy(xpath = "//a[@title=\"Purchase Order\"]/../../../tr[3]/td[3]/a")
	private WebElement subjectinpurchoreder;
	
	@FindBy(xpath = "//span[@class='small']")
     private WebElement purchaseorderverify;
	
	@FindBy(name = "Edit")
	private WebElement purchaseoredit;

	public WebElement getPurchasesearchfor() {
		return purchasesearchfor;
	}

	public WebElement getPurchasedropdown() {
		return purchasedropdown;
	}

	public WebElement getPurchasesearchnow() {
		return purchasesearchnow;
	}

	public WebElement getSubjectinpurchoreder() {
		return subjectinpurchoreder;
	}

	public WebElement getPurchaseorderverify() {
		return purchaseorderverify;
	}

	public WebElement getPurchaseoredit() {
		return purchaseoredit;
	}
	
	
	public String editpurchaseorder(String subject) throws InterruptedException {
		purchasesearchfor.sendKeys(subject);
		select(purchasedropdown, 1);
		Thread.sleep(3000);
		purchasesearchnow.click();
		subjectinpurchoreder.click();
		String purverify = purchaseorderverify.getText();
		purchaseoredit.click();
		return purverify;
		
	}
}
