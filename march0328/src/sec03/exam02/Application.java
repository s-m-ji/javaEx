package sec03.exam02;

public class Application {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		// 부모타입으로 형변환이 가능.
		// 생성은 할 수 없으나 변수의 타입으로 사용가능.
		cat.sound();
		dog.sound();
		
		cat.print(cat);
		dog.print(dog);
	}
}
