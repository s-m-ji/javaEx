package com.kh.object.practice;

public class NonStaticSample {
	// ============ printLottoNumbers ========================
	public void printLottoNumbers() {
		// 1~45까지의 임의의 정수 6개를 출력
		// int number = (int)(Math.random()*45)+1;

		// 1) 로또 만들깅

		// 6개의 수를 저장할 공간을 배열로 생성
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			// 배열의 방이 0부터 시작하기 때문에 i는 0부터 시작
			// i = 0~5
			lotto[i] = (int)(Math.random()*45)+1; 

			// 중복 체크 : 동일한 숫자가 입력되었는지?
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
			
		}
		
		// 2) 순서대로 정렬하기
		
		int temp = 0;
		for(int i=0; i<lotto.length; i++) {
			// 오름차순(j=i), 내림차순(j=0)
			for(int j=i; j<lotto.length; j++) {
				// 방 바꾸기
				if(lotto[i] > lotto[j]) {
					// 방을 바꿀 때 필요한 저장 공간을 생성
					temp = lotto[i];
					// 작은 수가 앞으로 올 수 있도록 자리 바꿈
					lotto[i] = lotto[j];
					// temp에 저장해두었던 큰 수가 뒤로 가게함
					lotto[j] = temp;
							
				}
			}
		}
		
		System.out.println("Lotto number");
		for(int num : lotto) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	
	// ============ outputChar ========================
	public void outputChar(int num, char c) {
		// 입력받은 숫자만큼 반복문을 실행
		for(int i=0; i<num; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
	
	// ============ outputChar ========================
	public char alphabette() {
		// 문자코드 A~Z=65~90, a~z=97~122
		// 임의의 수를 생성해여 추출해서 char로 캐스팅

		// 범위 : 122+1-65 -> 122까지 포함하기 위해서 1을 더함
		int num = (int)(Math.random()*58)+65;
		System.out.println((char)num);
		return (char)num;
		// TODO 리턴 수정 - 현재 임의 'a'로 설정해둠
	}
	
	public String mySubstring(String str, int index1, int index2) {
		// 문자열의 인덱스값을 이용하여 문자열을 추출
		// 시작 인덱스는 포함하고 끝 인덱스는 불포함
		// 문자열 추출 시 이용
		System.out.println(str.substring(index1, index2));
	 	return str.substring(index1, index2);
		// TODO 리턴 수정 - 현재 임의 ""으로 설정해둠
		
	}
}
