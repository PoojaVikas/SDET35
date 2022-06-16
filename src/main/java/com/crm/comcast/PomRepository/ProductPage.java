package com.crm.comcast.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.genericUtlilty.Webdriveruti;

public class ProductPage extends Webdriveruti{
	
	WebDriver driver;
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Create Product...']")
	private WebElement productplusicon;
	public WebDriver getDriver() {
		return driver;
	}
	
	@FindBy(name = "search_text")
	private WebElement productsearchfor;
	
	@FindBy(id = "bas_searchfield")
	private WebElement prodsearchdropdown;
	
	@FindBy(name = "submit")
	private WebElement prodsearchnow;
	
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement verifyproinfopage;
	
	@FindBy(xpath = "//a[text()='Create Purchase Order']")
	private WebElement createpurch;
	
	public WebElement getCreatepurch() {
		return createpurch;
	}

	public WebElement getProductsearchfor() {
		return productsearchfor;
	}

	public WebElement getVerifyproinfopage() {
		return verifyproinfopage;
	}

	public WebElement getProductfor() {
		return productsearchfor;
	}

	public WebElement getProdsearchdropdown() {
		return prodsearchdropdown;
	}

	public WebElement getProdsearchnow() {
		return prodsearchnow;
	}

	public WebElement getProductno() {
		return productno;
	}
	
	

	@FindBy(xpath = "//a[@title=\"Products\"]/../../../tr[3]/td[3]/a")
	private WebElement productno;

	public WebElement getProductplusicon() {
		return productplusicon;
	}
	
    	public String producttopurchase(String Productno) {
    		productsearchfor.sendKeys(Productno);
    		select(prodsearchdropdown, 0);
    		prodsearchnow.click();
    		productno.click();
    		String ver = verifyproinfopage.getText();
    		return ver;
    		
    		
    	}
     
	
}


