package getter.setter;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		// speed는 private이라 여기서는 해당 필드에 직접 접근할 수 없으므로
		// setter 메소드를 이용해서 필드값을 변경시켜줄 수 있다
		car.setSpeed(-50); // 유효하지 않은 값이므로 0으로 설정되어 나옴 
		System.out.println("현재 속도는: " +car.getSpeed());
		
		car.setSpeed(50); // 입력한 값이 유효하다면 그대로 나옴
		System.out.println("현재 속도는: " +car.getSpeed());

		car.setStop(true); // 차를 멈추면 속도는 0이 됨
		System.out.println("현재 속도는: " +car.getSpeed());
	}

}
