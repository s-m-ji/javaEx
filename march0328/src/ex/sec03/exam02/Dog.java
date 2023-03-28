package ex.sec03.exam02;

public class Dog extends Animal {
	public Dog() {
		this.kind = "개과";
	}

	@Override
	public void sound() {
		System.out.println("왈왈왈");
		
	}
	
}
