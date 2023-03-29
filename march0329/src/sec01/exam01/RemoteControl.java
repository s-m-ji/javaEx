package sec01.exam01;

public interface RemoteControl {
	// 생성자, 인스턴스 필드 가질 수 없음
	// 상수, 추상메소드는 사용 가능
	
	// 상수(정적멤버) static final을 자동으로 붙여주었음
	public int MAX_VOULUME = 10;
	public int MIN_VOULUME = 0;
	
	// 추상메소드는 abstract를 자동으로 붙여주었음
	// 자바ver11부터는 추상메소드 뿐 아니라 static 메소드 등등 다른 것도 쓸 수 있게 되었다고합네당
	void turOn();
	void turnOff();
	void setVolume(int volume);
}
