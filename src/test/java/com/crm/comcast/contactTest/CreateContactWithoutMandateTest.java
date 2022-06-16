package com.crm.comcast.contactTest;

import org.testng.annotations.Test;

import com.crm.comcast.PomRepository.ContactsPage;
import com.crm.comcast.PomRepository.CreateContactPage;
import com.crm.comcast.PomRepository.HomePage;
import com.crm.comcast.genericUtlilty.BaseClass;

public class CreateContactWithoutMandateTest extends BaseClass{
	
	// create contact without mandate 
	
	@Test
	public void contactwithoutlastnameTest() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getContactslink().click();
		ContactsPage cp = new ContactsPage(driver);
		cp.getCreatcontplus().click();
		CreateContactPage ccp = new CreateContactPage(driver);
		String firstname = elib.exceluti("Sheet1", 1, 0)+jlib.rand();
		ccp.createcontwithoutlastname(firstname, "Last Name cannot be empty");
		
	}
}

//		String ver1 = ccp.createcontwithoutlastname(firstname, "Last Name cannot be empty");
//		if(ver1.contains("Last Name cannot be empty"))
//		{
//			System.out.println("contact not created");
//		}
//		else 
//		{
//			System.out.println("contact created");
//		}
//	}


