package getter.setter;

public class Car {
	
	private int speed;
	public int getSpeed() {
		// 필드값을 반환
		return speed;
	}
	public void setSpeed(int speed) {
		// 필드값을 변경
		// 유효하지 않은 값이 있으면 검증 후 값을 변경할 수 있도록 설정
		if(speed>0) {
			this.speed = speed;
		} else {
			this.speed = 0;
		}
	}
	// is로 시작하면 리턴 타입이 boolean 경우가 多
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		
		if(stop) {
			this.setSpeed(0);
		}
		this.stop = stop;
	}
	private boolean stop;
	
}
