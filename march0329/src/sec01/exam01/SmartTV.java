package sec01.exam01;

public class SmartTV extends Television implements Searchable {
	
	@Override
	public void turOn() {
		// TODO Auto-generated method stub
		System.out.println("SmartTV를 켭니다.");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("SmartTV를 끕니다.");

	}
	
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		this.volume = volume;
		System.out.println("음량을 " +this.volume+"으로 설정합니다.");
		if(volume > MAX_VOULUME) {
			this.volume = MAX_VOULUME;
		} else if(volume < MIN_VOULUME) {
			this.volume = MIN_VOULUME;
			// 아래에 this.volume라고 설정하면 초기값 0으로 나온다.
			System.out.println("*** "+volume+"으로는 설정할 수 없습니다.");
			// 아래에 그냥 volume를 넣으면 MIN_VOLUME가 나오지 않고 매개변수 int volume가 나온다.
			System.out.println("최소음량 " +this.volume+"으로 설정합니다.");
		}
 	}

	@Override
	public void seach(String url) {
		System.out.println(url + " 을 검색합니다.");
		
	}
}
