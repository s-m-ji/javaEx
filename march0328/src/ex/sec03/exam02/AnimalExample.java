package ex.sec03.exam02;

public class AnimalExample {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.sound();
		c.sound();
		System.out.println("------------------------");
		
		Animal a = null;
		a = new Dog();
		a.sound();
		a = new Cat();
		a.sound();
		System.out.println("------------------------");
		
//		anSound(new Dog());
		anSound(new Cat());
	}

	private static void anSound(Animal ani) {
		ani.sound();
	}
}
