package com.crm.comcast.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.genericUtlilty.Exceluti;
import com.crm.comcast.genericUtlilty.Webdriveruti;

public class CreateContactPage extends Webdriveruti {
	
   Exceluti euti = new Exceluti();
   WebDriver driver = null;
   
   public CreateContactPage(WebDriver driver)
	{
	   this.driver = driver;
		PageFactory.initElements(driver, this);
	}
   
   @FindBy(name = "salutationtype")
    private WebElement confirstnammesalutation;
   
   @FindBy(name = "firstname")
   private WebElement contfirstname;
   
   @FindBy(name = "lastname")
   private WebElement contlastname;
   
   @FindBy(name = "button")
   private WebElement contactsave;
   
   @FindBy(xpath = "//span[@class='dvHeaderText']")
   private WebElement contactcreateverify;
   
   
   @FindBy(name = "Delete")
   private WebElement deletecreatedcontact;
   
   @FindBy(name = "search_text")
   private WebElement searchfordel;
   
   @FindBy(id="bas_searchfield")
    private WebElement selectfordel;
   
   @FindBy(name="submit")
   private WebElement searchnowdel;
   
   @FindBy(xpath = "//span[@class='genHeaderSmall']")
   private WebElement verifydel;
   
   @FindBy(xpath="//a[@href='index.php?module=Contacts&action=Import&step=1&return_module=Contacts&return_action=ListView&parenttab=Marketing']")
   private WebElement importcont;
   
   
public WebElement getImportcont() {
	return importcont;
}

public WebElement getSearchfordel() {
	return searchfordel;
}

public WebElement getSelectfordel() {
	return selectfordel;
}

public WebElement getSearchnowdel() {
	return searchnowdel;
}

public WebElement getVerifydel() {
	return verifydel;
}

public Exceluti getEuti() {
	return euti;
}

public WebElement getContactcreateverify() {
	return contactcreateverify;
}

public WebDriver getDriver() {
	return driver;
}

public WebElement getConfirstnammesalutation() {
	return confirstnammesalutation;
}

public WebElement getContfirstname() {
	return contfirstname;
}

public WebElement getContlastname() {
	return contlastname;
}

public WebElement getContactsave() {
	return contactsave;
}
 
public WebElement getDeletecreatedcontact() {
	return deletecreatedcontact;
}

 public String createnewcont(String firstname ,String lastname) throws Throwable
 {
	 select(getConfirstnammesalutation(), 1);
	 contfirstname.sendKeys(firstname);
	 contlastname.sendKeys(lastname);
	 contactsave.click();
	 String ctitle =contactcreateverify.getText();
	 System.out.println(ctitle);
	 return ctitle;
 }
 
 public String deletecontact(String expected,String firstname ) {
	 
	 getDeletecreatedcontact().click();
	 swithToAlertWindowAndAccpect(driver, expected);
	 searchfordel.sendKeys(firstname);
	 select(selectfordel, 1);
	 searchnowdel.click();
	 String verify = verifydel.getText();
	// getImportcont().click();
	return verify;
 }

 public void createcontwithoutlastname(String firstname,String expected) {
	 select(getConfirstnammesalutation(), 1);
	 contfirstname.sendKeys(firstname);
	 contactsave.click();
	 swithToAlertWindowAndAccpect(driver, expected);
	 
	 
	 
 }

 
}
	

