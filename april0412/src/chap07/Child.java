package chap07;

public class Child extends Parent {
//	private int studentNo;	
//	
//	public Child(String name, int studentNo) {
//		super(name);
//		this.name = name;
//		this.studentNo = studentNo;
//	}
	
	public String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
	

}
