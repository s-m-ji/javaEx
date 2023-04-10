package com.library.util;

import java.util.Scanner;

public class ScannerUtil {
	
	static Scanner scan = new Scanner(System.in);
	
	/**
	 * 숫자 입력 받기
	 * Q, q 입력시 프로그램 종료
	 * @param scan
	 * @return
	 */
	public static int getInt() {
		int i = 0;
		while(true) {
			try {
				i = scan.nextInt();
				break;
			} catch(Exception e) {
				if(scan.next().equalsIgnoreCase("q")) {
					// 시스템을 종료 합니다.
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
				}
				System.out.println( scan.next() + " : 입력 불가능 합니다.");;
			}
		}
		return i;
	}
	
	/**
	 * 문자 입력 받기
	 * Q, q 입력시 프로그램 종료
	 * @param scan
	 * @return
	 */
	public static String getString() {
		String str = "";
		while(true) {
			try{
				str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료 합니다.");
					// 시스템을 종료 합니다.
					System.exit(0);
				}
				break;
			}catch(Exception e) {
				System.out.println("입력중 오류가 발생 했습니다.");
			}
		}
		return str;
	}
}
