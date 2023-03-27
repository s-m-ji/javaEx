package ex.sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {
		People people = new People(null, null);
		Student student = new Student(null, null, 0);
		
		System.out.println(people.name);
		System.out.println(student.name);
		
		people.name = "하트";
		student.name = "다이아몬드";
		System.out.println(people.name);
		System.out.println(student.name);
		
	 	System.out.println(student.toString());
	}
	
	public StudentExample() {
		
	}

}
