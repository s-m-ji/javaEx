package array;

public class Array {
	public static void main(String[] args) {
		// 배열
		// 같은 타입의 데이터를 연속된 공간에 나열하고 index를 부여한 자료구조
		// ※ 같은 타입만 저장 가능
		// ※ 한번 생성된 배열의 길이를 늘이거나 줄일 수 없다
		// ※ 배열의 길이(항목의 갯수)를 확인하는 방법: 변수명.length
		
		// 배열의 선언 
		// 배열의 선언과 동시에 값을 입력(직접 값을 넣을 때) 
		// 타입[] 변수 = {};
		// 타입 변수[];
		int[] score1 = {90, 80, 70, 60, 50, 40, 30, 70, 80, 90}; 
		int score2[]; 
		
		// 배열의 값을 참조하는 방법
		// 변수명[index]		
		System.out.println("4번째 값은? " + score1[3]);

		// 변수명.length : 배열의 길이를 반환 (* ()가 붙어있지 않기에 이건 메소드가 아니라 필드임)
		int j = score1.length;
		System.out.println("배열의 길이는? " + j);
		
		// i = 0~9
		int sum = 0;
		for(int i=0; i<j; i++) {
			sum += score1[i];
		}
		System.out.println("합계는? " + sum);
		System.out.println("평균은? " + sum/j);
	}

	
}
