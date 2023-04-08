package com.kh.practice.model.vo;

public class Dog extends Animal {

	public static final String PLACE = "애견카페";
	private int weight;

	public Dog() {
		
	}
	
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}

//	@Override
//	public String toString() {
//		return super.toString()+" 몸무게는 "+weight+"kg 입니다.";
//	}
	
	@Override
	public void speak() {
		System.out.println(super.toString()+" 몸무게는 "+weight+"kg 입니다.");
		
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

}
