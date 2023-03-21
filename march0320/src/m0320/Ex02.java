package m0320;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		
		Outter:
		while(run) {
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("선택>");
			int input = Integer.parseInt(scan.nextLine());
			
			if(input<0 || input>4) {
				System.out.println("잘못된 선택입니다.");
			}
			
			switch (input) {
				case 1:
					System.out.println("예금액> ");
					balance += Integer.parseInt(scan.nextLine());
					break;
				case 2:
					System.out.println("출금액> ");
						int num = Integer.parseInt(scan.nextLine());
						if(balance<num) {
							System.out.println("잔액 부족");
						} else {
						balance -= num;
						}
					break;
				case 3: System.out.println("잔액> " + balance);
					break;
				case 4:
					break Outter;
			}
		}
		
		System.out.println("- 종료 -");
	}
}
