package com;

import java.util.Scanner;

import com.library.Library;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		
		Scanner scan = new Scanner(System.in);
		
		Library lib = new Library();
		// 책 추가
		lib.addBook("책1", "지은이1");
		lib.addBook("책2", "지은이2");
		lib.addBook("책3", "지은이3");		
		
		while(true) {
			Application.printTitle("도서관에 오신걸 환영합니다.");
			
			System.out.println("로그인");
			System.out.println("id : ");
			String id = scan.next();				
			
			if(id.equals("admin")) {
				Application.printTitle("관리자 메뉴 입니다.");
				app.admin(scan, lib);
				
			} else {
				Application.printTitle(id+"님 환영합니다.");
				app.user(scan, lib);
			}
		}
	}
	
	/**
	 * 관리자 메뉴
	 * @param scan
	 * @param lib
	 */
	public void admin(Scanner scan, Library lib){
		int menu;
		while(true) {
			
			// 책 목록 출력
			lib.toString();
			
			System.out.print("1. 책 등록  ");
			System.out.print("2. 책 삭제  ");
			System.out.print("0. 로그아웃  ");
			System.out.println("Q. 종료");
			Application.printTitle("메뉴를 선택해주세요.");
			menu = getInt(scan);
			
			switch (menu) {
			// 책 등록
			case 1:
				String title, author;
				System.out.println("책 제목을 입력해주세요");
				title = getString(scan);
				System.out.println("책 지은이를 입력해주세요");
				author = getString(scan);
				
				// 책을 등록하고 결과를 반환 받습니다.
				boolean res = lib.addBook(title, author);
				
				if(res) {
					System.out.println("등록 되었습니다.");
				}else {
					System.err.println("등록중 오류가 발생 하였습니다.\n 관리자에게 문의 해주세요");
				}
				break;
				
			// 책 삭제
			case 2:
				System.out.println("삭제할 번호를 입력해주세요.");
				int index = getInt(scan, lib.getBookSize());
				lib.removeBook(index);
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
	public void user(Scanner scan, Library lib) {
		int menu, index;
		while(true) {
			lib.toString();
			System.out.print("1. 대여  ");
			System.out.print("2. 반납  ");
			System.out.print("0. 로그아웃  ");
			System.out.println("Q. 종료");
			Application.printTitle("메뉴를 선택해주세요.");
			menu = getInt(scan);
			
			
			switch (menu) {
			case 1:
				System.out.println("대여할 번호를 입력 해주세요.");
				index = getInt(scan, lib.getBookSize());
				lib.rentBook(index);
				break;
			case 2:
				System.out.println("반납할 번호를 입력 해주세요.");
				index = getInt(scan, lib.getBookSize());
				lib.returnBook(index);
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
	 * 숫자 입력 받기
	 * Q, q 입력시 프로그램 종료
	 * @param scan
	 * @return
	 */
	public int getInt(Scanner scan) {
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
	 * 숫자 입력 받기
	 * Q, q 입력시 프로그램 종료
	 * @param scan
	 * @return
	 */
	public int getInt(Scanner scan, int index) {
		int i = 0;
		while(true) {
			try {
				i = scan.nextInt();
				if(i>index) {
					System.err.println("입력할 수 없는 번호 입니다. 번호를 다시 입력해주세요.");
					continue;
				}
				break;
			} catch(Exception e) {
				if(scan.next().equalsIgnoreCase("q")) {
					// 시스템을 종료 합니다.
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
				}
				System.err.println( scan.next() + " : 입력 불가능 합니다.");;
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
	public String getString(Scanner scan) {
		String str = "";
		while(true) {
			try{
				str = scan.next();
				if(str.equalsIgnoreCase("q")) {
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







