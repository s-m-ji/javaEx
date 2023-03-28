package sec02.exam04;

public class Main {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		// 차량이 달립니다.
		System.out.println("=== new Vehicle ====");
		driver.drive(new Vehicle());
		
		// bus가 Vehicle을 상속받아서 구현되었으므로 Vehicle로 자동형변환 될 수 있다.
		// 부모의 메소드가 오버라이딩(재작성) 된 경우 자식의 메소드를 호출한다.
		// 매개값으로 어떤 자식의 객체가 제공되는가에 따라 메소드 실행 결과가 다양해짐
		System.out.println("===== new Bus =====");
		driver.drive(new Bus());
		
		// Vehicle 타입을 상속받아서 구현된 클래스만 형변환이 가능하다.
		// driver.drive(new Taxi());
		
	}

}
