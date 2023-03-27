package sec01.exam05;

public class Main {

	public static void main(String[] args) {
		// 자식클래스는 부모타입으로 자동 형 변환 할 수 있다.
		Cat cat = new Cat();
		
		// 1. 
		Animal animal = cat;
		
		// 2.
		Animal animal2 = new Cat();
		
		// 모든 객체를 최상위 객체인 Object를 상속받기 때문에
		// 모든 객체는 object로 형 변환 할 수 있다.
		Object object = animal;
	}

}
