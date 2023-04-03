package com.library;

import java.util.Scanner;

public class Application {
	
	// 인스턴스 멤버 : 생성 후 사용 가능하기에
	// 참조변수명으로 .
	Scanner scan = new Scanner(System.in);
		
	public static void main(String[] args) {
		// 아래 코드를 간결하게 하기위해 입력받는 메소드를 하나 생성
//		scan.next();
//		try {
//			scan.nextInt();
//		} catch (Exception e) {
//			System.err.println("입력 중 오류가 발생했다");
//		}
		
		Application app = new Application();
		
		// 스캔 사용 희망 시 -> scan을 이렇게 받아오거나, 이미 만든 메소드를 활용
//		app.scan.next(); 
//		app.getString();
//		app.getInt();
		
		// 도서관 생성
		Library lib = new Library("file");
		
		// 로그인 처리
		while(true) {
				
			System.out.println("로그인 하시려면 [아이디]를 입력해주세요.");
			String id = app.getString();
			
			if("admin".equalsIgnoreCase(id)) {
				// ====================== 관리자 ======================
				
				app.adminMenu(lib);
				
//				while(true) {
//					
//					// 도서 목록 출력
//					lib.info();
//					
//					// 메뉴 확인
//					System.out.println("1.등록 2.삭제 0.로그아웃 *Q.종료");
//					System.out.println("메뉴를 입력해주세요.");
//					int menu = app.getInt();
//					int no = 0;
//					
//					switch (menu) {
//					case 1: // 도서 등록
//						System.out.println("일련번호를 입력해주세요");
//						no = app.getInt();
//						System.out.println("제목을 입력해주세요");
//						String title = app.getString();
//						System.out.println("작가를 입력해주세요");
//						String author = app.getString();
//						
//						lib.insertBook(no, title, author, false);
//						break;
//						
//					case 2:	// 도서 삭제
//						System.out.println("삭제할 책의 일련번호를 입력해주세요");
//						no = app.getInt();
//						lib.deleteBook(no);
//						break;
//						
//					case 0:	// 로그아웃
//						System.out.println("로그아웃 되었습니다.");
//						break Outter;
//						
//					default:
//						System.err.println("메뉴를 확인해주세요");
//					}
//					
////				if(menu == 1) {
////					System.out.println("대여할 도서번호를 입력해주세요");
////					int index = app.getInt();
////					lib.rentBook(index);
////					System.out.println("대여되었습니다.");
////				} else if(menu == 2) {
////					System.out.println("반납할 도서번호를 입력해주세요");
////					int index = app.getInt();
////					lib.returnBook(index);
////					System.out.println("반납되었습니다.");
////				} else if(menu == 0) {
////					System.out.println("로그아웃 합니다.");
////					break Outter;
////				} else {
////					System.err.println("메뉴를 확인해주세요");
////				}
//					
//					// 메뉴 처리 후 목록 재출력 
//					lib.info();
//				}
				
				
			} else {
				// ====================== 사용자 ======================
				app.memberMenu(lib);
				}
		}
			
		
//		System.out.println("나이를 입력해주세요");
//		System.out.println(app.getInt());
//		System.out.println("이름을 입력해주세요");
//		System.out.println(app.getString());
		
	}
	
	/**
	 * 관리자 메뉴 기능
	 * @param lib
	 */
	private void adminMenu(Library lib) {
		// 도서 목록 출력
		lib.info();
		
		Outter: // 로그아웃 처리 시 다시 실행
		while(true) {
			
			// 메뉴 확인
			System.out.println("1.등록 2.삭제 0.로그아웃 *Q.종료");
			System.out.println("메뉴를 입력해주세요.");
			int menu = getInt();
			int no = 0;
			
			switch (menu) {
			case 1: // 도서 등록
				System.out.println("일련번호를 입력해주세요");
				no = getInt();
				System.out.println("제목을 입력해주세요");
				String title = getString();
				System.out.println("작가를 입력해주세요");
				String author = getString();
				
				lib.insertBook(no, title, author, false);
				break;
				
			case 2:	// 도서 삭제
				System.out.println("삭제할 책의 일련번호를 입력해주세요");
				no = getInt();
				lib.deleteBook(no);
				break;
				
			case 0:	// 로그아웃
				System.out.println("로그아웃 되었습니다.");
				break Outter;
				
			default:
				System.err.println("메뉴를 확인해주세요");
			}
			
//		if(menu == 1) {
//			System.out.println("대여할 도서번호를 입력해주세요");
//			int index = app.getInt();
//			lib.rentBook(index);
//			System.out.println("대여되었습니다.");
//		} else if(menu == 2) {
//			System.out.println("반납할 도서번호를 입력해주세요");
//			int index = app.getInt();
//			lib.returnBook(index);
//			System.out.println("반납되었습니다.");
//		} else if(menu == 0) {
//			System.out.println("로그아웃 합니다.");
//			break Outter;
//		} else {
//			System.err.println("메뉴를 확인해주세요");
//		}
			
			// 메뉴 처리 후 목록 재출력 
			lib.info();
		}
	}
	
	
	/**
	 * 사용자 메뉴 기능
	 * @param lib
	 */
	private void memberMenu(Library lib) {
		// 도서 목록 출력
		lib.info();
		
		Outter: // 로그아웃 처리 시 다시 실행
		while(true) {
			
			// 메뉴 확인
			System.out.println("1.대여 2.반납 3.로그아웃 *Q.종료");
			System.out.println("메뉴를 입력해주세요.");
			int menu = getInt(); // 나 자신의 메소드라서 app.getInt라고 하지않아도 됨다
			
			if(menu == 1) { // 도서 대여
				System.out.println("대여할 도서번호를 입력해주세요");
				int index = getInt();
				lib.rentBook(index);
				
				
			} else if(menu == 2) { // 도서 반납
				System.out.println("반납할 도서번호를 입력해주세요");
				int index = getInt();
				lib.returnBook(index);
				
			} else if(menu == 3) { // 로그아웃
				System.out.println("로그아웃 합니다.");
				break Outter;

			} else {
				System.err.println("메뉴를 확인해주세요");
			}
			
			// 메뉴 처리 후 목록 재출력 
			lib.info();
		}
	}
	
	
	/**
	 * 사용자로부터 숫자를 입력 받습니다.
	 * @return
	 */
	public int getInt() {
		int i=0;
		while(true) {
			try {
				String str = scan.next();
				// i = scan.nextInt();
				
				// 사용자가 q나 Q를 입력하면 프로그램 종료
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료할게여~~~");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.err.println("잘못 입력했쟈냐???");
				System.err.println("숫자 입력해줘잉");
			}
		}
		return i;
	}
		
	
	/**
	 * 사용자로부터 문자를 입력 받습니다.
	 * @return
	 */
	public String getString() {
		String res = "";
		while(true) {
			try {
				res = scan.next();
				// 사용자가 q나 Q를 입력하면 프로그램 종료
				if(res.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				break;
			} catch (Exception e) {
				System.err.println("잘못 입력했쟈냐???");
				System.err.println("문자 입력해줘잉");
			}
		}
		return res;
	}
	
	// ===>>> 숫자나 문자 등등 여러 종류를 입력 받으면서 생기는 오류 처리를 하나의 코드 블록 내에서 작성하고싶다면?
	// case문 활용할 수 있다 ! *다만, 코드를 알아보기 힘들다면 각각 나눠서 적는게 더 좋다고하심.
	
}
