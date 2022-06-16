package com.crm.comcast.contactTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.comcast.PomRepository.ContactsPage;
import com.crm.comcast.PomRepository.CreateContactPage;
import com.crm.comcast.PomRepository.HomePage;
import com.crm.comcast.PomRepository.LoginPage;
import com.crm.comcast.genericUtlilty.BaseClass;
import com.crm.comcast.genericUtlilty.Exceluti;
import com.crm.comcast.genericUtlilty.Javauti;
import com.crm.comcast.genericUtlilty.Propertyuti;
import com.crm.comcast.genericUtlilty.Webdriveruti;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactTest extends BaseClass {

//	public static void main(String[] args) throws Throwable {
		
//		Javauti juti=new Javauti();
//		Webdriveruti wbuti = new Webdriveruti();
//		Exceluti euti= new Exceluti();
//    	Propertyuti puti=new Propertyuti();
//    	
//    	//WebDriver driver=wbuti.getWebbrowser();
//    	
//
//         LoginPage lp= new LoginPage(driver);
//         String urls = puti.propertyuti("url");
//         String username = puti.propertyuti("uname");
//         String password = puti.propertyuti("pwd");
//		lp.logintovtiger(urls, username, password);
		
		@Test(groups = {"smokeTest","regressionTest"})
		public void createcontactTest() throws Throwable {
			
		ContactsPage cp = new  ContactsPage(driver);
		cp.getContactsp().click();
		cp.clickoncreatepluscont();
		CreateContactPage cc = new CreateContactPage(driver);

		String firstname = elib.exceluti("Sheet1", 1, 0)+jlib.rand();
		String lastname = elib.exceluti("Sheet1", 0, 1);
       String title = cc.createnewcont(firstname, lastname);
		 Assert.assertEquals(title.contains(lastname)&&title.contains(firstname),true);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//		 {
//			 System.out.println("Contact Created"); 
//		 }
//		 else {
//	    	  System.out.println("Contact not created");
//	      }
////		 HomePage hp = new HomePage(driver);
//		 hp.logout();
//         driver.quit();

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
