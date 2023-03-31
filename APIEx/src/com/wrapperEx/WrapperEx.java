package com.wrapperEx;

public class WrapperEx {
	public static void main(String[] args) {
		// 박싱 (자동형변환) : 기본 타입 -> 참조 타입 
		Integer obj1 = new Integer(100);
		Integer obj3 = new Integer("300");
		// 자동으로 형변환 해줄것이기 때문에 바로 아래와 같이 쓰면 된댱
		Integer obj2 = 100;
		Integer obj4 = Integer.valueOf("300");
		
		System.out.println("***** Integer 박싱 *****");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		// 언박싱 (강제형변환) : 참조 -> 기본
		int int1 = obj1.intValue();
		int int2 = (int)obj1;
		
		System.out.println("***** int 언박싱 *****");
		System.out.println(int1);
		System.out.println(int2);
		
		// 연산 시에는 자동 언박싱이 됩네뎅
		int int3 = obj4 + 100;
		System.out.println(int3);
		
		// 포장값의 비교 (-128~127 범위 초과 시)
		Integer obj_integer1 = 300;
		Integer obj_integer2 = 300;
		System.out.println("비교 결과: " + (obj_integer1 == obj_integer2));
		System.out.println("비교 결과: " + (obj_integer1.equals(obj_integer2)));
		System.out.println("비교 결과: " + (obj_integer1.intValue() == obj_integer2.intValue()));
		
		// -128~127 1바이트 내의 범위라면 == 이용시에도 같음 !
		System.out.println("**********************");
		obj_integer1 = 100;
		obj_integer2 = 100;
		System.out.println("비교 결과: " + (obj_integer1 == obj_integer2));
		System.out.println("비교 결과: " + (obj_integer1.equals(obj_integer2)));
		System.out.println("비교 결과: " + (obj_integer1.intValue() == obj_integer2.intValue()));
		
	}
}
