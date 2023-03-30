package exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		int w = 0;
		int h =0;
		double bmi = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키(m) 입력해주세욧");
		try {
			w = scan.nextInt();
		} catch (InputMismatchException e) {
			h = (int) scan.nextDouble();
		}
		
		System.out.println("몸무게(kg) 입력해주세욧");
		try {
			h = scan.nextInt();
		} catch (InputMismatchException e) {
			h = (int) scan.nextDouble();
		}
		bmi = w/(h*h);
		System.out.printf("Bmi는 %.2f입니다.", bmi);
		
//		System.out.println("키(m) 입력해주세욧");
//		w = scan.nextInt();
//		System.out.println("체중(kg) 입력해주세욧");
//		h = (int) scan.nextDouble();
//		bmi = w/(h*h);
//		System.out.printf("Bmi는 %.2f입니다.", bmi);
		
		
	}
}













