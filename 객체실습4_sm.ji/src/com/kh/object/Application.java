package com.kh.object;

import com.kh.object.practice.StaticSample;

public class Application {

	public static void main(String[] args) {
		// StaticSample value의 필드 값을 초기화
		
		// 정적 멤버 접근 : 클래스명.메소드명
		// 필드가 private이므로 직접 접근이 안된당
		// set/get 메소드를 활용
		StaticSample.setValue("java");
		
		// 직접 접근이 안되므로 get메소드를 활용하여 필드값을 추출
		System.out.println("value: " + StaticSample.getValue());
		StaticSample.toUpper();
		System.out.println("대문자로 변경: " + StaticSample.getValue());
		
		// 두번째 인덱스의 값을 j로 변경
		StaticSample.setChar(2, 'j');
		System.out.println("3번째 값을 j로 변경: " + StaticSample.getValue());

		System.out.println("문자열의 길이: "
							+ StaticSample.valueLength());
		
		System.out.println("문자열 연결: " 
							+ StaticSample.valueConcat("PROGRAMMING"));
	}

}
