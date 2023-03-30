package com.object;

/**
 * 	API(Application Programming Interface)
 *  - API는 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스
 *  - 자바에서는 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음을 말함 : 라이브러리
 * @author user
 *
 */
public class ObjectEX {
	public static void main(String[] args) {
		String str = "Hello";
		print(str);
		System.out.println("=============");
		
		// 기본 타입 : 값 자체를 저장
		// 참조 타임 : 주소를 저장
		int num = 0;
		print(num);
		System.out.println("=============");
		
		// object 타입으로 자동형변환 될 때
		// int -> Integer에서 Object가 됨, double -> Double
		// 즉,
		// int 타입은 기본타입이므로 Object 오브젝트 타입으로 변환 불가하기에 객체 형태로 변환해야함.
		// => Wrapper 클래스인 Integer 타입으로 바뀐 것.
		
		ObjectEX objEx = new ObjectEX();
		print(objEx);
		
		str.toString();
		// => 결론 
		// Object 클래스에 toString가 정의되어있지만 메소드 오버라이딩에 의해서
		// 각 타입에서 호출 시에는 String, Integer 클래스에 정의된 메소드가 호출된댱
		
		// Object ===>
//		 public String toString() {
//		        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//		    } 
		
		// String ===>
//	    public String toString() {
//	        return this;
//	    }
		
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
