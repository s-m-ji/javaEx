package practice;

public class Ex {
	String name;
	String id;
	String password;
	int age;
	
	public Ex(String name) {
		this(name, "아이디", "패스워드", 20);
	}
	
	public Ex(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	
}
