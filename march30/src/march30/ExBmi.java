package march30;

import java.util.Scanner;

public class ExBmi {

	public static void main(String[] args) {
		double w,h;
		Scanner s = new Scanner(System.in);
		
		
		while(true) {
			try {
				System.out.println("체중?");
				w = s.nextDouble();
				if(w>300 || w<0) {
					System.err.println("범위 초과");
				}
				else {
					break;
				}
				
				// 이렇게 break를 따로 둘 경우에는 다음 반복문(키 입력)으로 그냥 넘어가게된당
				//break;
				
			} catch (Exception e) {
				System.err.println("다시 입력");
				String str = s.nextLine();
				
			}
		}
		
		while(true) {
			try {
				System.out.println("신장?");
				h = s.nextDouble();
				break;
				
			} catch (Exception e) {
				System.err.println("다시 입력");
				String str = s.nextLine();
			}
		}

		System.out.printf("체중: %.2f, 신장: %.2f의 Bmi는 %.4f", w,h,w/(h*h));
	}

}
