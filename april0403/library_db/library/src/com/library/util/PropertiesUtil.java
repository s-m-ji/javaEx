package com.library.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	public static String getProp(String confName) {
		FileReader fr = null;
		Properties prop = null;
		
        try {
        	fr = new FileReader("conf/config.properties");
        	prop = new Properties();
        	
        	prop.load(fr);
        	
        	return prop.getProperty(confName);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
	}
}
