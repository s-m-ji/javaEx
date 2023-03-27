package ex.sec01.exam04;

public class SupersonicAirplane extends Airplane{
	public int flyMode;
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public SupersonicAirplane(int flyMode) {
		if(flyMode == NORMAL || flyMode == SUPERSONIC) {
			this.flyMode = flyMode;
		} else {
			flyMode = NORMAL;
		}
	}
	
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행");
		} else {
			super.fly();
		}
	}
	
	
}
