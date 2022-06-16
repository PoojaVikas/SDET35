package com.crm.comcast.genericUtlilty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.crm.comcast.PomRepository.HomePage;
import com.crm.comcast.PomRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
//asvcfshs
public class BaseClass {
	
	//compare
	public Propertyuti plib = new Propertyuti();
	public Exceluti elib=new Exceluti();
	public Javauti jlib=new Javauti();
	public Webdriveruti wlib = new Webdriveruti();
	public WebDriver driver;
	public static WebDriver  sdriver;
	
	
	@BeforeSuite(groups = {"smokeTest","regressionTest"})
	public void beforesuite() {
		System.out.println("Establish connection");
		
	}
   
	@BeforeTest(groups = {"smokeTest","regressionTest"})
	public void beforetest() {
		
		System.out.println("Exceute test in batch");
	}
	
	
//	@BeforeClass(groups = {"smokeTest","regressionTest"})
//	public void beforeclass() throws Throwable {
//		String browser = plib.propertyuti("browser");
//		if(browser.equals("firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//		    driver= new FirefoxDriver();
//		}else if(browser.equals("chrome")){
//			WebDriverManager.chromedriver().setup();
//			 driver= new ChromeDriver();
//			
//		}else if(browser.equals("ie")) {
//			 driver = new InternetExplorerDriver();
//		}else {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}
//		driver.manage().window().maximize();
//		wlib.implicitwait(driver);
//		System.out.println("Browser launched");
//		sdriver=driver;
//		driver.get(plib.propertyuti("url"));
//		sdriver = driver; 
//		
//	}
	
	@Parameters("Browser")
	@BeforeClass(groups = {"smokeTest","regressionTest"})
	public void beforeclass(String Browser) throws Throwable {
		//String browser = plib.propertyuti("browser");
		if(Browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
		    driver= new FirefoxDriver();
		}else if(Browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
			
		}else if(Browser.equals("ie")) {
			 driver = new InternetExplorerDriver();
		}else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		wlib.implicitwait(driver);
		System.out.println("Browser launched");
	}
	
	@BeforeMethod(groups = {"smokeTest","regressionTest"})
	public void beforemethod() throws Throwable {
    LoginPage lp = new LoginPage(driver);
     //String url = plib.propertyuti("url");
     String uname = plib.propertyuti("uname");
     String pwd = plib.propertyuti("pwd");
     
    lp.logintovtiger(uname, pwd);
	System.out.println("login");			
	}
	
	
	
	@AfterMethod(groups = {"smokeTest","regressionTest"})
	public void aftermethod() {
		HomePage hp = new HomePage(driver);
		hp.logout();
		System.out.println("logout");
	}
	
	@AfterClass(groups = {"smokeTest","regressionTest"})
	public void afterclass() {
		driver.quit();
		System.out.println("browser cclosed");
	}
	
	@AfterTest(groups = {"smokeTest","regressionTest"})
	public void aftersuite() {
		System.out.println("end test in batch");
		
	}
   
	@AfterSuite(groups = {"smokeTest","regressionTest"})
	public void aftermethod1() {
		
		System.out.println("Disconnect from database");
	}
	
	
	
	
}


