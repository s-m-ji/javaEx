package com.library;

import java.util.Scanner;

public class Application2 {

	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Application2 app2 = new Application2();
		
		System.out.println("이름을 입력");
		System.out.println(app2.getString());
	
	}
	
	public String getString() {
		String res = "";
		while(true) {
			try {
				res = scanner.next();
				
				// 입력값이 숫자인 경우 다시 받을 수 있도록 
				try {
					// 숫자로 변환
					Integer.parseInt(res);
					// 숫자로 변환되면 입력을 다시 받아올 수 있도록 함
					System.out.println("문자만 입력 가능");
					continue;
				} catch (Exception e) {
				}
				
				if(res.equalsIgnoreCase("Q")) {
					System.out.println("시스템 종료한다");
					System.exit(0);
				}
				break;
				
			} catch (Exception e) {
				System.out.println("잘못 입력된 값이다.");
			}
		}
	return res;
	}

}
