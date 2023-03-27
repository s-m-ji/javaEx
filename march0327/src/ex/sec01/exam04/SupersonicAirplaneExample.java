package ex.sec01.exam04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane supersonic 
		= new SupersonicAirplane(SupersonicAirplane.NORMAL);
		
		Airplane airplane 
		= new SupersonicAirplane(SupersonicAirplane.SUPERSONIC);
		
		supersonic.takeOff();
		supersonic.fly();
		supersonic.flyMode = SupersonicAirplane.SUPERSONIC;
		supersonic.fly();
		supersonic.land();
		
		airplane.fly();
		SupersonicAirplane sss = (SupersonicAirplane) airplane;
		// airplane.flyMode를 쓸 수 없는 이유는..... ????? 어흑마이깟
		airplane.fly();

	}
	
	public SupersonicAirplaneExample(){
		
	}

}
