package sec03.exam01;

public class Smartphone extends Phone {

	public Smartphone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	// 추상 메소드를 구현해야지만 일반 클래스가 될 수 있다...
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("전원을 켭니다.");
	}

	// 상속받은 추상메소드를 모두 구현 : {} 코드블럭을 완성
	// 부모로부터 강제로 구현을 위임받는다
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("전원을 끕니다.");
	}

	public void internetSearch() {
		
	}
}
