package ex;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("키를 입력하세요 (단위m): ");
			double h = scan.nextDouble();			
			System.out.println("몸무게를 입력하세요 (단위kg): ");
			double w = scan.nextDouble();
			
			double bmi = w/(h*h);
			System.out.printf("Bmi는 %.2f입니다. ▷ ", bmi);
			
			if(bmi<10) {
				System.out.println("저체중입니다.");
			} else if(bmi<20) {
				System.out.println("정상입니다.");
			} else {
				System.out.println("과체중입니다.");
			}
			break;
		}
	}
}
