package com.library;

import java.util.Scanner;

import com.library.util.PropertiesUtil;
import com.library.vo.Book;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			Application.printTitle("도서관에 오신걸 환영합니다.");
			
			System.out.println("로그인");
			System.out.println("id : ");
			String id = scan.next();		 

			/**
			 * 설정 파일로 부터 설정 정보를 얻어 옵니다.
			 */
			String selectDao = PropertiesUtil.getProp("dao");
			String fileName = PropertiesUtil.getProp("fileName");
			System.out.println("데이터Acess선택 : " + selectDao);
			Library lib = new Library(selectDao, fileName);
			
			
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
				Book book = lib.addBook(title, author);
				System.out.println("등록 되었습니다.");
				
				break;
				
			// 책 삭제
			case 2:
				System.out.println("삭제할 번호를 입력해주세요.");
				int no = getInt(scan);
				lib.removeBook(no);
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
				index = getInt(scan);
				lib.rentBook(index);
				break;
			case 2:
				System.out.println("반납할 번호를 입력 해주세요.");
				index = getInt(scan);
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







