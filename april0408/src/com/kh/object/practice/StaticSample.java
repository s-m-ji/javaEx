package com.kh.object.practice;

public class StaticSample {
	private static String value;
	
	
	public static void toUpper() {
		value = value.toUpperCase();
	}
	
	public static void setChar(int index, char c) {
	
		char[] charArr = value.toCharArray();
		charArr[index] = c;
		value = String.valueOf(charArr);
	}
	
	public static int valueLength() {
		
		return value.length(); 
	}
	
	
	public static String valueConcat(String str){
//		return value +" "+ str;
		return value.concat(str);
	}
	
	
	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		
		StaticSample.value = value;
		
		// this.value = value; 
		// 질문: 여기서 static 메소드가 되고나서는 왜 this를 쓸 수 없을까?
		
	}
	
}
