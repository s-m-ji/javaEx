package sec01.exam04;

// final 키워드 : 부모클래스가 될 수 없음
// public final class Airplane {
	public class Airplane {
	public Airplane() {
		System.out.println("=========== 부모 생성합니다.");	
	}
	
	public void land() {
		System.out.println("착륙합니다.");
	}
	
// final은 메소드에 붙어도 메소드를 재정의할 수 없음.	
// public final void fly() {
	public void fly() {
		System.out.println("일반비행입니다.");
		
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
}
