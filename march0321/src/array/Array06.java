package array;

public class Array06 {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("값의 수가 부족함");
			System.exit(0);
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int result = num1+num2;
		System.out.println(result);
		
		// run configuration으로 값을 직접 입력해보면 알 수 있음 
		// 예시: 10 + 20 = 30
		
			
	}

}
