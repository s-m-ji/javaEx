package com.arrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		// <내가 지정한 타입>
		// List는 인터페이스라서 ArrayList로 new 연산자로 객체를 생성해준 것 
		List<String> list = new ArrayList<String>();
		
		// 리스트에 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("myBATIS");
		
		list.add(2, "Database"); // 인덱스 2 자리에 추가
		
		list.remove(1); // 인덱스 1 항목 삭제
		
		list.set(0, "oracle"); // 인덱스 0 자리로 변경

		// 리스트에 저장된 총 갯수
		int size = list.size();
		System.out.println("총 갯수: " + size);
	
		// 리스트에 저장된 객체 얻기
		String str = list.get(2);
		System.out.println("2번 인덱스: "  + str);
		
		for(int i=0; i<list.size(); i++) {
			str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		System.out.println("*********************");
		
		int i=0;
		for(String s : list) {
			System.out.println(i + " : " + s);
			i++;
		}
	}
}





























