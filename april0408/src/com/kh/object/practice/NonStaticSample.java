package com.kh.object.practice;

import java.util.Arrays;

public class NonStaticSample {
	public void printLottoNumbers() {
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			int num = (int)(Math.random()*45)+1;
			lotto[i] = num;
			
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
//		System.out.println("=== 1~45 숫자(중복X) 출력 ===");
//		System.out.println(Arrays.toString(lotto));

//		System.out.println("=== 1~45 숫자(중복X, 오름차순) 출력 ===");
		int temp = 0;
		for(int i=0; i<lotto.length; i++) {
			for(int j=i; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					temp = lotto[i];	
				// ※ lotto[i]=temp;라고 하면 lotto[i]=0;이 되어서
				// 값이 대부분 0만 나오게된다..! 그러니 변수에 값을 담아주는 순서도 중요함
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		
		/* 블로그 참고 (https://velog.io/@sjsrkdgks/배열과-for문을-이용한-문제중복제거)
		
		int[] number = new int[6];
		int[] temp = new int[6];
		int count = 0;
		
		for(int i=0; i<number.length; i++) {
			number[i] = (int)(Math.random()*45)+1;
			boolean flag = false;
			for(int j=0; j<temp.length; j++) {
				if(number[i] == temp[j]) {
					flag = true;
//					System.out.println(Arrays.toString(temp));
				}
			}
			if(!flag) {
				temp[count++] = number[i];
			}
		}
		
		int[] result = new int[count];
		for(int i=0; i<result.length; i++) {
			result[i] = temp[i];
		}
		
		System.out.println(Arrays.toString(result));
		*/
	}
	
	public void outputChar(int num, char c) {
		for(int i=0; i<num; i++) {
			System.out.print(c+" ");
		}
		System.out.println(); //개행용
	}
	
	public char alphabette() {
		// 문자코드 A~Z=65~90, a~z=97~122
		
		int num = 0;
		for(int i=0; i<1; i++) {
		num = (int)(Math.random()*58)+65;
		
		// ※ 91~96까지의 기호는 제외해주었음
		if(!(num>90 && num<97)) {
			System.out.println((char)num +" ");
			}
		}
		return (char)num;
	}
	
	public String mySubstring(String str, int index1, int index2) {
		return str.substring(index1, index2);
	}
}












