package march30;

import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		Ex d = new Ex();
		d.method3();
	}

	public void method3() {
		int size = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해줘잉");
		// 0 ~ n-1 : 배열의 크기를 n이라고 했을 때, 배열의 인덱스 0부터 n-1까지임
		try {
			size = scan.nextInt();
			
			// n개짜리 방을 말함
			int[] arr = new int[size];
			
			// 인덱스 n번째 값을 말함
			int num = arr[size];
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 배열의 길이를 입력했다");
			// 배열의 방번호 값이 넘쳤을 경우에만 잡아주는 예외 처리
			
		} catch (NegativeArraySizeException e) {
			// 입력값이 음수일 경우에만 잡아주는 예외 처리
			System.out.println("음수를 입력했다");
		}
		
		

	}
}
