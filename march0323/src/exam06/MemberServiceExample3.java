package exam06;

import java.util.Scanner;

public class MemberServiceExample3 {

	public static void main(String[] args) {
		MemberService3 service = new MemberService3("스누피", "0123");
		
		Scanner scan = new Scanner(System.in);
		
		int j =0;
		int k =0;
		while(true) {
			System.out.println("아이디: ");
			String i = scan.next();
			
			System.out.println("패스워드: ");
			String p = scan.next();
			
			boolean check = service.login(i,p);
			if(check) {
				System.out.println(" / 로그아웃 하려면 'out'을 입력");
				String t = scan.next();
				while(true) {
					j++;
					System.out.printf("잘못 입력 %d회\n", j);
					t = scan.next();
					if(t.equals("out")) {
						service.logout();
						System.exit(0);
					} else if(!(t.equals("out"))) {
						if(j>=2) {
							System.out.printf("로그아웃 불가 *잘못 입력 %d회 이상 \n", j);
							System.exit(0);
						}
					} 
				}
			} else {
				System.out.println(" *이유: id/pw가 불일치");
				k++;
				if(k>=3) {
					System.out.println("시스템 종료쓰 *아이디/패스워드 불일치 3회 이상");
					System.exit(0);
				}
				
			}
		}
		
	}

}
