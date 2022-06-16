package com.crm.comcast.genericUtlilty;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriveruti implements Iconstants {


		public void implicitwait(WebDriver driver)
		{
			
			/**
			 * @pooja
			 * used to wait implici3tly for given time
			 * 
			 */
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		public void explicitwait(WebDriver driver , String partailPageURL) 
		{
			/**
			 * @pooja
			 * used to wait explicit for given time and until conditions specified is verified
			 * 
			 */
			WebDriverWait wait = new WebDriverWait(driver, Iconstants.explilictywait);
			wait.until(ExpectedConditions.urlContains(partailPageURL));

		}

		public void swithToWindow(WebDriver driver , String partialWindowTitle) {
			
			/**
			 * @pooja
			 * used to switch from parent to child window
			 * 
			 */
		       Set<String> set = driver.getWindowHandles();
		         Iterator<String> it = set.iterator();

		          while (it.hasNext()) {
				          String wID = it.next();
				          driver.switchTo().window(wID);
				          String currentWindowTitle = driver.getTitle();
				          if(currentWindowTitle.contains(partialWindowTitle)) {
				        	  break;
				          }
			    	}
		}

		public void swithToAlertWindowAndAccpect(WebDriver driver ,String expectedMsg) {
			Alert alt = driver.switchTo().alert();
			 if(alt.getText().trim().equalsIgnoreCase(expectedMsg.trim())) {
				 System.out.println("Alert Message is verified");
				 //alt.accept();
			 }else {
				 System.out.println("Alert Message is not verified");
			 }
			alt.accept();
		//return	alt.getText();
		}

		
		
		public void swithToAlertWindowAndCancel(WebDriver driver, String expectedMsg) {
			Alert alt = driver.switchTo().alert();
			 if(alt.getText().equals(expectedMsg)) {
				 System.out.println("Alert Message is verified");
			 }else {
				 System.out.println("Alert Message is not verified");
			 }
			 alt.dismiss();
		}

		public void swithToFrame(WebDriver driver , int index) {
			driver.switchTo().frame(index);
		}

		public void swithToFrame(WebDriver driver , String id_name_attribute) {
			driver.switchTo().frame(id_name_attribute);
		}
		public void select(WebElement element , int index) {
			Select sel = new Select(element);
			sel.selectByIndex(index);
		}

		public void select(WebElement element , String text) {
			Select sel = new Select(element);
			sel.selectByVisibleText(text);
		}

		public void mouseOverOnElement(WebDriver driver , WebElement elemnet)
		{
			Actions act = new Actions(driver);
			act.moveToElement(elemnet).perform();
		}
 
		public void rightClickOnElement(WebDriver driver , WebElement elemnet)
		
		{
			Actions act = new Actions(driver);
			act.contextClick(elemnet).perform();
		}

		public void executeJavaScript(WebDriver driver , String javaScript) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeAsyncScript(javaScript, null);
		}
		
		   public void waitAndClick(WebElement element) throws InterruptedException
		   {
			   int count = 0;
		       while(count<20) {
			    	   try {
			    	       element.click();
			    	       break;
			    	   }catch(Throwable e){
			    		   Thread.sleep(1000);
			    		   count++;
			    	   }
		       }
		   }
		   

		   public void passEnterKey(WebDriver driver) {
			   Actions act = new Actions(driver);
			   act.sendKeys(Keys.ENTER).perform();
		   }

		   
		   

public   WebDriver getWebbrowser() throws Throwable
{   Propertyuti puti = new Propertyuti();
	String brows = puti.propertyuti("browser");
	WebDriver driver;
	if(brows.equals("firefox"))
	{
	    driver= new FirefoxDriver();
	}else if(brows.equals("chrome")){
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		
	}else if(brows.equals("ie")) {
		 driver = new InternetExplorerDriver();
	}else {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	return driver;
}
}

///method overloading in selenium : explicit wait for visiblity of secs
