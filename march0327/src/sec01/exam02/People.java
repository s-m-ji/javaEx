package sec01.exam02;

public class People {
	public String name;
	public String ssn;

	public People(String name, String ssn) {
		// super(); -> 이 친구가 바로 부모 생성자를 호출(필요없으면 명시 생략 가능)
		this.name = name;
		this.ssn = ssn;
	}
	
}
