package com.batchguide.util;

import java.util.Properties;

public class PropertiesUtils {
	public static String getPropertiesFile(String fileName) {
		Properties sysProperties = System.getProperties();
		
		return sysProperties.getProperty("os.name").toUpperCase().contains("WINDOWS")
				? "C:/Users/pncrm/git/spring_batch_guide/spring_batch_guide/src/main/resources/config/batch/properties/" + fileName.toLowerCase() + ".properties"
				: "/properties/" + fileName.toLowerCase() + ".properties";
	}
	
}
