package com.crm.comcast.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.genericUtlilty.Webdriveruti;

public class PurchaseeditPage extends Webdriveruti{
	
	private WebDriver driver;

	public PurchaseeditPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "subject")
	private WebElement editsubjectinpurchaseord;
	
	@FindBy(name = "button")
	private WebElement saveeditedpurchase;
	
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement verifypurordinfo;

	public WebElement getEditsubjectinpurchaseord() {
		return editsubjectinpurchaseord;
	}

	public WebElement getSaveeditedpurchase() {
		return saveeditedpurchase;
	}

	public WebElement getVerifypurordinfo() {
		return verifypurordinfo;
	}
	

	public String saveeditedpurchaseord(String newsubname, WebDriver driver, String expectedmsg){
		WebElement esi = editsubjectinpurchaseord;
		esi.clear();
		esi.sendKeys(newsubname);
		saveeditedpurchase.click();
		swithToAlertWindowAndAccpect(driver, expectedmsg);
		String verifyeditedpurchaseinfo =verifypurordinfo.getText();
		return verifyeditedpurchaseinfo;
		
		
	}
}
