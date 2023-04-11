package com.kh.inherit;

import java.util.Scanner;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Student;

public class Application {

	public static void main(String[] args) {
		Student st[] = new Student[3];
		st[0] = new Student("홍", 20, 178.2, 70.0, 1, "정공과");
		st[1] = new Student("김", 21, 187.3, 80.0, 2, "경영과");
		st[2] = new Student("강", 23, 167.0, 45.0, 4, "정통과");
		
		System.out.println("===== 학생 목록 =====");
		for(int i=0; i<st.length; i++) {
			System.out.println(st[i].information());
		}
		
//		for(Student s : st) {
//			System.out.println(s.information());
//		}
		
		Employee emArr[] = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		int num=0;
		Outter:
		while(true) {
			System.out.println("사원명 입력: ");
			String name = sc.next();
			System.out.println("나이 입력: ");
			int age = sc.nextInt();
			System.out.println("키 입력: ");
			double height = sc.nextDouble();
			System.out.println("체중 입력: ");
			double weight = sc.nextDouble();
			System.out.println("급여 입력: ");
			int salary = sc.nextInt();
			System.out.println("부서 입력: ");
			String dept = sc.next();
			
			Employee em = new Employee(name, age, height, weight, salary, dept);
			emArr[num] = em;
			num++;
			
			System.out.println("y:계속 입력, q:종료");
			String menu = sc.next();
			if(menu.equalsIgnoreCase("q") || num == 10) {
				break Outter;
			} else if (menu.equalsIgnoreCase("y")){
				
			}
			
		}
		
//		for(int i=0; i<emArr.length; i++) {
//			if(emArr[i] == null) {
//				break;
//			}
//			System.out.println(emArr[i].information());
//		}
		
		System.out.println("===== 사원 목록 =====");
		for(Employee e : emArr) {
			if(e == null) {
				break;
			}
			System.out.println(e.information());
		}
		
	}

}
