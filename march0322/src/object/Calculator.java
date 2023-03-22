package object;

public class Calculator {
	// 필드
	// String name;
	// 접근제한자 생략 가능:따로 붙이지 않으면 해당 패키지 내에서 접근할 수 있는 default로 설정됨.
	
	// 캡슐화
	// 해당 클래스 내에서만 접근 가능하도록 제한
	private String name;
	
	
	// 생성자의 특징 2가지
	// 1. 클래스명과 동일한 이름
	// 2. 반환 타입이 없음	
	// 생성자 : new 연산자를 만나서 객체가 생성될 때 실행됨
	// -> 현재 클래스에서는 메인메소드가 없기 때문에 Run 할 수 없음
	public Calculator() {
		name = "정수 계산기";
		// 생성자는 초기화를 함
		System.out.println("Calculator() 생성자를 실행합니다.");
		System.out.println(name);
	}
	// -> 생성자가 없을 경우에 컴파일러는 기본 생성자를 만들어줌
	// -> 직접 생성했을 경우 컴파일러는 기본 생성자를 만들지 않음
	
	// 메소드를 만드는 방법
	// 접근제한자 반환타입 메소드명 (매개변수타입 매개변수명){}
	// 두개의 정수를 입력 받아서 두 수의 합을 반환하고자 할 때
	
	/**
	 * 두개의 정수를 입력 받아서 두 수의 합을 반환합니다.
	 * @param x
	 * @param y
	 * @return x + y
	 */
	
	public int add(int x, int y) {
		return x + y;
	}
}
