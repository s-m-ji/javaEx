package sec03.exam01;

// 추상 클래스가 되었읍네당
public abstract class Phone {
	// 필드 ---------------
	public String owner;
	
	// 생성자 ---------------
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메소드 ---------------
	// 추상 메소드: 코드블럭 미완성 
	public void turnOn() {
		System.out.println("켭니다 전원을.");
	};
	
	// 하위클래스에게 작성을 강제한다
	// 미완성된 메소드는 구현을 완료해야 일반클래스로 작성이 가능해진다.
	public abstract void turnOff();
	
}
