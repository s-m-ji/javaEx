package sec01.exam02;

import sec01.exam01.Audio;

public class Application {
	public static void main(String[] args) {
		// 기본생성자를 이용하여 객체를 생성 후
		// 참조타입 변순에 저장
		MyClass my = new MyClass();
		
		// 1-1. 인터페이스가 필드에 사용된 경우
		// my의 필드에 접근하여 메소드 호출(SmartTV로 생성되어있음)
		// my.turnOn(); 이렇게는 쓸 수 없음 ! rc를 통해야함. 
		my.rc.turOn();
		my.rc.setVolume(15);
		my.rc.turnOff();
		
		// 1-2. 필드에 새로운 객체를 생성하여 저장
		System.out.println("-----------------");
		my.rc = new Audio();
		my.rc.turOn();
		my.rc.setVolume(15);
		my.rc.turnOff();
		
		// 2. 인터페이스가 생성자의 매개변수로 이용된 경우
		// 인터페이스의 구현체를 생성하여 매개변수로 전달
		System.out.println("-----------------");
		MyClass my2 = new MyClass(new Audio());
		my2.rc.turOn();
		my2.rc.setVolume(5);
		my2.rc.turnOff();
		
		// 3. 인터페이스가 메소드의 매개변수로 이용된 경우
		// 기본생성자로 생성하면 rc는 SmartTV로 생성된다.
		// rc = new SmartTV();
		// 필드의 선언부에서 생성하고 있다.
		System.out.println("-----------------");
		MyClass my3 = new MyClass();
		// 인터페이스가 메소드의 매개변수 타입으로 사용될 경우
		// 메소드 호출 시에 구현 객체를 매개값으로 대입한다
		my3.methodB(new Audio());
		my3.rc.turOn();
		my3.rc.setVolume(7);
		my3.rc.turnOff();
		
		// 4. 메소드에 선언된 로컬변수를 rc에 저장함
		System.out.println("-----------------");
		MyClass my4 = new MyClass();
		// 처음에는 SmartTV였으나 Audio로 바뀜
		my4.methodA();
		my4.methodB(new Audio());
		my2.rc.turOn();
		my3.rc.setVolume(6);
		my4.rc.turnOff();
		
		
		
	}
}
