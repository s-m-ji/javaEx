package com.library.controller;

import java.sql.SQLException;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.util.ScannerUtil;
import com.library.vo.MemberVo;

public class LibraryController {
	BookService bookService = new BookService();
	MemberService memberService = new MemberService();
	
	public void start() throws SQLException {
		System.out.println("===================");
		System.out.println("도서관에 오신걸 환영합니다.");
		System.out.println("===================");
		
		MemberVo member = login();
		
		if(member.getAdminYN().equalsIgnoreCase("Y")) {
			adminMenu();
		} else {
			userMenu();
		}
		
	}
	
	public MemberVo login() throws SQLException {
				
		while(true) {
			System.out.println("로그인");
			System.out.print("id : ");
			String id = ScannerUtil.getString();		 
			System.out.print("pw : ");
			String pw = ScannerUtil.getString();
			
			// 로그인 처리
			MemberVo member = memberService.login(id, pw);
			if(member == null) {
				System.out.println("아이디/비밀번호가 일치 하지 않습니다.");
				continue;
			}
			return member;
		}
	}
	
	public void getMenu(MemberVo member) {
		if(member.getAdminYN().equals("Y")) {
			printTitle("관리자 메뉴 입니다.");
			adminMenu();
			
		} else {
			printTitle(member.getId()+"님 환영합니다.");
			userMenu();
		}
	}
	/**
	 * 관리자 메뉴
	 * @param scan
	 * @param lib
	 * @throws SQLException 
	 */
	public void adminMenu() {
		int menu;
		while(true) {
			
			// 도서목록 출력
			bookService.bookListPrint();
			
			System.out.print("1. 책 등록  ");
			System.out.print("2. 책 삭제  ");
			System.out.print("3. 사용자 등록 ");
			System.out.print("4. 사용자 삭제 ");
			System.out.print("0. 로그아웃  ");
			System.out.println("Q. 종료");
			
			printTitle("메뉴를 선택해주세요.");
			menu = ScannerUtil.getInt();
			
			int no = 0;
			switch (menu) {
			
			// 책 등록
			case 1:
				String title, author;
				System.out.println("책 번호를 입력해주세요");
				no = ScannerUtil.getInt();
				System.out.println("책 제목을 입력해주세요");
				title = ScannerUtil.getString();
				System.out.println("책 지은이를 입력해주세요");
				author = ScannerUtil.getString();
				
				// 책을 등록하고 결과를 반환 받습니다.
				bookService.InsertBook(no, title, author);
				
				break;
				
			// 책 삭제
			case 2:
				System.out.println("삭제할 번호를 입력해주세요.");
				no = ScannerUtil.getInt();
				bookService.deleteBook(no);
				break;
			
			// 사용자 등록
			case 3:
				System.out.println("사용자 id를 입력해주세요");
				String id = ScannerUtil.getString();
				System.out.println("비밀번호를 입력해주세요");
				String pw = ScannerUtil.getString();
				System.out.println("이름을 입력해주세요");
				String name = ScannerUtil.getString();
				System.out.println("관리자 계정 이면 Y를 입력해주세요");
				String str = ScannerUtil.getString();
				String adminYN = str.equalsIgnoreCase("Y")? "Y" : "N";
				
				memberService.insertMember(id, pw, name, adminYN);
				break;	
			
			// 사용자 삭제
			case 4:
				System.out.println("삭제할 사용자 id를 입력해주세요.");
				id = ScannerUtil.getString();
				
				memberService.deleteMember(id);
				break;
						
			// 로그아웃
			case 0:
				return;
				
			default :
				System.err.println(menu + "는 없는 메뉴 입니다.");
				break;
			}
		}
		
	}
	
	/**
	 * 사용자 메뉴
	 * @param scan
	 * @param lib
	 */
	public void userMenu() {
		int menu, index;
		while(true) {
			// 도서목록 출력
			bookService.bookListPrint();
			
			System.out.print("1. 대여  ");
			System.out.print("2. 반납  ");
			System.out.print("0. 로그아웃  ");
			System.out.println("Q. 종료");
			printTitle("메뉴를 선택해주세요.");
			menu = ScannerUtil.getInt();
			
			
			switch (menu) {
			case 1:
				System.out.println("대여할 번호를 입력 해주세요.");
				index = ScannerUtil.getInt();
				bookService.rentBook(index);
				break;
			case 2:
				System.out.println("반납할 번호를 입력 해주세요.");
				index = ScannerUtil.getInt();
				bookService.returnBook(index);
				break;
			// 로그아웃
			case 0:
				return;
				
			default:
				System.out.println(menu + "는 없는 메뉴 입니다.");
				break;
			}
		}
		
	}

	
	/**
	 * 타이틀을 출력 합니다.
	 * @param title
	 */
	public static void printTitle(String title) {
		System.out.println("=========================");
		System.out.println(title);
		System.out.println("=========================");
	}
	
	
	
}







