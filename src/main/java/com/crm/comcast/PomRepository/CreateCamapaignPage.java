	package com.crm.comcast.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.genericUtlilty.Exceluti;
import com.crm.comcast.genericUtlilty.Webdriveruti;

public class CreateCamapaignPage extends Webdriveruti {
	
	WebDriver driver;
	Exceluti euti = new Exceluti();
	
	public CreateCamapaignPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(name="campaignname")
	private WebElement WebEcamapaignnametxtbox ;
	
	@FindBy(xpath = "//input[@class='crmButton small save']")
	private WebElement createcampaignsavebtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getWebEcamapaignnametxtbox() {
		return WebEcamapaignnametxtbox;
	}

	public WebElement getCreatecampaignsavebtn() {
		return createcampaignsavebtn;
	}
	
	@FindBy(xpath ="//img[@alt='Select']")
	private WebElement addprodincampainpage;
	
	public WebElement getAddprodincampainpage() {
		return addprodincampainpage;
	}
    
	@FindBy(id = "search_txt")
	private WebElement searcgtxtinprodincampaincreate;
	
	@FindBy(name="search_field")
	private WebElement searcgdropdowninprodincampaincreate;
	
	@FindBy(name ="search")
	private WebElement searchnowinprodincampaign;
	
	@FindBy(xpath="//a[@href='javascript:window.close();']/../../../tr[2]/td[1]/a")
	private WebElement clickonprodincampin;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement verifycreatecmapaign;
	
	public WebElement getVerifycreatecmapaign() {
		return verifycreatecmapaign;
	}

	public Exceluti getEuti() {
		return euti;
	}

	public WebElement getSearcgtxtinprodincampaincreate() {
		return searcgtxtinprodincampaincreate;
	}

	public WebElement getSearcgdropdowninprodincampaincreate() {
		return searcgdropdowninprodincampaincreate;
	}

	public WebElement getSearchnowinprodincampaign() {
		return searchnowinprodincampaign;
	}

	public WebElement getClickonprodincampin() {
		return clickonprodincampin;
	}

	public String createcamapainwithproduct(String campainname,String prodname,WebDriver driver , String partialWindowTitle ,int index) throws Throwable {
		WebEcamapaignnametxtbox.sendKeys(campainname);
		addprodincampainpage.click();
		String pid = driver.getWindowHandle();
		swithToWindow(driver,partialWindowTitle);
		searcgtxtinprodincampaincreate.sendKeys(prodname);
		//Thread.sleep(3000);
		select(searcgdropdowninprodincampaincreate, index);
		searchnowinprodincampaign.click();
		Thread.sleep(3000);
		clickonprodincampin.click();
		Thread.sleep(3000);
		driver.switchTo().window(pid);
		createcampaignsavebtn.click();
		String campainvprod = getVerifycreatecmapaign().getText();
		return campainvprod;
		
		
	}
	
	public String createcamapaignname(String campaignname) {
		WebEcamapaignnametxtbox.sendKeys(campaignname);
		createcampaignsavebtn.click();
		String campainv = getVerifycreatecmapaign().getText();
		return campainv;

		
	}
	
	
}
