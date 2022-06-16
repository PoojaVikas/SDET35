package com.crm.comcast.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.genericUtlilty.Exceluti;
import com.crm.comcast.genericUtlilty.Webdriveruti;

public class OraganisationPage extends Webdriveruti {

	Exceluti euti = new Exceluti();
	WebDriver driver;
	 public OraganisationPage(WebDriver driver) {
		 this.driver=driver;;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(name ="search_text")
	 private WebElement orgsearchfortxtbx;
	 
	 @FindBy(id = "bas_searchfield")
	 private WebElement orgsearchdropdown;
	 
	 @FindBy(xpath = "//input[@onclick='check_object(this)']/../../../tr[3]/td[1]/input")
	private WebElement organisationdelcheckboxfirst;
	 
	 @FindBy(name="submit")
	 private WebElement orgsearchfor;
	 
	 @FindBy(xpath = "//input[@value='Delete']")
	 private WebElement organisationdelete;
	 
	 public WebElement getOrganisationdelete() {
		return organisationdelete;
	}

	@FindBy(xpath = "//img[@alt='Create Organization...']")
	 private WebElement createorgplusicn;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrgsearchfortxtbx() {
		return orgsearchfortxtbx;
	}

	public WebElement getOrgsearchdropdown() {
		return orgsearchdropdown;
	}

	public WebElement getOrganisationdelcheckboxfirst() {
		return organisationdelcheckboxfirst;
	}

	public WebElement getOrgsearchfor() {
		return orgsearchfor;
	}

	public WebElement getCreateorgplusicn() {
		return createorgplusicn;
	}
	 
	 public void deleteorganisation(String sheetname,int rownum,int colnum , int index, String expectedMsg) throws Throwable {
		 orgsearchfortxtbx.sendKeys(euti.exceluti(sheetname, rownum, colnum)); 
		 select(orgsearchdropdown, index);
		 orgsearchfor.click();
		 organisationdelcheckboxfirst.click();
		 organisationdelete.click();
		 swithToAlertWindowAndAccpect(driver,expectedMsg);
	 }
	 
	 
	 
}
