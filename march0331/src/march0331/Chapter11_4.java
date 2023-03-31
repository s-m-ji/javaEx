package march0331;

public class Chapter11_4 {
	private String id;
	private String name;

	public Chapter11_4(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + ": " + name;
	}
	
	public static void main(String[] args) {
		Chapter11_4 ex = new Chapter11_4("blue", "이파란");
		System.out.println(ex);
	}
}
