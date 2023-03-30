package exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bmi2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double h, w;
		
		// 사용자가 올바른 값을 입력할 때까지 반복
		// 키 입력
		while(true) {
			try {
				System.out.println("키(m) 입력해주세욥");
				h = sc.nextDouble();
				if(h>5 || h<0) {
					System.err.println(h + "은 유효 범위를 초과");
				} else {
					break;
				}
			} catch (InputMismatchException e) {
				String str = sc.next();
				System.err.println(str + "은 입력 불가 *숫자만 입력");
			}
		}
		
		// 몸무게 입력
		while(true) {
			try {
				System.out.println("몸무게(kg) 입력해주세욥");
				w = sc.nextDouble();
				if(w>500 || w<0) {
					System.err.println(w + "은 유효 범위를 초과");
					continue;
				} 	
				break;
			} catch (InputMismatchException e) {
				String str = sc.next();
				System.err.println(str + "은 입력 불가 *숫자만 입력");
			}
		}
	
		System.out.printf("키: %.2f, 몸무게: %.2f이면, Bmi는 %.2f입니다.", h, w, w/(h*h));
//		System.out.println("몸무게: " + w);
//		System.out.println("Bmi: " + w/(h*h));
		
	}
}













