package sec01.verify.exam04;

public class Member {
	private String id;
	private String name;
	
	public static void main(String[] args) {
		Member member = new Member("blue", "이파란");
//		System.out.println(member);
		System.out.println(member.toString()); 
		// 참조변수 뒤에서 toString() 생략해도 같은 결과를 출력
		member.toString(); 
	}
	

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		// return id + ": " + name;
		return getId() + ": " +getName();
	}
}
