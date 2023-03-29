package com.kh.practice2.model.vo;

public class Dog extends Animal {
	public static final String PLACE = "애견카페";
	private int weight;
	
	public Dog() {
		
	}
	
	public Dog(String name, String kinds, int weight) {
		// 부모 필드가 private이라서 생성자로 호출하여 초기화 ~
		super(name, kinds);
//		this.weight = weight;
		setWeight(weight);
	}


	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	// 이건 getter 생성하지말자고하심.
//	public static String getPlace() {
//		return PLACE;
//	}
	

	@Override
	public void speak() {
		// 부모의 메소드를 호출 super.
		String str = super.toString();
		System.out.println(str+" 몸무게는 "+weight+"kg 입니다.");
//		System.out.println(toString()+" 몸무게는 "+weight+"kg 입니다.");
		
		// 만약 자식에 toString이라는 메소드가 또 있다면 super라고 표시해서
		// 부모메소드를 재정의한다는걸 명시합네당 후후
		
	}
	
	
}
