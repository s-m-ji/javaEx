package getter.setter;

public class Person {
	
	// 이렇게 상수를 정의해서 사용할 수 있음요우
	static final double PI = 3.141592;
	static final double EARTH_RADIUS = 6400;
	
	// 상수 : 한번 값이 정해지고나면 수정이 불가능
	// 명시된 접.제가 없으니 default, 그래서 같은 패키지 내에서만 사용 가넝 ~~
	final String NATION = "korea";
	final String SSN;
	String name;
	
	public Person(String ssn, String name) {
		this.SSN = ssn;
		this.name = name;
		
		// final String SSN이라서 값을 변경하려고하니 오류
		// this.SSN = "123456-7890123";
		this.name = "강민지";
	}
}
