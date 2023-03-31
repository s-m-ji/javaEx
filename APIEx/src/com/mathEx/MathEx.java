package com.mathEx;

public class MathEx {
	public static void main(String[] args) {
		// 절대값 구하기
		int i = Math.abs(-5);
		double d = Math.abs(-5.4321);
		
		System.out.println(i);
		System.out.println(d);
		
		// 소수점 버림
		System.out.println(Math.floor(d));
		
		// 소수점 올림
		System.out.println(Math.ceil(d));
		
		// 소수점 반올림
		System.out.println("소수점 반올림: " + Math.round(d));
		// 반환타입이 
		
		// 최대-최소값 출력
		System.out.println(Math.max(4.3, 0.55));
		System.out.println(Math.min(1, 100));
		
	}
}
