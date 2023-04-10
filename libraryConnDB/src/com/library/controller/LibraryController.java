package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.vo.BookVo;


/**
 * 사용자의 요청을 입력 받습니다.
 * 요청에 맞는 서비스 로직을 호출합니다.
 * @author user
 *
 */
public class LibraryController {
	
	BookService bookService = new BookService();
	MemberService memberService = new MemberService();
	
	public void start() {
		System.out.println("***** 도서관에 오신 것을 환영합니다. *****");
		
		while(true) {
			// 로그인 요청
			MemberVo memberVo = login(); 
			// TODO admin 계정으로 로그인 시도하였으나 실패... -> 원인: 커밋을 안해서그랬음 흑
			
			// 도서 목록 조회
			bookService.getList();
			
			if("Y".equalsIgnoreCase(memberVo.getAdminYN())) {
				adminMenu(); // 관리자 계정 - 메뉴
			} else {
				userMenu(); // 사용자 계정 - 메뉴
			}
		}
		
	}
	
	
	public void adminMenu() {
//		Outter:
		while(true) {
			System.out.println("===== 관리자 메뉴 =====");
			System.out.println("1.도서등록 2.도서삭제 3.사용자등록 4.사용자삭제 0.이전메뉴 q.종료");
			
			System.out.println("메뉴를 입력해주세요.");
			int menu = getInt();	// 메뉴 변수
			int bookNo = 0;			// 도서 일련번호 변수
			String id ="";			// 사용자 아이디 변수
			String pw = ""; 		// 사용자 비밀번호 변수
			switch (menu) {
			case 1: // 도서 등록
				System.out.println("도서 일련번호를 입력해주세요.");
				bookNo = getInt();
				System.out.println("제목을 입력해주세요.");
				String bookTitle = getString();
				System.out.println("작가를 입력해주세요.");
				String bookAuthor = getString();
				
				int res = bookService.insertBook(new BookVo(bookNo, bookTitle, bookAuthor, "N"));
				break;
				
			case 2: // 도서 삭제
				System.out.println("삭제할 도서 일련번호를 입력해주세요");
				bookNo = getInt();
				bookService.deleteBook(bookNo);
				break;
				
			case 3: // 사용자 등록
				System.out.println("아이디를 입력해주세요.");
				id = getString();
				System.out.println("비밀번호를 입력해주세요.");
				pw = getString();
				System.out.println("이름을 입력해주세요.");
				String name = getString();
				System.out.println("관리자 여부를 입력해주세요 (y/n)");
				String adminYNStr = getString();
				String adminYN = adminYNStr.equalsIgnoreCase("y")?"y":"n";
				
				MemberVo memberVo = new MemberVo(id, pw, name, adminYN);
				memberService.insertMember(memberVo);
				break;
			case 4: // 사용자 삭제
				System.out.println("삭제할 사용자 아이디를 입력해주세요.");
				id = getString();
				System.out.println("비밀번호를 입력해주세요.");
				pw = getString();
				memberService.deleteMember(id, pw);
				break;
			case 0:
				
				// break Outter;
				return; // 메소드여서 리턴을 넣어도 괜찮다.
				
			default:
				System.err.println("메뉴를 다시 확인해주세요.");
				break;
			}
		}
	}
	
	public void userMenu() {
		while(true) {
			
			System.out.println("===== 사용자 메뉴 =====");
			System.out.println("1.도서대여 2.도서반납 0.이전메뉴 q.종료");
			System.out.println("메뉴를 입력해주세요.");
			int menu = getInt();
			int bookNo = 0;
			switch (menu) {
			case 1: // 도서 대여
				System.out.println("대여할 도서의 일련번호를 입력해주세요.");
				bookNo = getInt();
				bookService.rentBook(bookNo);
				break;
				
			case 2: // 도서 반납
				System.out.println("반납할 도서의 일련번호를 입력해주세요.");
				bookNo = getInt();
				bookService.returnBook(bookNo);
				break;
			case 0:
				
				return;
				
			default:
				System.out.println("메뉴를 확인 후 다시 선택해주세요.");
				break;
			}
		}
		
	}
	
	
	/**
	 * 로그인
	 * ID/PW를 입력 받아서 일치하는 사용자 정보를 조회
	 * 로그인 성공할 때까지 반복
	 * @return
	 */
	public MemberVo login() {
		while(true) {
			System.out.println("ID 입력: ");
			String id = getString();
			System.out.println("PW 입력: ");
			String pw = getString();
			
			MemberVo memberVo = memberService.login(id, pw);
			if(memberVo != null) {
				// 로그인 성공
				return memberVo;
			}
		}
	}
	
	static Scanner scan = new Scanner(System.in);
	
	public static String getString() {
		String str = "";
		str = scan.next();
		if(str.equalsIgnoreCase("q")) {
			System.exit(0);
		}
		return str;
	}
	
	public static int getInt() {
		int i = 0;
		while(true) {
			try {
				String str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					System.exit(0);
				}
				i = Integer.parseInt(str);
				return i;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("숫자 입력 중 오류 발생");
			}
		}
	}


}

















