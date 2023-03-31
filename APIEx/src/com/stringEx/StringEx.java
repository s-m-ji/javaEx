package com.stringEx;

import java.io.UnsupportedEncodingException;

public class StringEx {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "Hello";
		// str 객체가 가지고있는 값을 byte[]로 반환
		byte[] byteArr = str.getBytes();
		byte[] byteArr2 = {65,66,67};
		
		// byte 배열을 String 문자열로 변환
		String str2 = new String(byteArr,2,2); // 시작인덱스, 갯수
		System.out.println(str2);
		
		String str3 = new String(byteArr2);
		System.out.println(str3);
		
		// 실습파일 열었을 때 문자가 깨졌던 현상 -> 문자코드가 일지하지 않는 경우 그럴 수 있음
		// euc-kr, ms949는 한글 표현 시 2byte 사용
		// utf-8은 한글 표현 시 3byte 사용
		String str4 = "반갑습니다. 안녕하세요";
		byte[] b2 = str4.getBytes("euc-kr");
		byte[] b = str3.getBytes("euc-kr");
		String s_euckr = new String(b, "euc-kr");
		String s = new String(b);
		String s2 = new String(b2);
		
		
		System.out.println(s_euckr);
		System.out.println(s);
		System.out.println(s2);
		
	}
}
