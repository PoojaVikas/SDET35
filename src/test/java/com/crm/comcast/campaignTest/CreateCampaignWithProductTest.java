package com.crm.comcast.campaignTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;

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
import com.crm.comcast.PomRepository.CreateProductPage;
import com.crm.comcast.PomRepository.HomePage;
import com.crm.comcast.PomRepository.LoginPage;
import com.crm.comcast.PomRepository.ProductPage;
import com.crm.comcast.genericUtlilty.BaseClass;
import com.crm.comcast.genericUtlilty.Exceluti;
import com.crm.comcast.genericUtlilty.Javauti;
import com.crm.comcast.genericUtlilty.Propertyuti;
import com.crm.comcast.genericUtlilty.Webdriveruti;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaignWithProductTest extends BaseClass{

//	public static void main(String[] args) throws Throwable {
		
	
//		Propertyuti puti=new Propertyuti();
//		Exceluti euti =new Exceluti();
//		Javauti juti=new Javauti();
//		Webdriveruti wuti= new Webdriveruti();
//		String brows = puti.propertyuti("browser");
//		WebDriver driver;
//		if(brows.equals("firefox"))
//		{
//		    driver= new FirefoxDriver();
//		}else if(brows.equals("chrome")){
//			WebDriverManager.chromedriver().setup();
//			 driver= new ChromeDriver();
//			
//		}else if(brows.equals("ie")) {
//			 driver = new InternetExplorerDriver();
//		}else {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}		
//		LoginPage lp = new LoginPage(driver);
//        String urls = puti.propertyuti("url");
//        String username = puti.propertyuti("uname");
//        String password = puti.propertyuti("pwd");
//		 lp.logintovtiger(urls, username, password);
		@Test(groups = "smokeTest")
		public void createcampaignwithproductTest  () throws Throwable
		{
		 HomePage hp = new HomePage(driver);
		 hp.getProductslink().click();
		 ProductPage pp = new ProductPage(driver);
		 pp.getProductplusicon().click();
		 CreateProductPage cpp = new CreateProductPage(driver);
		 String prodname = elib.exceluti("Sheet1", 2, 0)+jlib.rand();
		 String ptitle = cpp.createnewprod(prodname);
		 Assert.assertEquals(ptitle.trim().contains(prodname.trim()),true);
//		 {
//				System.out.println("Product created");
// 
//		 }else {
//				System.out.println("Product not created");
//
//		 }
		 
		 
		 hp.getMorelnk().click();
		 hp.campaignclick();
		 CampaignPage cp = new CampaignPage(driver);
		 CreateCamapaignPage crecp = new CreateCamapaignPage(driver);
		 cp.getCreatecampaignplusicon().click();
		 String campainname= elib.exceluti("Sheet1", 1, 3)+jlib.rand();
		 String campnprodverification = crecp.createcamapainwithproduct(campainname, prodname,driver, "Products&action=Popup&html=Popup_picker", 0);
		 Assert.assertEquals(campnprodverification.contains(campainname),true);
//		{
//			System.out.println("Campaign with Prod created");
//		}
//		hp.logout();
//	
//			driver.quit();		
//		
}
}


