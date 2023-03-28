package sec02.exam03;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxrotation) {
		// 부모가 가진 생성자를 호출
		// 생성자를 만들면 기본생성자가 생성되지 않기에,,
		// +2를 추가하여 최대회전수 값을 증가시킴
		super(location, maxrotation +2);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean roll() {
		rotation++; // 타이어 1회전
		System.out.println("*** 금호타이어 " + location+ "누적회전수 : " +rotation);
		System.out.println("*** 금호타이어 " + location+ "최대회전수 : " +maxRotation);
		
		if(rotation >= maxRotation){
			return false; // 바퀴 교체 알림
			// 물론 리턴값 - if조건을 바꿔서 매치해도 같은 값은 나옴 !
			// false로 한 이유는 연습을 위해서라고 하심 ~~~ 
		}
		return true;
	}
}
