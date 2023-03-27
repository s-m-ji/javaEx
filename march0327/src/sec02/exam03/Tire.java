package sec02.exam03;

public class Tire {
	// 최대회전수
	public int maxRotation;
	
	// 누적회전수
	public int rotation;
	
	// 타이어의 위치
	public String location;
	
	public Tire(String location, int maxrotation) {
		// 필드를 초기화
		this.location = location;
		this.maxRotation = maxrotation;
	}
	
	/**
	 * 타이어 1회전 - rotation +1
	 * 1번 실행할 때마다 누적회전수가 증가합니다.
	 * 만약 maxRotation(최대회전수)보다 크면 false를 리턴합니다.
	 * @return
	 */
	public boolean roll() {
		rotation++; // 타이어 1회전
		if(rotation>maxRotation){
			return false; // 바퀴 교체 알림
		}
		return true;
	}
	
}
