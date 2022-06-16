package com.crm.comcast.contactTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.AcceptAlert;
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

public class DeleteContactTest extends BaseClass {

	
//		public static void main(String[] args) throws Throwable {
			
            @Test(groups = "smokeTest")
            public void deletecontactTest() throws Throwable {
            	

			HomePage hp = new HomePage(driver);
            hp.getContactslink().click();	
            ContactsPage cp = new ContactsPage(driver);
            cp.clickoncreatepluscont();

            CreateContactPage cc = new CreateContactPage(driver);
    		String firstname = elib.exceluti("Sheet1", 1, 0)+jlib.rand();
    		String lastname = elib.exceluti("Sheet1", 0, 1)+jlib.rand();
            String title = cc.createnewcont(firstname, lastname);
    		 Assert.assertEquals(title.contains(lastname)&&title.contains(firstname),true);    		 {
//    			 System.out.println("Contact Created"); 
//    		 }
//    		 else {
//    	    	  System.out.println("Contact not created");
//    	      }
    		Thread.sleep(3000);
    		
           String verifydel = cc.deletecontact("Are you sure you want to delete this record?", firstname);
           Assert.assertEquals(verifydel.contains(firstname),false);
//           {
//        	   System.out.println("contact not deleted ");
//           }
//           else {
// 	    	  System.out.println("Contact deleted");
// 	      }
           
	
			

		

	}

}
}


