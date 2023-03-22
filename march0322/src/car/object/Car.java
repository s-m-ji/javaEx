package car.object;

public class Car {
	// 필드 ===========
	// 초기값이 지정되지 않으면 기본 초기값이 들어감
	// 아래와 같이 초기값을 임의로 설정해줄 수 있음
	String company = "현대 자동차";
	String model = "그랜저";
	int speed;
	boolean engineStrat;
	
	// 생성자 ===========
	// 필드명과 매개변수명이 같을 경우 지역변수인 매개변수가 우선됨
	// 결과적으로 블록 내부에서 company값은 매개변수의 값을 가리키고 있음
	// this : 지금 생성된 객체를 의미
	public Car(String company) {
		this.company = company;
	}
	
	
	// Create constructor 'Car()' : 기본 생성자(매개변수가 없는 생성자)를 만듦
	// 생성자를 만들지 않으면 컴파일러가 자동으로 만들어주는 생성자
	// 생성자를 1개라도 직접 만들면 자동으로 만들어주지 않음
	public Car() {
		// TODO Auto-generated constructor stub
	}

	// 메소드 ===========
	public void speedUp() {
		speed += 10;
	}
}
