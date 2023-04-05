package com.library;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.library.dao.FileDao;
import com.library.vo.Book;

public class App {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Library lib = new Library();
		
		
		// main메소드는 static(정적)메소드
		// 정적 필드에서는 인스턴스 필드 사용 불가
		// 그래서 객체를 생성하여 필드/메소드를 사용한다
		
		App app = new App();
		
		// 또는 사용하고자하는 필드/메소드는 static으로 만든다. => 하지만 ? 너무 많은 요소가 static이면 메모리 상 과부하가 생길 수 있단다
		

		// 자주 사용하는 로직은 메소드로 추출하면 코드 간결 & 오류 수정 용이
		
		// 로그인
		// id를 입력받아서 admin이면 관리자 아니면 사용자
		// 관리자: 책 등록, 삭제
		// 사용자: 책 대출, 반납
		
		
		while(true) { // 로그인 시작
			System.out.println("id를 입력해주세요");
//			String id = app.scanner.next();
			String id = getString();			
			int no = 0;
			
			userOutter:
				if(id.equalsIgnoreCase("admin")) {
					System.out.println("관리자 메뉴입니다.");
					
					outter:
					while(true) { // 관리자 시작
					System.out.println("[메뉴 선택] 1.등록 2.삭제 0.로그아웃 q.종료");
					int menu = getInt();
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
					// 관리자 끝
				} 
				
			} 
				
				else {
				System.out.println(id+"님 환영합니다.");
				
				while(true) { // 사용자 시작
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
					case 3:
						System.out.println("로그아웃 하겠습니다.");
						break userOutter;
						
					default:
						System.err.println(menu+"(은)는 없는 메뉴입니다.");
						break;
					}
					
				} // 사용자 끝
			}
		} // 로그인 끝
		
		

		
		
		
		/*
		List<Book> list = dao.getList();
		for(Book book : list) {
			System.out.println(book.toString());
		}
		
		FileDao dao = new FileDao();
		List<Book> list = new ArrayList<>();
		
		list.add(new Book(1, "오늘도", "우리는", true));
		
		dao.listToFile(list);
		
		lib.insertBook(3, "H마트에서 울다4", "미셸", true);
		
		// 책 삭제 : 메소드를 이름을 먼저 부여하고 컴파일러한테 자동으로 만들어달라고하기!
		int no=0;
		boolean result = lib.deleteBook(no);
		
		lib.deleteBook(3);
		
		result = lib.rentBook(no);
		result = lib.returnBook(no);

		lib.returnBook(0);
		lib.rentBook(0);
		
		System.out.println(lib); 
		//  .toString()을 붙이지 않아도 같은 값이 출력된다.
		 
		 */

		
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
























