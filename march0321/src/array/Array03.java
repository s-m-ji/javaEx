package array;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		// new 연산자로 배열을 생성하는 방법
		// String 타입의 배열을 생성, 총 길이는 10
		
		// 타입에 맞게 기본값으로 초기화되어 값이 입력된다
		// int:0, double:0.0, boolean:false, 객체:null
		
		// 타입[] 변수명 = new 타입[길이]; *길이 = names.length
		// names.length -> [10]으로 초기화된다고 볼 수 있음
		String[] names = new String[10]; 
		names[0] = "냥냥냉";
		names[1] = "뇽뇽냉";
		
		for(int i=0; i<names.length; i++) {
//			System.out.println(names[i]);
		}
		
		String[] rooms = {"", ""};
		int[] score;
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇개의 방을 생성?");
		int index = scanner.nextInt();
		score = new int[index];
		
	}
}
