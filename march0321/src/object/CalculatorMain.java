package object;

public class CalculatorMain {
	public static void main(String[] args) {
		// 타입     변수명 = new 메소드명();
		Calculator calc = new Calculator();
		int sum = calc.add(3, 5);
		System.out.println("두 수의 합은 " + sum);
		
		Calculator02 calc02 = new Calculator02();
		int sum02 = calc02.subt(5, 1);
		System.out.println("두 수의 차는 " + sum02);
		
		Calculator03 calc03 = new Calculator03();
		int sum03 = calc03.multi(4,5);
		System.out.println("두 수의 곱은 " + sum03);
		
		Calculator04 calc04 = new Calculator04();
		int sum04 = calc04.divi(30, 10);
		System.out.println("두 수의 나누기는" + sum04);
		
		
	}
}
