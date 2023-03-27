package sec01.exam04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane s 
		= new SupersonicAirplane(SupersonicAirplane.NORMAL);
		
		// 이륙합니다.
		s.takeOff();
		s.fly();
	
		// 1이나 2를 넣어줄 수도 있지만, 
		// 만들어 놓은 상수를 활용하여 가독성을 높일 수 있다.
		// s.flymode = 2;
		s.flymode = SupersonicAirplane.SUPERSONIC;
		s.fly();

		// s.flymode = 1;
		s.flymode = SupersonicAirplane.NORMAL;
		s.fly();
		
		// 착륙합니다.
		s.land();
	}

	
	public SupersonicAirplaneExample() {
		
	}
	
}
