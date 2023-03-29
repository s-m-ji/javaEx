package sec01.exam01;

public class Application {
	public static void main(String[] args) {
		// 인터페이스는 생성할 수 없지만, 참조변수의 타입으로 사용해서 실체화 한다. 
		// -> 나를 구현하고있는 구현체에 타입으로 사용할 수 있다는 것.
		
		// 인터페이스의 다형성
		// 인터페이스의 구현체는 인터페이스를 타입으로 가질 수 있다
		
		// 인터페이스 변수 = new 구현객체;
		RemoteControl ad = new Audio();
//		System.out.println(RemoteControl.MAX_VOULUME);
		ad.turOn();
		ad.setVolume(5);
//		ad.turnOff();
		ad.setVolume(20);
		ad.turnOff();
		System.out.println("-----------------------------");
		
		RemoteControl tv = new Television();
		tv.turOn();
		tv.setVolume(2);
		tv.setVolume(-20);
		tv.turnOff();
		
		System.out.println("-----------------------------");
		
		// 상속단계에 있는 부모가 인터페이스르 구현하고 있는 경우
		// 인터페이스의 타입으로 생성이 가넝하당
		RemoteControl sm = new SmartTV();
		sm.turOn();
		tv.setVolume(3);
		tv.setVolume(-30);
		tv.turnOff();
		
		System.out.println("-----------------------------");
		
		Searchable sc = new SmartTV();
		Television tv2 = new SmartTV();
		
		sc.seach("www.naver.com");
	}
}








