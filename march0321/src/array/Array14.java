package array;

import java.lang.*;
import java.util.*;

public class Array14 {

	public static void main(String[] args) {
//		 for(타입 변수 : 배열명){}
		int[] scores = {10,30,60};
		int sum = 0;
		for(int num : scores) {
			sum += num;
		}
//		System.out.println("합계: " + sum);
//		System.out.println("평균: " + sum/scores.length);
		
		String[] names = {"그리핀도르", "슬리데린", "후플푸프", "래번클로"};
		for(String str : names) {
			System.out.println(str);
		}
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
//		System.out.println(Array.toString(names));
				
	}

}
