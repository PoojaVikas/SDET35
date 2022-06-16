package com.crm.comcast.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.genericUtlilty.Webdriveruti;

public class LoginPage extends Webdriveruti{   //Rule.no1
	
	
		
	 WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	@FindBy (name="user_name")
	private WebElement unamedt;
	
	@FindBy (name="user_password")
	private WebElement pwdedt;
	
    @FindBy (id ="submitButton")
    private WebElement subbtn;

	public WebElement getUnamedt() {
		return unamedt;
	}

	public WebElement getPwdedt() {
		return pwdedt;
	}

	public WebElement getSubbtn() {
		return subbtn;
	}
	
	/**
	 * @Pooja 
	 * used for logging in
	 */
    
    public void logintovtiger(String username , String password) {
    	//driver.get(url);
    	unamedt.sendKeys(username);
     	pwdedt.sendKeys(password);
    	subbtn.click();
    	
    }
    
	


	
}
