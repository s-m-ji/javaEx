package com.objectEx;

public class ObjectEx1 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean result = obj1 == obj2;
		System.out.println("object 비교===============");
		System.out.println(result);
		System.out.println(obj1.equals(obj2));
		System.out.println("string 비교===============");
		String str1 = new String ("java");
		String str2 = new String ("java");
		System.out.println(str1 == str2);
		// 문자열을 비교하도록 오버라이딩 되어 있어요!!!!
		System.out.println(str1.equals(str2));
		
		
	}
}
