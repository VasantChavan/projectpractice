package com.projectpractice.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	Properties prop;

	public ConfigReader() {

		// Create File Class object and pass location of config properties file to constructor
		File f = new File("./Config/prop.properties");

		try {
			FileInputStream fis = new FileInputStream(f);
			// Create object of Properties class to read config properties file
			prop = new Properties();
			// Load config properties file
			prop.load(fis);

		} catch (Exception e) {
			// Handle exception
			System.out.println(e);
		}

	}

	/**
	 * This method is used to read value of APPURL property from Properties file
	 * @return App URL
	 */
	public String getAppUrl() {
		String url = prop.getProperty("APPURL");
		return url;
	}

	/**
	 * This method is used to read value of UserID property from Properties file
	 * 
	 * @return User ID	 
	 * */
	public String getUserId() {
		String userId = prop.getProperty("UserID");
		return userId;
	}

	/**
	 * This method is used to read value of Password property from Properties file
	 * 
	 * @return Password
	 */
	public String getPassword() {
		String password = prop.getProperty("Password");
		return password;
	}

}
