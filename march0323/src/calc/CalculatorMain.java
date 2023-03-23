package calc;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.powerOnOff();
		System.out.println(calc.add(1, 2));
		calc.powerOnOff();
		System.out.println(calc.add(3, 5));
	

	// 배열을 생성 후 메소드의 파라미터로 전달
	int[] numbers = {1,2,3,4,5};
	
	calc.add(numbers);
	
	
	System.out.println("calc.add(numbers): " + calc.add(numbers));
	
	// 메소드를 실행할 때 배열을 생성
	calc.add(new int[] {1,2,3});
	System.out.println("calc.add(new int[] {1,2,3}): " + calc.add(new int[] {1,2,3}));
	
	System.out.println("calc.addFn: " + calc.addFn(1,2,3,4,5,6,7));
	
	// 어흑마이깟 메인메소드 밖에서는 실행되지않으므로 기입 시 유의... 따흐흑
	
	}
}
