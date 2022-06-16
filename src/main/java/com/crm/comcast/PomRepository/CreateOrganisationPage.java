package com.crm.comcast.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganisationPage {
	
	WebDriver driver ;
	public CreateOrganisationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createorgplusicon;
	
	@FindBy(name ="accountname")
	private WebElement orgnametxtbox;
	
	@FindBy(name = "button")
	private WebElement saveorgname;
	
	   @FindBy(xpath = "//span[@class='dvHeaderText']")
	   private WebElement orgcreateverify;
	   
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreateorgplusicon() {
		return createorgplusicon;
	}

	public WebElement getOrgnametxtbox() {
		return orgnametxtbox;
	}

	public WebElement getSaveorgname() {
		return saveorgname;
	}
	
	public String Createorg(String orgname) throws Throwable
	{
		orgnametxtbox.sendKeys(orgname);
		saveorgname.click();
		Thread.sleep(3000);
		String otitle = orgcreateverify.getText();
		return otitle;
	}

	public WebElement getOrgcreateverify() {
		return orgcreateverify;
	}
	
	
	
	
	
	
	
	
}


