package ex.sec03.exam01;

public class Smartphone extends Phone {

	public Smartphone(String user) {
		super(user);
	}
		
	@Override
	public void turnOn() {
		System.out.println("스마트폰 전원 켜기");
	}
	
	@Override
	public void turnOff() {
		System.out.println("스마트폰 전원 끄기");
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색 하기");
	}
}
