package m0320;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		while(true) {
			System.out.println("키 입력(m): ");
			double h = scan.nextDouble();			
			System.out.println("몸무게 입력(kg): ");
			double w = scan.nextDouble();
			
			double bmi = w/(h*h);
			System.out.printf("Bmi 지수는 %.2f ", bmi);
			
			if(bmi<10) {
				System.out.println("저체중");
			} else if(bmi<20) {
				System.out.println("정상");
			} else {
				System.out.println("과체중");
			}
			
			System.out.println();
			System.out.println("===== 재탐색: r, 종료키: q ");
			int input = Integer.parseInt(scan.next());
//			char in = scan.next;
			if((input!='r') || (input!='q')) {
				System.out.println("잘못된 값입니다.");
			} else {
			break;
			}
		}
		
	}
}
