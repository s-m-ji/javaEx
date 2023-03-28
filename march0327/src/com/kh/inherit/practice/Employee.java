package com.kh.inherit.practice;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		// 부모의 생성자는 언제나 첫번째 줄에서 호출 !
		super(age, height, weight);
		super.name = name;
		// this.name = name; // 나 자신도 만들 수 있음
		setSalary(salary); // 이런 형태로도 쓸 수 있다 ? ^_^
		setDept(dept);
//		this.salary = salary;
//		this.dept = dept;
	}



	public String information() {
		// 부모메소드 호출결과 반환된 String 값에 자식 필드의 값을 추가하여 반환
		return super.information()+" "+getSalary()+" "+getDept();
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
