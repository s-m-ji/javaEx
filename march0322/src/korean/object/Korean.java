package korean.object;

public class Korean {
	// 필드 만듦
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 기본 생성자 만듦
	public Korean() {
		
	}
	
	public Korean(String n, String s) {
		// 필드 초기화
		name = n;
		ssn = s;
	}
}
