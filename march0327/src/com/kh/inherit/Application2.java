package com.kh.inherit;

import java.util.Scanner;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Student;

public class Application2 {
	
	public static void main(String[] args) {
		
	/* 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당
	 * 데이터를 참고하여 3명의 학생 객체 생성
	 * 반복문을 통래 출력
	 */

	// 배열 선언 : 같은 타입의 데이터를 여러개 보관
	// 배열 선언 : 타입[] 변수명 = new 타입[길이];
	Student[] sArry = new Student[3];
	
	// 학생 객체를 먼저 생성 후 배열에 담는 것도 가넝 !
	Student s1 = new Student("홍", 20, 178.2, 70.0, 1, "정시과");
	sArry[0] = s1; 	
	sArry[1] = new Student("김", 21, 187.3, 80.0, 2, "경영과");
	sArry[2] = new Student("강", 23, 167.0, 45.0, 4, "정통과");
	
	for(Student s : sArry) {
		System.out.println(s.information());
	}

	
	/* 최대 10명의 사원 정보를 기록할 객체 배열 생성
	 * 키보드로 사원 정보를 입력 받도록 구현
	 */
	
	// 참조변수의 초기값인 null로 초기화된다
	Employee[] empArry = new Employee[10];
	
	Scanner scan = new Scanner(System.in);
	
	int index = 0;
	Outter:
	while(true) {
		
		System.out.println("이름: ");
		String name = scan.next();
		System.out.println("나이: ");
		int age = scan.nextInt();
		System.out.println("신장: ");
		double height = scan.nextDouble();
		System.out.println("몸무게: ");
		double weight = scan.nextDouble();
		System.out.println("급여: ");
		int salary = scan.nextInt();
		System.out.println("부서: ");
		String dept = scan.next();
		
		// 매개변수 생성자를 이용하여 필드를 초기화
		Employee emp = new Employee(name, age, height, weight, salary, dept);
//		System.out.println(emp.information());
		
		// 사용자로부터 입력받은 값으로 사원을 생성하고 배열에 입력
		empArry[index] = emp;
		// 사원이 입력된 후 다음번 방으로 이동
		index++;
		
		// 반복문 탈출
		System.out.println("y:계속 입력, n:종료");
		String next = scan.next();
		if(next.equals("n") || index == 10) {
			break Outter;
		} else if (next.equalsIgnoreCase("y")){
			
		}
		
	}
		for(Employee e : empArry) {
			// e. <--- 주소 접근 연산자인 .을 이용할 경우
			// null은 주소를 가지고 있지 않으므로 오류가 발생...
			if(e == null) {
				break; // NullPointerException을 피하기 위한 장치
			}
			System.out.println(e.information());
		}
	
	}
	
}
