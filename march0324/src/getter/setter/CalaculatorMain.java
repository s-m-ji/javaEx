package getter.setter;

public class CalaculatorMain {

	public static void main(String[] args) {
		// 정적 멤버 (필드,메소드)는 인스턴스 멤버와 다르게 new 연산자로 생성하지 않아도
		// 바로 가져다가 쓸 수 있다.
		double result = 10 * 10 * Calculator.pi;
		int plus = Calculator.plus(5, 5);
	}

}
