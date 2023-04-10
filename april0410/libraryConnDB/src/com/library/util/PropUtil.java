package com.library.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	
	static Properties prop = readFile();
	
	/**
	 * 프로퍼티 파일을 읽어옵니다.
	 * @return 
	 */
	private static Properties readFile(){
		Properties prop = new Properties();
		
		// 실행중인 jar 파일의 절대경로를 구합니다.
		String classpath = ClassLoader.getSystemClassLoader().getResource(".").getPath();
		
		try (FileReader fr = new FileReader(classpath+"/conf/config.properties");){
			prop.load(fr);
        	return prop;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }	
	}
	
	/**
	 * 프로퍼티 요청정보 반환
	 * @param confName
	 * @return
	 */
	public static String getConf(String confName) {
		
		if(prop != null) {
			return prop.getProperty(confName);
		}else {
			System.out.println("설정 정보를 읽을수 없습니다.");
			return "";
		}
	}
	
}
