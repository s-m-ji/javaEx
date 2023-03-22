package car.object;

public class MemberExample {

	public static void main(String[] args) {
		Member mem = new Member();
		
		System.out.println(mem.name);
		System.out.println(mem.age);
		
		mem.name = "최하얀";
		mem.age = 23;
		
		System.out.println(mem.name);
		System.out.println(mem.age);
	}

}
