package com.crm.comcast.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.genericUtlilty.Exceluti;
import com.crm.comcast.genericUtlilty.Webdriveruti;

public class CampaignPage extends Webdriveruti {
	
	WebDriver driver ;
	Exceluti euti = new Exceluti();
	
	public CampaignPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@alt='Create Campaign...']")
	 private WebElement createcampaignplusicon;
	
	
	@FindBy(name = "search_text")
	private WebElement campaignsearchfrdeletetxtbox;
	
	
	@FindBy(id= "bas_searchfield")
	private WebElement camapainpagedropdown;
		
	@FindBy(xpath = "//input[@onclick='check_object(this)']/../../../tr[3]/td[1]/input")
	private WebElement campaigndelcheckboxfirst;
	
	@FindBy(name  ="submit")
	private WebElement camapainsreachnow;
	
	@FindBy(xpath ="//input[@class='crmbutton small delete']")
    private WebElement campaigndelete;
    
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreatecampaignplusicon() {
		return createcampaignplusicon;
	}

	public WebElement getCampaignsearchfrdeletetxtbox() {
		return campaignsearchfrdeletetxtbox;
	}

	public WebElement getCamapainpagedropdown() {
		return camapainpagedropdown;
	}

	public WebElement getCampaigndelcheckboxfirst() {
		return campaigndelcheckboxfirst;
	}

	public WebElement getCamapainsreachnow() {
		return camapainsreachnow;
	}
	
	
	
	public void createcontactplusicon()
	{
		createcampaignplusicon.click();
	}
	
	public void delectcampaign(String sheetname,int rownum,int colnum,int index, String expectedMsg) throws Throwable
	{
		campaignsearchfrdeletetxtbox.sendKeys(euti.exceluti(sheetname, rownum, colnum));
		select(camapainpagedropdown, index);
		camapainsreachnow.click();
		campaigndelcheckboxfirst.click();
		campaigndelete.click();
    	swithToAlertWindowAndAccpect(driver, expectedMsg);


	}
}


