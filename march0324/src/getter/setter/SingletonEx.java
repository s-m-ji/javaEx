package getter.setter;

public class SingletonEx {
	
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
