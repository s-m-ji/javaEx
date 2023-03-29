package sec01.exam04;

public class Car {
	// 인터페이스는 객체를 생성할 수 없음요우
	// Tire tire = new Tire();
	// 인터페이스의 구현체인 경우, 인터페이스를 참조변수의 타입으로 사용할 수 있다.
	// Tire tire = new Hankook();
	
	Tire tire;
	// 이렇게 직접 넣어주면 결합이 강하기 때문에
	// 생성자를 활용
	
	public Car(Tire tire) {
		this.tire = tire;
	}
	
	public void run () {
		tire.roll();
	}
}
