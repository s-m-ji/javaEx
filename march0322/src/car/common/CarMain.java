package car.common;

public class CarMain {

	public static void main(String[] args) {
		
		// 생성자를 호출 시,매개변수 타입에 맞춰 순서대로 입력해야함
		
		Car car = new Car();
		System.out.println("============================");
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.maxSpeed);

		Car car2 = new Car("그랜저");
		System.out.println(car2.model);
		Car car3 = new Car("레이", 0);
		System.out.printf("%s %d\n", car3.model, car3.maxSpeed);
		Car car4 = new Car("SM5","Black", 0);
		System.out.printf("%s %s %d\n", car4.model, car4.color, car4.maxSpeed);
		Car car5 = new Car("소나타", "White");
		System.out.printf("%s %s\n", car5.model, car5.color);
				
	}

}
