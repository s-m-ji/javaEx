package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.vo.BookVo;

public class LibraryController {
	
	BookService bService = new BookService();
	MemberService mService = new MemberService();
	
	public void start() {
		System.out.println("*** 도서관에 오신 것을 환영합니다. ***");
		while(true) {
			MemberVo memberVo = login();
			bService.bookListPrint();
			if("y".equalsIgnoreCase(memberVo.getAdminYN())) {
				adminMenu();
			} else {
				userMenu();
			}
		}
	}

	public MemberVo login() {
		while(true) {
			System.out.println("ID: ");
			String id = getString();
			System.out.println("PW: ");
			String pw = getString();
			
			MemberVo memberVo = mService.login(id, pw);
			// return null; // 여기다가 이렇게 null을 써버리면 널포인터예외 발생한드아 흑흑
			if(memberVo != null) {
				return memberVo;
			}
		}
	}

	public void adminMenu() {
		while(true) {
			System.out.println("--- 관리자 메뉴 ---");
			System.out.println("[메뉴 선택] 1.도서등록 2.도서삭제 3.유저등록 4.유저삭제 0.이전메뉴 q.종료");
			int menu = getInt();
			int bookNo = 0;
			String id = "";
			String pw = "";
			
			switch (menu) {
			case 1:
				System.out.println("도서 번호 입력");
				bookNo = getInt();
				System.out.println("제목 입력");
				String title = getString();
				System.out.println("작가 입력");
				String author = getString();
				bService.insertB(new BookVo(bookNo, title, author, "N"));
				break;
			case 2:
				System.out.println("삭제할 번호 입력");
				bookNo = getInt();
				bService.deleteB(bookNo);
				break;
			case 3:
				System.out.println("유저 id, pw, 어드민여부를 입력");
				id = getString();
				pw = getString();
				String name = getString();
				String adminYNstr = getString();
				String adminYN = adminYNstr.equalsIgnoreCase("Y")?"y":"n";
				
				MemberVo memberVo = new MemberVo(id, pw, name, adminYN);
				mService.insertM(memberVo);
				break;
			case 4:
				System.out.println("삭제할 유저 아이디를 입력");
				id = getString();
				mService.deleteM(id);
				break;
			case 0:
				
				return;
				
			default:
				System.out.println("메뉴 재확인");
				break;
			}
		}
	}
	

	public void userMenu() {
		while(true) {
			System.out.println("--- 유저메뉴 ---");
			System.out.println("[메뉴 선택] 1.도서대여 2.도서반납 3.이전메뉴 q.종료");
			int menu = getInt();
			int bookNo = 0;
			switch (menu) {
			case 1:
				System.out.println("대여할 도서 번호 입력");
				bookNo = getInt();
				bService.rentB(bookNo);
				break;
			case 2:
				System.out.println("반납할 도서 번호 입력");
				bookNo = getInt();
				bService.returnB(bookNo);
				break;
			case 3:
				
				return;
				
			default:
				break;
			}
		}
		
	}
	
	Scanner scan = new Scanner(System.in);
	
	public String getString() {
		String str = "";
		str = scan.next();
		if(str.equalsIgnoreCase("q")) {
			System.exit(0);
		}
		return str;
	}
	
	public int getInt() {
		int i=0;
		while(true) {
			try {
				String str = scan.next();
				if(str.equalsIgnoreCase("Q")) {
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
