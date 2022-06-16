package com.crm.comcast.genericUtlilty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtilities {
	
	
	public void connecttodatabase() throws Throwable {
		
		Connection con = null;
		 Driver driveref = new Driver();
		DriverManager.registerDriver(driveref);
		
	}

}
