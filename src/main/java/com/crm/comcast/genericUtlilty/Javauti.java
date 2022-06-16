package com.crm.comcast.genericUtlilty;

import java.util.Date;
import java.util.Random;

public class Javauti {

	public  int rand() {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int ranit = ran.nextInt(1000);
		return ranit;
		

	}
	
	
	public String Systemdate() {
		
		Date date = new Date();
		String currentdate = date.toString();
		String sysdaste=currentdate.replace(";", "-");
				
		return sysdaste;
		
	}

}
