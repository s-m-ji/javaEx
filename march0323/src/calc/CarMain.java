package calc;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car(10);
		
//		car.run();
//		
//		// 리턴타입이 boolean이므로 if문의 조건으로 입력 가능
//		if(car.isLeftGas()) {
//			System.out.println("남은 기름양: " + car.gas);
//		} else {
//			System.out.println("주유해줘잉");
//		}
		
		car.run2();
		// 1개의 메소드만 호출했지만 이미 호출된 다른 메소드까지 같이 실행됨
	}

}
