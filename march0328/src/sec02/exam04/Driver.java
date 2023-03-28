package sec02.exam04;

public class Driver {
	void drive(Vehicle vehicle) {
		// Vehicle을 상속받아서 구현된 객체가 매개변수로 입력된 경우
		// 부모 타입으로 자동형변환 된 경우
		// => 그럴 때만 강제 형변환을 할 수 있다.
		
		// Bus bus =(Bus)vehicle; 
		// -> vehicle을 Bus타입으로 캐스팅할 수 없음...
		
		// instanceof
		// boolean result = 생성된 인스턴스(객체) instanceof 타입
		// 나의 원래 생성된 타
		// 만약 vehicle의 원래 타입이 Bus가 맞다면
		
		// new 연산자에 의해서 원래 생성된 타입을 확인
		// 부모타입이 자식타입으로 강제 캐스팅 될 경우 오류가 발생
		Vehicle v = new Bus();
		System.out.println("v.run()");
		v.run();
		Vehicle v2 = new Vehicle();
		System.out.println("v2.run()");
		v2.run();
		
		System.out.println("if문");
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			System.out.println("Bus 타입으로 변환 성공");
		} else {
			System.out.println("Bus 타입으로 변환 실패");
		}
		System.out.println("vehicle.run()");
		vehicle.run();
	}
}
