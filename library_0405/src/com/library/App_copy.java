package com.library;

import java.util.Scanner;

public class App_copy {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Library lib = new Library();
		App_copy app = new App_copy();
		
		// 로그인 시작
		while(true) { 
			System.out.println("id를 입력해주세요");
//			
			String id = getString();			
			
				if(id.equalsIgnoreCase("admin")) {
					System.out.println("관리자 메뉴입니다.");
					
					// 관리자 반복 시작
					outter:
					while(true) { 
						System.out.println("[메뉴 선택] 1.등록 2.삭제 0.로그아웃 q.종료");
						int menu = getInt();
						int no = 0;
						if(menu == 1) {
							System.out.println("번호, 제목, 작가를 입력 후 Enter치면 등록 가능");
							no = getInt();
							String title = getString();
							String author = getString();
							lib.insertBook(no, title, author, false);
						}
						else if(menu == 2) {
							System.out.println("번호 입력 후 Enter치면 삭제 가능");
							no = getInt();
							lib.deleteBook(no);
						}
						else if(menu == 0) {
							System.out.println("로그아웃 하겠습니다.");
							break outter;
						}
						else {
							System.err.println(menu+"(은)는 없는 메뉴입니다.");
						}
						
					} // 관리자 반복 끝 
					
				} else {
					System.out.println(id+"님 환영합니다.");
					int no = 0;
					// 사용자 반복 시작
					userOutter:
					while(true) { 
						System.out.println("[메뉴 선택] 1.대출 2.반납 0.로그아웃 q.종료");
						int menu = getInt();
						switch (menu) {
						case 1:
							System.out.println("번호 입력 후 Enter치면 대출 가능");
							no = getInt();
							lib.rentBook(no);
							break;
						case 2:
							System.out.println("번호 입력 후 Enter치면 반납 가능");
							no = getInt();
							lib.returnBook(no);
							break;
						case 0: // 실행에 오류가 날 때는 오타가 있는지 확인을... 어흑마이깟...
							System.out.println("로그아웃 하겠습니다.");
							break userOutter;
							
						default:
							System.err.println(menu+"(은)는 없는 메뉴입니다.");
							break;
						}
						
					} // 사용자 반복 끝
				}
		} // 로그인 반복 끝
		
	}
	
	
	/**
	 * 사용자로부터 입력 받은 문자열을 반환 
	 * - 숫자를 입력 시 문자 입력할 때까지 입력 재요청
	 * - q/Q 입력 시 프로그램 종료 
	 * @return
	 */
	public static String getString() {
		
		String str = "";
		
		while(true) {
			try {
				str = scanner.next();
				
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				// 숫자로 변환 시 숫자로 변경되면 문자를 입력해달라고 다시 요청
				Integer.parseInt(str);
				System.out.println("숫자는 입력 불가 *문자만 입력 가능");
				
			} catch (Exception e) {
				// 문자가 입력된 경우 반복문 탈출
				break;
			}
		}
		return str;
	}
	
	/**
	 * 사용자로부터 입력 받은 숫자를 반환
	 * - 문자 입력 시 숫자 입력할 때까지 입력 재요청
	 * - q/Q 입력 시 프로그램 종료
	 * @return
	 */
	public static int getInt() {
		int i = 0;
		while(true) {
			try {
				String str = scanner.next();
				if("q".equalsIgnoreCase(str)) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.out.println("문자 입력 불가 *숫자만 입력 가능");
			}
		}
		return i;
	}
	
	
}
























