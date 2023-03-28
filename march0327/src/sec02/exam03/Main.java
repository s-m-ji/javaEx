package sec02.exam03;

public class Main {

	public static void main(String[] args) {
		// 자동차 객체를 생성합니다.
		
		// 1. 기본 생성자가 있을 경우
		// Car car = new Car();
		
		// 2. 매개변수가 있는 생성자로 했을 경우
		Car car = new Car(new Tire("FR", 3), new KumhoTire("FL", 3), new Tire("BR", 3), new KumhoTire("BR", 3));
		
		// car.run을 10번 실행
		for(int i=0; i<10; i++) {
			// 자동차가 달려갑네당
			// 1.
			// car.run();
			
			// 2.
			int res = car.run();
			if(res > 0) {
				car.changeTire(res);
			}
		}
	}

}
