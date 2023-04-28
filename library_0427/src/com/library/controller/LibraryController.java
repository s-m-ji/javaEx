package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.service.RentService;
import com.library.vo.Book;
import com.library.vo.Member;

/**
 * 도서대여 시스템
 * 
 * ▶ 사용자로부터 입력을 받아서 요청에 알맞는 서비스 로직을 호출한다.
 * 
 * ▶ 로그인 (멤버 구분)
 * 	- 관리자
 * 		메뉴: 도서등록, 도서삭제, 사용자등록, 사용자삭제
 * 	- 사용자
 * 		메뉴: 도서대여, 도서반납, 도서대여현황
 *	 
 * @author user
 *
 */
public class LibraryController {
	
	Scanner scan = new Scanner(System.in);
	
	MemberService memberSvc = new MemberService();
	BookService bookSvc = new BookService();
	RentService rentSvc = new RentService();
	
	
	public void library () {
		System.out.println("--------------- 도서관리시스템v1.0 스타또 ---------------");
		// 로그인 메소드 호출하면서 반환타입 Member에 담아줌
		// 로그인 기능을 메소드로 분기하면서 library 메소드를 간결하게 만들었음.
		
		while(true) {
			
			Member member = login();
			System.out.println(member.getName() + "님 환잉환잉 ^_^");
			
			if(member.getAdminyn().equalsIgnoreCase("y")) {
				adminMenu(); // 관리자메뉴 실행
			} 
			else {
				userMenu(member.getId()); // 사용자메뉴 실행
			}
		}
	}
	
	/**
	 * 사용자 메뉴
	 */
	private void userMenu(String id) {
		Outter:
		while(true) {
			System.out.println("------------------ [사용자 메뉴] -----------------");
			System.out.println("1.도서대여 2.도서반납 0.로그아웃 q.종료");
			System.out.println("-----------------------------------------------");
			
			int menu = getInt();
			int no = 0;
			switch (menu) {
			case 1: // 도서대여
				bookSvc.getList();
				System.out.println("=== 대여할 도서의 번호를 입력 >");
				no = getInt();
//				bookSvc.rentB(no, id);
				rentSvc.rentB(no, id);
				break;
			case 2: // 도서반납
				bookSvc.getList();
				System.out.println("=== 반납할 도서의 번호를 입력 >");
				no = getInt();
//				bookSvc.returnB(no);
				rentSvc.returnB(no);
				
				break;
			case 0: // 로그아웃
				
				break Outter;

			default:
				System.err.println("진짜 리얼 혼또니 있는 메뉴를 고른게 맞나요?");
				break;
			}
		} // --> 사용자메뉴 while 종료
		
	}

	/**
	 * 관리자 메뉴
	 */
	private void adminMenu() {
		while(true) {
			System.out.println("------------------ [관리자 메뉴] -----------------");
			System.out.println("1.도서등록 2.도서삭제 3.사용자등록 4.사용자삭제 0.로그아웃 q.종료");
			System.out.println("-----------------------------------------------");
			
			int menu = getInt();
			// controller -> service -> dao -> data 처리
			switch (menu) {
			case 1:	// 도서등록 - 도서명, 작가명을 사용자로부터 입력 받기
					System.out.println("=== 등록할 도서의 도서명을 입력 >");
					String title = getString();
					System.out.println("=== 등록할 도서의 작가명을 입력 >");
					String author = getString();
					Book book = new Book(title, author);
					bookSvc.insertBook(book);
				break;
			case 2: // 도서 삭제
					System.out.println("=== 삭제할 도서의 번호를 입력 >");
					bookSvc.getList();
					int no = getInt();
					bookSvc.deleteBook(no);
				
				break;
			case 3: // 사용자 등록
					memberSvc.getList();
					String id = "";
					// id 중복 체크
					while(true) {
						System.out.println("=== 등록할 사용자의 id 입력 >");
						id = getString();
						boolean flag = memberSvc.idCheck(id);
						if(flag) {
							break;
						}
					}
					System.out.println("=== 등록할 사용자의 pw 입력 >");
					String pw = getString();
					System.out.println("=== 등록할 사용자의 name 입력 >");
					String name = getString();
					System.out.println("=== 사용자가 관리자면 Y 입력 >");
					String str = getString();
					String adminyn = str.equalsIgnoreCase("y")?"y":"n";
//					System.out.println("=== 등록할 사용자의 status 입력 >");
//					String status = getString();
//					System.out.println("=== 등록할 사용자의 grade 입력 >");
//					String grade = getString();
					
					memberSvc.insertM (id,pw,name,adminyn);
				break;
			case 4: // 사용자 삭제
					System.out.println("등록할 사용자의 id 입력.");
					String idX = getString();
					memberSvc.deleteM(idX);
				break;
			case 0: // 로그아웃
				
				return;
				
			default:
				System.err.println("진짜 리얼 혼또니 있는 메뉴를 고른게 맞나요?");
				break;
			}
		} // --> 관리자메뉴 while 종료
	}


	public Member login() {
		// 로그인 성공할 때까지 반복
		while(true) {
			
			System.out.println("--------------------- <로그인> ---------------------");
			System.out.println("id를 입력해주세요.");
			String id = getString();
			System.out.println("pw를 입력해주세요.");
			String pw = getString();
			
			Member member = memberSvc.login(id, pw);
			
			// 로그인 성공 : member 객체를 반환
			if(member != null) {
				return member;
			} 
		} // --> 로그인 while 종료
	}
	
	
	/**
	 * 사용자의 입력을 받아 문자열을 반환합니다.
	 * 문자가 입력될 때까지 반복
	 * q/Q가 입력되면 종료
	 * @return
	 */	
	private String getString() {
		String str = "";
		str = scan.next();
		
		while(true) {
			if("q".equalsIgnoreCase(str)) {
				System.out.println("안녕히계세요 여러분~~~ 저는 행복을 찾아 웅앵");
				System.exit(0);
			}
			return str;
		}
	}
	
	/**
	 * 사용자의 입력을 받아 숫자를 반환합니다.
	 * 숫자가 입력될 때까지 반복
	 * q/Q가 입력되면 종료
	 * @return
	 */
	private int getInt() {
		int i=0;

		while(true) {
			try {
				i = scan.nextInt();
				return i;
				
			} catch (Exception e) {
				String str = scan.next();
				// 입력값이 q/Q이면 정상 종료
				if(str.equalsIgnoreCase("q")) {
					System.out.println("안녕히계세요 여러분~~~ 저는 행복을 찾아 웅앵");
					System.exit(0);
				}
				
				System.err.println(str+"은 입력 불가");
				System.err.println("숫자 혹은 q/Q만 입력 가능");
			}
		}
//		return i;
	}
}




















