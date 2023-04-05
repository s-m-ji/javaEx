package april0404;

import java.util.Scanner;

public class App2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		App2 app = new App2();
		Library lib = new Library();
		lib.info();
		
		while(true) {
			
			System.out.println("로그인 하시려면 [아이디]를 입력해주세요.");
			String id = app.getString();
			if(id.equals("admin")) {
				System.out.println("1.등록 2.삭제 0.로그아웃 *Q.종료");
				int menu = app.getInt();
				int no = app.getInt();
				if(menu == 1) {
					System.out.println("일련번호를 입력해주세요");
					no = app.getInt();
					System.out.println("제목을 입력해주세요");
					String title = app.getString();
					System.out.println("작가를 입력해주세요");
					String author = app.getString();
					
					lib.insertBook(no, title, author, false);
				}
				
			} else if (id.equals("user")) {
				System.out.println("유저로군요?");
			} else {
				System.out.println("잘못 입력했군요?");
			}
		}
	}

	public String getString() {
		String str="";
		try {
			str = sc.next();
			if(str.equals("q")) {
				System.out.println("종료");
				System.exit(0);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return str;
	}
	
	public int getInt() {
		int i=0;
		while(true) {
			try {
				String str = sc.next();
				if(str.equals("Q")) {
					System.out.println("종료");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return i;
	}
	
	

}
