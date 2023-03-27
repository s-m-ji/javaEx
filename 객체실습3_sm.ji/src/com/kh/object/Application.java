package com.kh.object;

import com.kh.object.practice.NonStaticSample;

public class Application {

	public static void main(String[] args) {
		NonStaticSample sample = new NonStaticSample();
		
		sample.printLottoNumbers();
		System.out.println("=========================");

		// 매개변수로 받는 char타입은 문자 하나를 꼭 입력해야함
		sample.outputChar(5, 'a');
		System.out.println("=========================");
		sample.alphabette();
		System.out.println("=========================");
		
		//            01234 5
		String str = "안녕하세요. 반갑습니다.";
		// 특정 문자열을 추출하는 방법(시작인덱스, 끝인덱스)
		// 마지막은 포함하지 않는다고 했기에
		// "안녕하세요."를 찍으려면 5이 아니라 6으로 설정
		System.out.println(str.substring(0,6));
		sample.mySubstring(str, 0, 2);
		// 원본 문자열은 수정되지않음. -> 원하는 위치의 값만 추출하여 반환하는 형식
	}
}
