package sec01.exam04;

public class Application {
	public static void main(String[] args) {
		// Car car = new Car();
		// car.run();
		
		// 다형성, 메소드의 오버라이딩
		// 생성자의 매개변수 타입으로 인터페이스를 사용하고 있으므로
		// 인터페이스의 구현체를 매개변수로 넣어서 파라미터로 사용한다
		// 인터페이스의 구현체는 추상메소드를 모두 구현해야하며
		// 구현체가 구현한 메소드가 실행됨.
		Car khCar = new Car(new Kumho());
		khCar.run();
		Car hnCar = new Car(new Hankook());
		hnCar.run();
		
		System.out.println("--------------");
		
		Car khCar2 = new Car(new Hankook());
		khCar2.run();
		Car hnCar2 = new Car(new Kumho());
		hnCar2.run();
	}
	
	// 다형성 : 여러가지 타입을 가질 수 있는 성질
	// 1. 상속 : 자식클래스는 부모타입으로 선언할 수 있다.
	// 		    부모타입으로 자동형변환된다.
	// 2. 인터페이스 : 인터페이스의 구현체는 인터페이스 타입으로 선언할 수 있다.
	// 			인터페이스 타입으로 자동형변환된다.
}
