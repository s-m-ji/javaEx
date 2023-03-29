package march0329;

public class Application {
	public static void main(String[] args) {
		Animal[] ani = new Animal[5];
		
		// "집"이라는 값을 넣어도 상수=PLACE로 설정되어 "애견카페"가 나온다.
		Dog dog = new Dog("강아지", "종류", 20, "집");
		Cat cat = new Cat("고양이", "종류", "학원", "흰색");
		
		for(int i=0; i<5; i++) {
			int index = (int)(Math.random()*2);
			if(index == 0) {
				ani[i] = dog;
			} else if(index == 1) {
				ani[i] = cat;
			}
		}
		
		for(Animal a : ani) {
			a.speak();
		}
	}
}
