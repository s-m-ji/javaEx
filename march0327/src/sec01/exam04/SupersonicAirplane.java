package sec01.exam04;

// 상속받을때 사용하는 키워드 -> extends + 부모클래스명
public class SupersonicAirplane extends Airplane {
	
	// 비행 상태
	public int flymode;

	// 상수 -> 한번 정의 후 값을 변경할 수 없
	// 대문자로 작성하고 단어를 연결할 경우 _를 붙여준다.
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	// 매개변수를 받아서 flymode를 세팅
	public SupersonicAirplane(int flymode) {
		if(flymode == NORMAL || flymode == SUPERSONIC) {
			this.flymode = flymode;
		} else {
			flymode = NORMAL;
		}
	}
	
	@Override
	public void fly() {
		// 부모가 가지고있는 메소드를 자식클래스에서 재정의
		// 메소드를 재정의해도 기존에 부모가 가진 메소드를 호출할 수 있다.
		// super.메소드명(); 현재 자동으로 호출되고있음.
		
		System.out.println("=========== 자식 생성합니다.");
		if(flymode == SUPERSONIC){
			System.out.println("초음속비행입니다.");
		} else {
			// fly()를 재작성했지만
			// 부모가 가지고있는 메소드를 호출
			// super를 이용해서 접근
			super.fly();
		}
	}

	// ==========================================
	// 자식 클래스만 가지고 있는 친구
	public void booster() {
		System.out.println("부스터 작동 ~~~ ");
		
		
		
		
		
	}
	
	
}
