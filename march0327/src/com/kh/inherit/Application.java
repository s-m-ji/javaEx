package com.kh.inherit;

import java.util.Scanner;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Student;

public class Application {
	public static void main(String[] args) {
		Student[] std = new Student[3];
		std[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		std[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		std[2] = new Student("강개순", 20, 167.0, 45.0, 4, "정보통신학과");
		
		System.out.println("===== 학생의 정보를 출력합네당 ===== ");
		for(int i=0; i<std.length; i++) {
			System.out.println(std[i].information());
		}
		System.out.println("===================================");
		
		Employee[] emp = new Employee[10];
		
		Scanner scan = new Scanner(System.in);
		int j = 0;
		Outter:
		while(true) {
			System.out.println("이름을 입력하세요.");
			String name = scan.next();
			System.out.println("나이를 입력하세요.");
			String age = scan.next();
			System.out.println("신장을 입력하세요.");
			String height = scan.next();
			System.out.println("몸무게를 입력하세요.");
			String weight = scan.next();
			System.out.println("급여를 입력하세요.");
			String salary = scan.next();
			System.out.println("부서를 입력하세요.");
			String dept = scan.next();
			
			j++;
			emp[j] = new Employee("", 0, 0.0, 0.0, 0, "");
					
			System.out.println("추가하시겠습니까? * y 또는 n 입력");
			String answer = scan.next();
			if(answer.equals("y")) {
			
			} else if(answer.equals("n")) {
				System.out.println("종료합니다.");
				break Outter;
			} else if(!(answer.equals("y") || answer.equals("n"))) {
				System.out.println("잘못된 입력입니다.");
				break Outter;
			}
		
		}
		for(int i=0; i<=j; i++) {
			System.out.println(emp[i].information());
		}
		
	}
}
