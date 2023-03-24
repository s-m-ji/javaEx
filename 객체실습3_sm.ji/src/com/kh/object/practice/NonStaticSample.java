package com.kh.object.practice;

public class NonStaticSample {
	public void printLottoNumbers() {
//		int number = (int)(Math.random()*6)+1;
		for(int i=1; i<=45; i++) {
			i = (int)(Math.random()*6)+1;
			System.out.println(i);
		}
		System.out.println("1. 랜덤 값 : ");
	}
	
	
	
	public void outputChar(int num, char c) {
		System.out.println("2. a문자 5개 출력 : ");
	}
	
	public char alphabette() {
		return 0;
		// TODO 리턴 수정
	}
	
	public String mySubstring(String str, int index1) {
		return null;
		// TODO 리턴 수정
		
	}
}
