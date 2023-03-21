package m0320;

import java.util.Scanner;

public class checkEx_04_02 {
	public static void main(String[] args) {
		/*
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
//			if (!(i%3 == 0)) { 이렇게도 가능
			if (i%3 != 0) {
				continue;
			}
//			System.out.println(i);
			sum += i;
//			System.out.println(i);
		}
//		System.out.println("합 = " + sum);
		
		// 주사위는 1~6까지 6개의 숫자가 나올 수 있음
		// 0.000...1 <= Math.random() < 1
		// 0.000...6 <= Math.random() < 6  
		// 6을 곱했을 경우 0,1,2,3,4,5 -> 각각 +1씩하면 1,2,3,4,5,6 총 6개
		// int n = (int)(Math.random()*6)+1;
		
				
		while (true) {
			int a = (int) (Math.random()*6)+1;
			int b = (int) (Math.random()*6)+1;
			if(a+b == 5) {
				System.out.println(a + ", " + b);
				System.out.printf("%d, %d", a,b);
				break;
			} 
		}

		
		for (int s=1; s<=4; s++) {
			for (int t=0; t<s; t++) {
//				System.out.printf("*");
			}
//			System.out.println();
		}
		
		// a = 1,2,3,4
		for(int a=1; a<=4; a++) {
			// b = 4,3,2,1
			for(int b=4; b>0; b--) {
				// a가 1일때 
				if (a >= b) {
					System.out.printf("*");
				} else {
					System.out.printf(" ");
				}
			} 
			System.out.println();
		}
		
		
		boolean run = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
	
		int money = 0;
		Outter:
			while(run) {
				System.out.println("-------------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료" );
				System.out.println("-------------------------------");
				System.out.println("선택> ");
				
				// int input = Integer.parseInt(scan.nextLine()); -> 문자열로 받아왔을 경우 이렇게 캐스팅
				int input = scan.nextInt();	// 사용자의 입력을 대기 -> Enter 누르는 순간 
				// switch (변수){
				// 		case 변수의 값 :
				// }
				if(0>input || input>=5) {
					System.out.println("잘못 입력하셨습니다.");
				}
				switch (input) {
					case 1: // 변수의 값이 1이면 실행
						System.out.println("예금액> ");
						money += scan.nextInt();
						break;
					case 2: // 변수의 값이 2이면 실행
						System.out.println("출금액> ");
						int num = scan.nextInt();
						if(money<num) {
							System.out.println("금액이 부족합니다.");
						} else {
							money -= num;
						}
						break;
					case 3: // 변수의 값이 3이면 실행
						System.out.println("잔고> " + money);
						break;
					case 4:
						break Outter; //
						// System.exit(0); // 시스템을 종료하는 메서드
				}
		}
			System.out.println("현재 잔고는 money: " + money + "입니다.");
			scan.close(); // 자원 반납 차원에서 기입해야함
			System.out.println("프로그램이 종료되었습니다.");
		*/
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {			
				if((4*x + 5*y) == 60) {				
					System.out.println(x + ", "+ y);
				}
			}
		}
		
	}
	
}
