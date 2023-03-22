package korean.object;

public class koreanMain {

	public static void main(String[] args) {
		
		Korean kor = new Korean();
		kor.name = "이자바";
		kor.ssn = "000000-0000000";
		
		System.out.println("=== kor ===");
		System.out.println(kor.name);
		System.out.println(kor.ssn);
		
		// 객체 초기화
		Korean kim = new Korean("김자바", "123456-7890000");
		System.out.println(kim.name);
		System.out.println(kim.ssn);
		
		Korean park = new Korean("박자바", "098765-4321111");
		System.out.println(park.name);
		System.out.println(park.ssn);
	}

}
