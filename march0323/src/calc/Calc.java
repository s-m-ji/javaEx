package calc;

public class Calc {
	public static void main(String[] args) {
		System.out.println("객체 생성"); // 첫번째
		Calc calc = new Calc();
		calc.execute();
		
	}
	
	public void execute() {
		System.out.println("execute 시작");
		double result = avg(7,10);
		System.out.println("실행 결과: "+result); // 마지막
	}

	// private은 클래스 내부에서만 접근 가능함 
	// => 내부에서 메소드를 호출할 용도이므로 private으로 자동 생성됨
	private double avg(int i, int j) {
		System.out.println("avg 시작");
		int sum = plus(i, j);
		System.out.println("avg 실행"); // 세번째
		return sum/2.0; // 평균값을 실수로 구하기 위함
	}

	private int plus(int i, int j) {
		System.out.println("plus 시작");
		System.out.println("plus 실행"); // 두번째
		return i+j;
	}
}
