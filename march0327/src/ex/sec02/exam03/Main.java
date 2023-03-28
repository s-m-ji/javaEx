package ex.sec02.exam03;

public class Main {

	public static void main(String[] args) {
		System.out.println("new Car 생성");
		Car car = 
				new Car(new Tire("오른쪽 앞", 1),  
						new Tire("왼쪽 앞", 2), 
						new Tire("오른쪽 뒤", 3), 
						new Tire("왼쪽 뒤", 4));
		
		System.out.println("car.run() 시작");
		for(int i=0; i<10; i++) {
			car.run();
			System.out.println("car.run() 종료");
			System.out.println();
		}
	}

}
