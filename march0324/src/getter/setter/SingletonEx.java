package getter.setter;

public class SingletonEx {
	
	// new 생성자로 단 하나의 객체를 만듦 -> 현재 클래스 내부에서는 사용가능.
	// *** 자신의 타입인 정적 필드를 하나 선언하고
	// *** 자신의 개체를 생성해 초기화합니다.
	// *** 참고로 클래스 내부에서는 new 연산자로 생성자 호출이 가능합니다.
	private static SingletonEx singleton = new SingletonEx();
	
	
	// 1. private을 써서 외부에서 생성자를 이용하지 못하게 제한
	private SingletonEx() {
		
	}
	
	// 2. public을 써서 외부에서 접근할 수 있는 메소드를 만들고, 생성된 객체를 반환
	// 	- 생성을 할 수 없으므로 정적 메소드로 만들어야한다.
	// 	- 정적 필드에 자신을 생성하여 리턴해준다
	public static SingletonEx getInstance() {
		// 정적 메소드에서는 정적 필드만 사용이 가능하다.
		return singleton;
	}
}
