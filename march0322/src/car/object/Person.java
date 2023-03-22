package car.object;

public class Person {
	public static void main(String[] args) {
		
		// 필드에 접근하기 위해서는 객체가 생성되어있어야 한다
		
		/*
		Car car = new Car();
		Car car2 = new Car("기아 자동차");
		
		System.out.println("car.company " + car.company);
		System.out.println("car2.company " + car2.company);
		
		System.out.println("car " + car);
		System.out.println("car2 " + car2);
		
		car.speedUp();
		System.out.println("car.speed " + car.speed);
		*/
		
		Car car = new Car();
		System.out.println("초기 company: " + car.company);
		
		car.company = "르노 삼성";		
		System.out.println("수정 company: " + car.company);
		System.out.println("speed: " + car.speed); // 기본 상태
		car.speedUp();
		System.out.println("speed: " + car.speed); // car.speedUp(); 메소드를 실행한 후 상태
		car.speed = 100;
		System.out.println("speed: " + car.speed); // car.speed = 100; 필드에 값을 넣은 상태
		
		// System.out.println(car.speedUp()); // 반환이 없는데 (void인데) 출력하려고 하면 오류
	}
}
