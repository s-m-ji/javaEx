package com.kh.object.practice;

public class StaticSample {
	// private은 직접 접근이 불가능하므로 
	// setter, getter 메소드를 이용한다.
	private static String value;
	
	// 생성하지 않고 쓰기 위해서 static 붙이기
	public static void toUpper() {
		// toUpperCase : 대문자로 변경함
	 	value = value.toUpperCase();
	}
	
	public static void setChar(int index, char c) {
		// value값을 전달받은 인덱스 위치에 전달받은 문자로 변경하는 static 메소드
		// String 문자열을 char[]로 반환
		char[] charArr = value.toCharArray();
		// 배열이름[방번호] = 값;
		// 값을 배열의 방번호에 입력 -> 덮어쓰기
		charArr[index] = c;
		
		value = String.valueOf(charArr);
		
//		System.out.println("char[] 출력: ");
//		for(char charValue : charArr) {
//			System.out.println(charValue);
//		}
	}
	
	public static int valueLength() {
		// .length(); : 문자열의 길이를 반환
		return value.length();
	}
	
	public static String valueConcat(String str) {
		// .concat(); : 문자열을 연결하여 반환
		// value = value.concat(str);
		return value.concat(str);
	}

	public static String getValue() {
		return value;
	}
	
	public static void setValue(String value) {
		StaticSample.value = value;
	}
}
