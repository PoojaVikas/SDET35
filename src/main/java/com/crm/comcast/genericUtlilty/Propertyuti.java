package com.crm.comcast.genericUtlilty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Properties;


public class Propertyuti {

	//public static LinkedList<String> propertyuti() throws Throwable {
	public String propertyuti(String key) throws Throwable {
		
		// TODO Auto-generated method stub
		String path = "./common/login.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties p = new Properties();
		p.load(fis);
//		LinkedList<String> llist = new LinkedList<String>();
//		
//		String url = p.getProperty("url");
//		String uname = p.getProperty("uname");
//		String pwd = p.getProperty("pwd");
//		llist.add(url);
//		llist.add(uname);
//		llist.add(pwd);
//
//		return llist;
		
		return p.getProperty(key);
		
		

	}

}
  