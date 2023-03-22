package object;

public class CalculatorMain {
	public static void main(String[] args) {
		// Calculator 객체 생성 후 주소값을 반환
		Calculator calc = new Calculator();
		
		// 이렇게 바로 출력해주거나
		System.out.println(calc.add(4, 5));

		// 재사용이 필요한 경우 변수에 담아서 출력할 수 있음
		int sum = calc.add(5, 7);
		System.out.println(sum);
		
		// 만약 접근제한자가 private이라면 현재 클랫에서는 name을 쓸 수 없기에 오류 발생함
//		System.out.println(calc.name);
//		calc.name = "실수 계산기";
//		System.out.println(calc.name);
	}
}
