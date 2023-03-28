package sec03.exam01;

//추상메소드가 1개라도 포함되어있으면 그 클래스는 추상클래스가 된다.
//추상메소드가 없어도 abstract 키워드를 선언하므로써 추상클래스가 될 수 있다.
//추상클래스는 선언만 가능하며 생성이 불가능하다
// new 연산자를 이용해서 객체를 만들지 못한다

//abstract : 추상메소드
	// 선언부밖에 없음 실행할 수 있는 {} 코드블럭이 없는 형태임.
	// -> 미완성된 코드로 이루어진 메소드만 정의되어있으므로 클래스 생성 불가
	// 상속을 통해 자식클래스에서 메소드를 구현하므로써 다형성은 구현이 된다.
	// 자식 객체가 생성될 때 super(); 이용해야하므로 생성자 꼭 필요.
	// public abstract void sound();
	
	// 하위클래스 접근제한자는 public, protected만 가능함
public class Application {
	public static void main(String[] args) {
		// 추상클래스는 그 자자체로 생성할 수 없다.
		// 미완성된 메소드를 포함하고 있을 수도 있기에.
		// Phone phone= new Phone();
	
		// 추상클래스를 상속받아 추상메소드를 모두 구현하면 일반클래스로 생성가능
		Smartphone sp = new Smartphone("owner");
		
		// 참조형 변수의 타입으로 사용이 가능하다.
		// -> 다형성을 활용할 수 있다.
		
		Phone phone = new Smartphone("owner2");
		sp.turnOn();
		sp.internetSearch();
		sp.turnOn();
	
	}
}
