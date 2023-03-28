package sec03.exam02;

public class Cat extends Animal{

	public Cat() {
		this.kind = "포유류";
	}
	
	@Override // 메소드 재정의
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("냥냥");
	}
	
}
