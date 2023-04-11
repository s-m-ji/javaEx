package com.kh.inherit.practice;

public class Employee extends Person {
	private int salary;
	private String dept;

	public Employee() {}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String information() {
		return super.information()+" 급여: "+getSalary()+" 부서: "+getDept();
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
