package com.crm.comcast.campaignTest;

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

import com.crm.comcast.PomRepository.CampaignPage;
import com.crm.comcast.PomRepository.CreateCamapaignPage;
import com.crm.comcast.PomRepository.HomePage;
import com.crm.comcast.PomRepository.LoginPage;
import com.crm.comcast.genericUtlilty.BaseClass;
import com.crm.comcast.genericUtlilty.Exceluti;
import com.crm.comcast.genericUtlilty.Javauti;
import com.crm.comcast.genericUtlilty.Propertyuti;
import com.crm.comcast.genericUtlilty.Webdriveruti;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaignTest extends BaseClass{

//	public static void main(String[] args) throws Throwable {
		
//		Javauti juti=new Javauti();
//		Webdriveruti wbuti = new Webdriveruti();
//		Exceluti euti= new Exceluti();
//    	Propertyuti puti=new Propertyuti();
    	
    	//WebDriver driver=wbuti.getWebbrowser();
    	//WebDriver driver1=driver;
    	
//    		String brows = puti.propertyuti("browser");
//    		WebDriver driver;
//    		if(brows.equals("firefox"))
//    		{
//    		    driver= new FirefoxDriver();
//    		}else if(brows.equals("chrome")){
//    			WebDriverManager.chromedriver().setup();
//    			 driver= new ChromeDriver();
//    			
//    		}else if(brows.equals("ie")) {
//    			 driver = new InternetExplorerDriver();
//    		}else {
//    			WebDriverManager.chromedriver().setup();
//    			driver = new ChromeDriver();
//    		}
    	

//         LoginPage lp= new LoginPage(driver);
//         String urls = puti.propertyuti("url");
//         String username = puti.propertyuti("uname");
//         String password = puti.propertyuti("pwd");
//		 lp.logintovtiger(urls, username, password);
	@Test(groups = {"smokeTest","regressionTest"})
    	public void createcampaignTest() throws Throwable {
		
		 HomePage hp = new HomePage(driver);
		 hp.getMorelnk().click();
		 hp.campaignclick();
		 CampaignPage cp = new CampaignPage(driver);
		 CreateCamapaignPage crecp = new CreateCamapaignPage(driver);
		 cp.getCreatecampaignplusicon().click();
//			Javauti juti=new Javauti();
//			Webdriveruti wbuti = new Webdriveruti();
//			Exceluti euti= new Exceluti();
//	    	Propertyuti puti=new Propertyuti();
		 String campaignname= elib.exceluti("Sheet1", 1, 3)+jlib.rand();
		 String verifycampaincreation = crecp.createcamapaignname(campaignname);
		 Assert.assertEquals(verifycampaincreation.trim().contains(campaignname),true);
		 //(verifycampaincreation.trim().contains(campaignname))
//		 {
//			 System.out.println("Camapaign created");
//		 }
//		 else
//		 {
//			 System.out.println("Camapaign not created");
//
//		 }
//		hp.logout();
		
		
	

	}
}


