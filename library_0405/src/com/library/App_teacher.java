package com.library;

import java.util.Scanner;

public class App_teacher {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Library lib = new Library();
		App app = new App();
		
		// *******    로그인 반복 시작
		while(true) { 
			System.out.print("id : ");
			
			String id = getString();
						
			if(id.equalsIgnoreCase("admin")) {
				System.out.println("관리자 메뉴 입니다.");
				
				// <<<<<<<<<<<<<  관리자 반복시작
				outter : 
				while(true) {
					System.out.println("1. 도서등록 2. 도서삭제 0. 로그아웃 q. 종료");
					System.out.println("메뉴를 입력해주세요");
					// 메뉴를 입력 받습니다.
					int menu = getInt();
					int no=0;
					switch (menu) {
					case 1:
						// 일련번호
						System.out.println("일련번호를 입력해주세요");
						no = getInt();
						// 도서명
						System.out.println("제목을 입력해주세요");
						String title = getString();
						// 작가
						System.out.println("작가를 입력해주세요");
						String author = getString();
						
						lib.insertBook(no, title, author, false);
						break;
						
					case 2:
						System.out.println("일련번호를 입력해주세요");
						no = getInt();
						
						lib.deleteBook(no);
						break;
					case 0:
						System.out.println("로그아웃 합니다.");
						break outter;
	
					default:
						System.err.println(menu + "는 없는 메뉴 입니다.");
						break;
					}
				}// <<<<<<<<<<<<<<<<  관리자 반복 끝
				
				
			} else {
				System.out.println(id + "님 환영합니다.");
				int no = 0;
				// >>>>>>>>>>>>> 사용자메뉴 반복
				userOutter : 
				while(true) {
					System.out.println("메뉴를 입력해주세요.");
					System.out.println("1. 도서대여 2. 도서반환 0. 로그아웃 q. 종료");
					int menu = getInt();
					switch (menu) {
					case 1:
						System.out.println("대여할 책의 번호를 입력해주세요");
						no = getInt();
						lib.rentBook(no);
						break;
					case 2:
						System.out.println("반납할 책의 번호를 입력해주세요");
						no = getInt();
						lib.returnBook(no);
						break;
					case 0:
						System.out.println("로그아웃 합니다.");
						break userOutter; 

					default:
						System.out.println(menu + "는 없는 메뉴 입니다.");
						break;
					}
					
				}// >>>>>>>>>>>> 사용자메뉴 반복 끝
				
				
				
			}	
			
			
		}// ******* 로그인 반복 끝
		
		
		
		// 어드민 - 책 등록, 책 삭제
		// 사용자 - 책 대여, 책 반납
		
		
//		// 책 추가
//		lib.insertBook(1, "불편한편의점", "나카사키", false);
//		lib.insertBook(2, "불편한편의점2", "나카사키", false);
//		
//		// System.out.println(lib); --> lib.toString()
//		// System.out.println(lib.toString());
//		
//		// 책 삭제
//		boolean res = lib.deleteBook(1);
//		
//		res = lib.rentBook(2);
//		res = lib.returnBook(2);
	}
	
	/**
	 * 사용자로 부터 입력받은 문자열을 반환 합니다.
	 * - 숫자가 입력될 경우 다시 입력을 요청
	 * - Q, q가 입력될 경우 프로그램 종료 
	 * @return
	 */
	public static String getString(){
		String str = "";
		while(true) {
			try {
				str = scan.next();
				// Q, q 입력되었으면 프로그램 종료
				if(str.equalsIgnoreCase("Q")) {
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
				}
				// 숫자로 변환시 숫자로 변경되면 문자를 입력해달라고 다시요청
				Integer.parseInt( str );
				System.err.println("문자를 입력해주세요");
			} catch (Exception e) {
				// 문자가 입력된 경우 반복문 탈출
				break;
			}
		}
		return str;
	}
	
	/**
	 * 사용자로부터 정수를 입력받아 반환합니다.
	 * - 문자가 입력되었을 경우 다시 입력 받습니다.
	 * - Q, q 가 입력 되었을 경우 프로그램을 종료 합니다.
	 * @return
	 */
	public static int getInt() {
		int i=0;
		String str = "";
		
		while(true) {
			try {
				// 사용자 입력 받기
				str = scan.next();
				// Q인지 확인하기
				if("q".equalsIgnoreCase(str)) {
					System.out.println("프로그램 종료 합니다.");
					System.exit(0);
				}
				// 숫자로 변환하기
				i = Integer.parseInt(str);
				break;
				
			}catch (Exception e) {
				// 오류가 발생시 다시 사용자 입력으로
				System.out.println("숫자를 입력해주세요.");
			}
		}
		
		return i;
	}
}
















