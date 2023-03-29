package march0329.ex02;

public class SoundableExample {
	
	private static void printSound(Soundable soundble) {
		System.out.println(soundble.sound());
	}
	
	public static void main(String[] args) {
		// 인터페이스(Soundable)의 구현체여야합네당
		printSound(new Cat());
		printSound(new Dog());
	}
}
	