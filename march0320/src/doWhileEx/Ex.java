
package doWhileEx;

public class Ex {

	public static void main(String[] args) {
		/*
		int x;
		do {
			System.out.println("Hi");
			for (x = 1; x < 5; x++) {
				System.out.println(x);
				System.out.println("Bye");
//				x++; 
			}
		} while(false);
		*/
		/*
		int i = 10;
		while(i<0) {
			System.out.println("0보다 작다.");
		} // 조건이 false라서 실행되지 않음
		
		do {
			System.out.println("do-while문");
			System.out.println("조건이 참일때까지 반복");
		} while (i<0); 
		// 조건이 false임에도 무조건 최초 1회 실행 
		 */
		
		int sum = 0;
		for (int i = 1; i<=10; i++) {
//			System.out.println(i);
			if(i%2==1) {
				continue;
			}
			System.out.println(i);
			sum += i; 
		}
		System.out.println(sum);
	}
	
	

}
