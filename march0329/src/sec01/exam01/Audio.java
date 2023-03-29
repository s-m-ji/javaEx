package sec01.exam01;

// implements 인터페이스 사용을 위한 키워드
// 여러개의 인터페이스를 구현할 수 있다.
// -> , 로 구분해서 기입해줌
// 인터페이스들에 선언된 추상메소드를 모두 구현해야함
// -> 미구현 추상메소드가 남아있다면 추상클래스가 되어버림 ~
public class Audio implements RemoteControl, Searchable {
	private int volume;
	
	// RemoteControl 인터페이스의 메소드 ============================
	@Override
	public void turOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume; // 혹시 여기에 this.volume을 안 쓸거면
		System.out.println("음량을 "+this.volume+"(으)로 설정합니다.");
		if(volume > MAX_VOULUME) {
			System.out.println("*** "+volume+"(으)로는 설정 불가");
			System.out.println("최대음량 "+MAX_VOULUME+"(으)로 설정합니다.");
			this.volume = MAX_VOULUME;
		} else if(volume < MIN_VOULUME ) {
			this.volume = MIN_VOULUME;
		} // else { this.volume = volume;} 이렇게 셋팅해줘도 된다.
		
	}

	// Searchable 인터페이스의 메소드 ============================
	@Override
	public void seach(String url) {
		// TODO Auto-generated method stub
		
	}

}
