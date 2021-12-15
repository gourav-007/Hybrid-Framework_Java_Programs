package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;

	/*
	 * This method is used to load the properties from the config.properties file 
	 * @return prop object 
	 * 
	 */

	public Properties init_prop() {


		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("./CucumberHybridFramwork/src/test/resources/config/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


		return prop;


	}


}
