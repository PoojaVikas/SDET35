package com.crm.comcast.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.genericUtlilty.Exceluti;
import com.crm.comcast.genericUtlilty.Webdriveruti;

public class ContactsPage extends Webdriveruti {
	
	 Exceluti euti = new Exceluti();
	  WebDriver driver = null;

	  public ContactsPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
      @FindBy(xpath = "//img[@title='Create Contact...']")
      private WebElement creatcontplus;
      
      @FindBy(xpath = "//a[text()='Contacts']")
      private WebElement contactsp;
      
      public WebElement getContactsp() {
		return contactsp;
	}

	@FindBy (name = "search_text")
      private WebElement contactdelsearcxh;
      
      @FindBy(id = "bas_searchfield")
      private WebElement condeldropdown;
      
      @FindBy(name = "submit")
      private WebElement searchforcontdel;
      

  	  @FindBy(xpath = "//input[@name='selected_id']/../../../tr[3]/td[1]/input")
        private WebElement detecont;
        
      @FindBy(xpath ="//input[@value='Delete']")
        private WebElement contactdelete;
      
      @FindBy(xpath = "//span[@class='genHeaderSmall']")
       private WebElement ifnocontfound;
      
      @FindBy(partialLinkText = "index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing")
      private WebElement ifnocontfoundcretecont;
      
      
      @FindBy(xpath = "//span[@class='genHeaderSmall']")
      private WebElement nocontfound;
      
      public WebElement getIfnocontfound() {
		return ifnocontfound;
	}

	public WebElement getIfnocontfoundcretecont() {
		return ifnocontfoundcretecont;
	}

	public WebElement getCreatcontplus() {
		return creatcontplus;
	}

	public WebElement getContactdelsearcxh() {
		return contactdelsearcxh;
	}

	public WebElement getCondeldropdown() {
		return condeldropdown;
	}

	public WebElement getSearchforcontdel() {
		return searchforcontdel;
	}

	public WebElement getDetecont() {
		return detecont;
	}

	public WebElement getContactdelete() {
		return contactdelete;
	}

      
    public void deletecontact(WebDriver driver,String lastname,int index, String expectedMsg) throws Throwable {
    	
    	contactdelsearcxh.sendKeys(lastname);
    	select(condeldropdown, index);
    	searchforcontdel.click();
    	
    	Thread.sleep(3000);
    	detecont.click();
        contactdelete.click();

    	swithToAlertWindowAndAccpect(driver, expectedMsg);
    }
      
    public void clickoncreatepluscont()
    {
    	creatcontplus.click();
    }
       
      

}
