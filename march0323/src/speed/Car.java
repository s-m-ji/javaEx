package speed;

public class Car {
	// ※ 우선 모든 접근제한자는 public으로 설정하여 진행
	
	// 필드 : 속성을 정의
	public int speed;
	

	// 생성자 : new 연산자에 의해 객체를 생성할 때 호출
	public Car() {
		
	}

	public Car(int speed) {
		this.speed = speed;
	}
	
	
	// 메소드 : 기능을 정의
	public int getSpeed() {
		return speed;
	}
	
	public void keyTurnOnOP() {
		System.out.println("시동걸어유후");
	}
	
	public void run() { 
		// 속도를 10씩 증가시키면서 50까지 속도를 출력
		for(int i=0; i<=50; i=i+10) {
			System.out.println(i);
			speed = i; // 필드에 값을 설정함
			System.out.printf("시속: %dkm/h\n", speed);
		}
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.keyTurnOnOP();
		car.run();
		int speed = car.getSpeed();
		System.out.printf("현재 속도는: %dkm/h\n", speed);
		}
}
