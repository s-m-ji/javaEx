package ex.sec03.exam01;

public abstract class Phone {
	public String user;

	public Phone(String user) {
		this.user = user;
	}
	
	public void turnOn() {
		System.out.println("전원 켜기");
	}

	public void turnOff() {
		System.out.println("전원 끄기");
	}
	
}
