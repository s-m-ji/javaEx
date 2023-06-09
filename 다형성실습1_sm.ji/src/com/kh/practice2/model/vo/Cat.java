package com.kh.practice2.model.vo;

public class Cat extends Animal {
	private String location;
	private String color;
	
	public Cat() {
		
	}
	
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
//		this.location = location;
//		this.color = color;
		setLocation(location);
		setColor(color);
	}
	
	@Override
	public void speak() {
		// 부모의 메소드를 호출 super.
		System.out.println(super.toString()+location+"에 서식하며, 색상은 "+color+"입니다.");
		// System.out.println(toString()+location+"에 서식하며, 색상은 "+color+"입니다.");
		
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
