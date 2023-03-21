package forEx;

public class Googoodan {

	public static void main(String[] args) {
		// 구구단 출력하기
		// for(초기화식;조건식;증감식){}
		// i를 1~9까지 출력하기
		/*
		 * int dan = 2; 
		 * while (true) { 
		 * System.out.println("===== " + dan + "단 =====");
			 * for (int i = 1; i < 10; i++) {
			 *  // System.out.println(dan + "*" + i + "=" +	 dan * i);
			 *   System.out.printf("%d*%d=%d\n", dan, i, dan * i); 
			 *   } dan++; 
			 * if (dan == 10) { break; } 
		 * }
		 */

		/*
		// 중첩 for 시작
		// dan : 2~9		
//		Label : 라벨명 지정
//		반복문이 중첩되어있을 경우, 바깥쪽 반복문까지 종료시키려면 label 사용
		Outter : 
		for (int dan = 9; dan > 1; dan--) {
			System.out.println("===== " + dan + "단 =====");
			for (int i = 9; i > 1; i--) {
				// 만약 6단이면 구구단 출력x
//				if(dan == 7) {
//					break;
//				}
				System.out.printf("%d*%d=%d\n", dan, i, dan * i);
				if(dan == 7) {
					break Outter; // 라벨의 위치까지 반복문을 탈출
				}
			}
			// 안쪽 for 종료
			
			System.out.println(); // 개행
			
			// 6단 출력 후 반복문을 탈출
			if(dan == 6) {
				break;
			}
		}// 바깥 for 종료
		
		*/
		// 1~10까지 수 중에서 짝수일 경우의 합 구하기
		System.out.println("짝수의 합 구하기");
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			// i가 홀수면 증감식으로 넘어감
			// i가 짝수면 조건식 i%2=0
			if(i%2 == 1) {
				continue; // 증감식으로 이동
				// false(조건에 맞지 않는 경우)면 건너뛰고, true면 다시 실행
			}
			System.out.println("i= " + i);
			sum += i; // sum = sum + i
		}
		System.out.println("합 = " + sum);
		
	}
	
}
