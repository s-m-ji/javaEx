package april0404;

import java.util.Scanner;

public class App {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		App app = new App();
		Library lib = new Library();
		
		while(true) {
			
			System.out.println("로그인: 아이디 입력");
			String id = app.getString();
			Outter:
			if(id.equals("admin")) {
				lib.info();
				while(true) {
					System.out.println("메뉴선택 1.등록 2.삭제 3.로그아웃 q.종료");
					int menu =app.getInt();
					int no =app.getInt();
					switch (menu) {
					case 1:
						System.out.println("번호, 제목, 작가를 입력");
						no = app.getInt();
						String title = app.getString();
						String author = app.getString();
						lib.insertBook(no, title, author, false);
						break;
					case 2:
						System.out.println("삭제할 번호 입력");
						no = app.getInt();
						lib.deleteBook(no);
						break Outter;
					case 3:
						System.out.println("로그아웃 합니다");
						break;
						
					default: 
						System.out.println("메뉴 다시 선택");
						break;
					}
				}
			} 
			
			else if (id.equals("user")) { 
				lib.info();
				System.out.println("메뉴선택 1.대여 2.반납 3.로그아웃 q.종료");
				int menu=0;
				int no=0;
				switch (menu) {
				case 1:
					no = app.getInt();
					lib.rentBook(no);
					break;
				case 2:
					no = app.getInt();
					lib.returnBook(no);
					break;
				case 3:
					System.out.println("로그아웃 합니다");
					break Outter;
					
				default:
					System.out.println("메뉴 다시 선택");
					break;
				}
				
			}
			
			else {
				System.out.println("id를 다시 입력");
			}
			
		}
		
	}
	
	
	
	public int getInt() {
		int i=0;
		while(true) {
			try {
				String str = sc.next();
				if(str.equals("q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.err.println("숫자만 입력 가능");
			}
		}
		return i;
	}
	
	public String getString() {
		String str="";
		while(true) {
			try {
				str = sc.next();
				if(str.equals("q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				break;
			} catch (Exception e) {
				System.err.println("문자만 입력 가능");
			}
		}
		return str;
	}
	
	
}
