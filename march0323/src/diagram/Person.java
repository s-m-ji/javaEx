package diagram;

public class Person {
	protected String name;
	public int age;
	public double height;
	public double weight;
	
	// 기본생성자: 초기화를 담당
	// ※ 생성자는 메인메소드에서 객체가 생성될 때 실행됩니다.
	public Person() {
		// 다른 생성자를 호출
		// 초기값을 직접 입력
		// 매개변수의 타입과 갯수가 일치해야 메소드에서 불러올 수 있음.
		// 호출 시에는 필드값을 바로 넣을 수 없음. 매개변수로 넘어온 값만 사용할 수 있음
		// 자기 자신과 동일한 매개변수 형태로는 호출할 수 없음. 의미없기 때문에?
		this("이름", 20, 160.5, 60.1);
	}
	
	public Person(String name, int age, double height, double weight) {
		// 초기화
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	/**
	 * 이름과 나이를 반환
	 * @return 이름, 나이
	 */
	
	// 접근제한자 리턴타입 메소드명(매개변수타입 매개변수명){}
	public String information() {
		return name + ", " + age + ", " + height + ", " + weight;
	}

}
