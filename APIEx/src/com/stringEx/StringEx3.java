package com.stringEx;

public class StringEx3 {

	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		// 매개값의 문자열 포함 여부를 확인
		// 포함: 시작 인덱스 값을 반환
		// 불포함: -1 반환
		System.out.println(str.indexOf("프로"));
		System.out.println(str.indexOf("C"));
		// substring과 함께 사용될 수 있다
		System.out.println(str.substring(str.indexOf("프로")));
		
		if(str.indexOf("자바")>0){
			System.out.println("자바 관련 O");
		} else {
			System.out.println("자바 관련 X");
		}
		
		// id의 길이는 5자 이상이어야 합네당
		String id = "id";
		if(id.length()<5) {
			System.out.println("id의 길이는 5자 이상, 14자 이하 사용");
		}
		
		// 13자리 숫자가 맞는지 확인 
		String ssn = "1234567890987654321";
		if(ssn.length() != 13) {
			System.out.println("주민번호를 정확히 입력해주세잉");
		}
		
		// 원하는 문자열 추출 -> 5번째 문자까지 찾는다고 할 경우 : 끝 인덱스는 6
		System.out.println("주민번호 앞자리" + ssn.substring(0,6));
		System.out.println("주민번호 전체자리" + ssn.substring(0));
		
		// 문자 교체
		str = "자바는 객체지향언어 입니다. 자바를 잡아봅시다.";
		System.out.println(str.replace("자바", "java"));
		
		// 대-소문자로 바꿔봅시당
		str = "Java Programe Language";
		System.out.println("대문자로: " + str.toUpperCase());
		System.out.println("소문자로: " + str.toLowerCase());
		
		// 대-소문자 구별하지 않고 비교
		str = "q";
		System.out.println("\"Q\" " + str.equalsIgnoreCase("Q"));
		System.out.println("\"q\" " + str.equalsIgnoreCase("q"));
		
		// 공백을 제거해주기
		id = "     id    ";
		System.out.println(id);
		System.out.println(id.trim());
		
		// 기본 타입을 문자열로 변경
		System.out.println(String.valueOf(123));
		System.out.println(String.valueOf(123.0));
		System.out.println(String.valueOf(true)); // boolean 타입
	}   

}























