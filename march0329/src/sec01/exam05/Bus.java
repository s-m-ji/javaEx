package sec01.exam05;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가유");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 확인해유");
	}
}
