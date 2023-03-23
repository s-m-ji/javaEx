package exam06;

import java.util.Scanner;

public class MemeberServiceExample2 {

	public static void main(String[] args) {
		MemberService2 service = new MemberService2("id", "password");
		
		Scanner scan = new Scanner(System.in);
		
		int i=0;		
		
		while(true) {
			System.out.println("아이디 입력");
			String login = scan.next();
			
			System.out.println("패스워드 입력");
			String password = scan.next();
			
			if(service.login(login, password)) {
				System.out.println("로그인 성공쓰");
				System.out.println("로그아웃 하려면 1 입력쓰");
				int logout = scan.nextInt();
				if(logout==1) {
					break;
				}
				
			} else {
				System.out.println("로그인 실패쓰");
				i++;
				if(i>=5) {
					System.out.println("시스템을 종료쓰 *아이디/패스워드 불일치 5회 이상");
					System.exit(0);
				}
				
			}
		}
		
		service.logout(""); // 사실 로그아웃할 때 아이디값 받는건 의미없음
	}

}
