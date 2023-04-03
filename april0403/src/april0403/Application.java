package april0403;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		Scanner scn = new Scanner(System.in);
		Library lib = new Library();
		
		lib.addBook(1, "책1", "책1");
		lib.addBook(2, "책2", "책2");
		lib.addBook(3, "책3", "책3");
		
		Application.printTitle("도서관에 오신걸 환잉환잉");
		
		System.out.println("[로그인] id:");
		String id = scn.next();
		
		if(id.equals("admin")) {
			Application.printTitle("관리자 메뉴");
			app.admin(scn, lib);
			
		} else {
			Application.printTitle(id + "님, 환영합니다.");
			app.user(scn, lib);
		}
		
	}

	public void user(Scanner scn, Library lib) {
		int menu =0;
		while(true) {
			lib.toString();
			
			System.out.println("1.대여 2.반납 0.로그아웃 q.종료");
			Application.printTitle("메뉴 선택");
			menu = getInt(scn);
			
			// 책 대여
			int index =0;
			switch (menu) {
			case 1:
				System.out.println("대여할 책 번호 입력");
				index = getInt(scn, lib.getBookSize());
				lib.rentBook(index);
				break;
			case 2:
				System.out.println("반납할 책 번호 입력");
				index = getInt(scn, lib.getBookSize());
				lib.returnBook(index);
				break;
			case 0:
				System.out.println("로그아웃 했습니다.");
				break;
				
			default:
				System.out.println("없는 메뉴입니다.");
				break;
			}
			
		}
		
	}

	/**
	 * 관리자 메뉴
	 * @param scn
	 * @param lib
	 */
	public void admin(Scanner scn, Library lib) {
		int menu =0;
		while(true) {
			// 책 목록 출력
			lib.toString();
			
			// 메뉴 표시
			System.out.println("1.등록 2.삭제 0.로그아웃 q.종료");
			Application.printTitle("메뉴 선택");
			menu = getInt(scn);
			
			// 책 등록
			switch (menu) {
			case 1:
				int no;
				String title, author;
				System.out.println("일련번호, 제목, 작가를 입력");
				no = getInt(scn);
				title = getString(scn);
				author = getString(scn);
				
				boolean res = lib.addBook(no, title, author);
				if(res) {
					System.out.println("등록 되었음");
				} else {
					System.err.println("등록 중 오류 발생");
				}
				break;
				
			case 2:
				System.out.println("삭제할 번호 입력");
				int index = getInt(scn, lib.getBookSize());
				lib.removeBook(index);
				break;
				
			case 3:
				System.out.println("로그아웃 합니다.");
				return;
				
			default:
				System.out.println("없는 메뉴입니다.");
				break;
			}
		}
		
	}

	
	/**
	 * 숫자 입력 
	 * q/Q 입력 시 프로그램 종료
	 * @param scn
	 * @param index
	 * @return
	 */
	public int getInt(Scanner scn, int index) {
		int i=0;
		while(true) {
			try {
				i = scn.nextInt();
				if(i>index) {
					System.out.println("입력할 수 없는 번호");
					continue;
				}
				break;
			} catch (Exception e) {
				if(scn.next().equalsIgnoreCase("Q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				System.out.println(scn.next() + "은 입력 불가");
			}
		}
		return i;
	}

	/**
	 * 숫자 입력
	 * q/Q 입력 시 프로그램 종료
	 * @param scn
	 * @return
	 */
	public int getInt(Scanner scn) {
		int i=0;
		while(true) {
			try {
				i = scn.nextInt();
				break;
			} catch (Exception e) {
				if(scn.next().equalsIgnoreCase("q")) {
					System.out.println("프로그럄 종료");
					System.exit(0);
				}
				System.out.println(scn.next() + "는 입력 불가");
			}
		}
		return i;
	}
	
	public String getString(Scanner scn) {
		String str = "";
		while(true) {
			try {
				str = scn.next();
				if(str.equalsIgnoreCase("Q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				break;
			} catch (Exception e) {
				System.out.println("입력중 오류 발생");
			}
		}
		return str;
	}

	/**
	 * 타이틀 출력
	 * @param title
	 */
	public static void printTitle(String title) {
		System.out.println("********************");
		System.out.println(title);
		System.out.println("********************");
	}
}























