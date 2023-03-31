package com.stringEx;

public class StringEx2 {
	public static void main(String[] args) {
		// charAt() : 인덱스 값을 이용하여 하나의 문자를 추출
		// 인덱스7의 문자가 1or3이면 男 / 2or4이면 女
		String ssn = "123456-4890987";
		
		// charAt(7)
		// 해당 인덱스의 문자를 char 타입으로 반환
		// char c = ssn.charAt(7) -> 이런식으로 변수를 생성하여 코드를 간결히 해주는게 더 좋을수도
		if(ssn.charAt(7) == '1' || ssn.charAt(7) == '3') {
			System.out.println("男");
		} else if(ssn.charAt(7) == '2' || ssn.charAt(7) == '4') {
			System.out.println("女");
		} else {
			System.out.println("잘못된 값입네당");
		}
		System.out.println(ssn.charAt(7));
	}
}
