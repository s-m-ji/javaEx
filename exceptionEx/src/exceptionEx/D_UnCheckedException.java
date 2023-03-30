package exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * UnCheckedException 
 * - RuntimeException을 상속하고 있는 예외들 => 실행 예외 
 * - 컴파일 시 예외 처리 코드가 있는지 검사하지 않는다 
 * - 프로그램 실행 도중 문제가 발생되므로 오류를 예측해서 조건문을 통해 처리해야한다 
 * - 보통 예측 가능한 범주에 속하므로 어느 정도 예측하여 처리하는 것이 가능하다
 * 
 * 
 * RuntimeException의 주요 후손들 
 * - ArrayIndexOutOfBoundsException : 배열의 접근에 잘못된 인덱스 값을 이용한 경우 
 * - NegativeArraySizeException : 배열의 사이즈를 음수로 지정한 경우 
 * - ArithmeticException : 0으로 나눈 경우 
 * - NullpointerException : 참조변수의 값이 null인데 주소접근연산자를 사용한 경우 
 * - ClassCastException : 잘못된 Cast 연산자를 사용한 경우 
 * - InputMismatchException : 잘못된 타입을 사용한 경우
 * 
 * @author user
 *
 */

public class D_UnCheckedException {

	public static void main(String[] args) {
		D_UnCheckedException d = new D_UnCheckedException();
//		d.method1();
//		d.method2();
		d.method3();
	}

//	public void method1() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해잉");
//		int num = scan.nextInt();
//	}

	public void method1() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("숫자를 입력해잉");
				int num = scan.nextInt();
				break;
				// scan.nextInt()에 숫자가 아니라 문자를 입력한 경우?
			} catch (InputMismatchException e) {
				String str = scan.next();
				System.out.println(str + " 은 입력불가");
			}
		}

		System.out.println("문자를 입력해잉");
		String str = scan.nextLine();
		String str2 = scan.nextLine(); // -> 한번 더 쓰면 입력 대기 하고있음.
		// nextInt()로 숫자를 받아올 경우 숫자가 가지고있던 엔터가 남아있음
		// nextLine()은 Enter값을 기준으로 메소드를 종료시키기 때문에
		// nextLine()가 실행될 때 남아있는 Enter값을 그대로 읽어서 바로 종료되는 것.

		// 그래서 보통 nextLine으로 입력값을 모두 받아올 경우에는
		// 나중에 Integer.parseInt로 int 값을 형변환해서 쓴다고 합네당
	}

	public void method2() {
		int i = 0;
		int j = 10;
		if (i == 0) {
			System.out.println("0으로는 나눌 수 없다");
			return;
		}

		int k = j / i;
	}

	public void method3() {
		int size = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("method3() -> 숫자를 입력해줘잉");
		size = scan.nextInt();

		// 배열의 사이즈를 음수로 지정했을 때
		// NegativeArraySizeException이 발생할 소지가 있으므로
		// 입력된 값이 음수인지 체크하여 설명 출력
//		if(size<0) {
//			System.out.println("음수는 입력할 수 없다.");
//			return;
//		}

		int[] arr = new int[size];
		// ArrayIndexOutOfBoundsException 발생 가능
		// 0 ~ n-1
		try {
			// 방번호는 0부터 시작하는데
			// 배열의 생성 길이 : size보다 1 작은 수까지 참조가 가능하다
			// 유효하지 않은 방번호에 접근하려고하면 오류 발생
			
			int num = arr[size];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 배열의 길이를 입력했다");
		}


	}

}
