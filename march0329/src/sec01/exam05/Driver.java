package sec01.exam05;

public class Driver {
	public static void main(String[] args) {
		Driver dv = new Driver();
		// 인터페이스의 구현체를 생성하여 매개변수에 넣어줌
		dv.drive(new Bus());
	}
	
	public void drive(Vehicle vehicle) {
		vehicle.run();
		// 원래타입으로 강제형변환
		Bus bs = (Bus)vehicle;
		bs.checkFare();
	}
	
}
