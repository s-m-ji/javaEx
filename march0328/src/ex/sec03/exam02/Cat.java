package ex.sec03.exam02;

public class Cat extends Animal {

	public Cat() {
		this.kind = "고양이과";
	}
	
	@Override
	public void sound() {
		System.out.println("미야옹");
		
	}

}
