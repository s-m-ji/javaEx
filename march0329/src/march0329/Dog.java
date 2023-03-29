package march0329;

public class Dog extends Animal {

	public static final String PLACE = "애견카페";
	private int weight;

	public Dog() {
		
	}
	
	public Dog(String name, String kinds, int weight, String PLACE) {
		super(name, kinds);
		setWeight(weight);
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public static String getPlace() {
		return PLACE;
	}

	@Override
	public void speak() {
		System.out.println(super.toString() 
				+ PLACE + "에 서식하며 "
				+ "몸무게는 " + weight + "kg 입니다.");
	}
	
	
	
	
}
