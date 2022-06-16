package com.crm.comcast.organisationTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.comcast.PomRepository.ContactsPage;
import com.crm.comcast.PomRepository.CreateContactPage;
import com.crm.comcast.PomRepository.CreateOrganisationPage;
import com.crm.comcast.PomRepository.HomePage;
import com.crm.comcast.PomRepository.LoginPage;
import com.crm.comcast.PomRepository.OraganisationPage;
import com.crm.comcast.genericUtlilty.BaseClass;
import com.crm.comcast.genericUtlilty.Exceluti;
import com.crm.comcast.genericUtlilty.Javauti;
import com.crm.comcast.genericUtlilty.Propertyuti;
import com.crm.comcast.genericUtlilty.Webdriveruti;
import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrgTest extends BaseClass {
	@Test(groups = "smokeTest")
	public void createorganisationTest() throws Throwable {

		HomePage hp = new HomePage(driver);
		hp.getOrgansiationlink().click();
		OraganisationPage og = new OraganisationPage(driver);
		og.getCreateorgplusicn().click();
		CreateOrganisationPage cog = new CreateOrganisationPage(driver);
		String orgname = elib.exceluti("Sheet1", 1, 2)+jlib.rand();
		//cog.getSaveorgname().click();

		String orgcreationverification = cog.Createorg(orgname);

		if(orgcreationverification.contains(orgname))
		{
		System.out.println("organisation created");
		}
		
	}
	
	@Test(groups = {"smokeTest","regressionTest"})
	public void createcontactTestinorg() throws Throwable {
		
	ContactsPage cp = new  ContactsPage(driver);
	cp.getContactsp().click();
	cp.clickoncreatepluscont();
	CreateContactPage cc = new CreateContactPage(driver);

	String firstname = elib.exceluti("Sheet1", 1, 0)+jlib.rand();
	String lastname = elib.exceluti("Sheet1", 0, 1);
   String title = cc.createnewcont(firstname, lastname);
	 if(title.contains(lastname)&&title.contains(firstname))
	 {
		 System.out.println("Contact Created"); 
	 }
	 else {
    	  System.out.println("Contact not created");
      }
	 
	}
	
	
}
		
		

		
		
		
		
	