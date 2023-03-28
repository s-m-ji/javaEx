package sec03.exam02;

// 추상메소드를 하나라도 포함할 경우, 추상클래스가 되니께 abstract 꼭 !
public abstract class Animal {
	public String kind;
	
	public void breath() {
		System.out.println("습습-후후");
	}
	
	public void print(Animal animal) {
		System.out.println();
		System.out.println("print는 나야나 =====");
		animal.sound();
		System.out.println(animal.kind);
		System.out.println("===== print는 나야나");
	}
	
	// 미완성 메소드 (코드블럭이 없음)
	public abstract void sound();
}
