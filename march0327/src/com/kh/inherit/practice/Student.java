package com.kh.inherit.practice;

public class Student extends Person {
	private int grade;
	private String major;

	public Student() {
		
	}
	
	// 초기화 : 생성자의 매개변수를 필드에 입력합네당
	public Student(String name, int age, double height, double weight, int grade, String major) {
		// private이라서 super.age는 불가넝하기에 부모의 생성자를 호출
		super(age, height, weight);
		// protected: 패키지가 달라도 부모자식 관계면 접근 가능
		super.name = name;
		this.grade = grade;
		this.major = major;
	}

	
	@Override
	public String information() {
		// super.information 반환타입: String
		return super.information() +" "+ getGrade()+" "+getMajor();
		
		// String information = super.information();
		// return information +" "+ getGrade()+" "+getMajor();
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
