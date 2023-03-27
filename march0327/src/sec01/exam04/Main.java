package sec01.exam04;

public class Main {

	public static void main(String[] args) {
		// 부모타입으로 자식객체를 생성합니다.
		// 자동형변환 됩니다.
		Airplane airplane 
		= new SupersonicAirplane(SupersonicAirplane.SUPERSONIC);
		
		// 부모 타입으로 변환 시
		// 1. 부모가 가지고 있는 필드에만 접근이 가능해짐
		// airplane.flymode() / airplane.booster() -> 이제 이게 불가능해짐
		
		// 2. 재정의 메소드 호출 시 자식클래스에서 재정의한 메소드가 호출됨 -> 오버라이딩한 자식 메소드가 나옴
		System.out.println("재정의 메소드 호출");
		airplane.fly();
	
		// 자식 타입으로 형변환 -> 명시적, 강제형변환
		SupersonicAirplane supersonic = (SupersonicAirplane)airplane;
		
		// 변환 시, 기존의 자식 클래스가 갖고있던 필드, 메소드 사용 가능.
		System.out.println("===== 자식타입으로 강제형변환 ===== ");
		supersonic.booster();
		System.out.println(supersonic.flymode);
	}

}
