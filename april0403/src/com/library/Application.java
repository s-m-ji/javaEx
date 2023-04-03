package com.library;

import java.util.Scanner;

public class Application {

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Application app = new Application();
		Library lib = new Library();
		
		
		while(true) {
			// 도서 목록 조회
			lib.info();
			
			// 메뉴 확인
			System.out.println("메뉴 버튼 선택 [1.대여 2.반납 q.종료]");
			int menu =0;
			int index =0;
			
			// 도서 대여
			if(menu == 1) {
				System.out.println("대여 도서 번호 입력");
				index = app.getInt();
				lib.rentBook(index);
			} else if(menu == 2) {
				System.out.println("반납 도서 번호 입력");
				index = app.getInt();
				lib.returnBook(index);
			} else {
				System.out.println("메뉴 재확인");
			}
			break;
		}
		
		// 도서 목록 조회
		lib.info();
		
		// 메뉴 확인
		System.out.println("메뉴 버튼 선택 [1.등록 2.삭제 q.종료]");
		int menu =0;
		int index =0;
		int no =0;
		String title, author;
		
		if(menu == 1) {
			System.out.println("등록 도서 정보 입력");
//			title = sc
		}
		
		
		// 도서 등록
		
		// 도서 삭제
		
		
	}

	// 문자 입력
	public String getString() {
		String str = "";
		while(true) {
			try {
				str = sc.next();
				if(str.equalsIgnoreCase("Q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				break;
			} catch (Exception e) {
				System.out.println("입력 오류: 문자 기입");
			}
		}
		return str;
	}
	
	
	
	// 숫자 입력
	public int getInt() {
		int i=0; 
		while(true) {
			try {
//				i = sc.nextInt();
				String str = sc.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.out.println("입력 오류: 숫자 기입");
			}
		}
		return i;
	}
	
	
}


