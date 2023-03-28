package com.kh.practice2.model.vo;

import java.util.Arrays;

public class Application {
	public static void main(String[] args) {
		
		Animal[] aArry = new Animal[5];
		
		int i = (int)(Math.random()*2+0);
		
//		aArry[0] = new Cat("고영희", "고-종", "신촌", "무지개"); 
//		aArry[1] = new Dog("갱얼쥐", "강-종", 10); 
		
		aArry[0] = new Cat("고영희", "고-종", "신촌", "무지개"); 
		aArry[1] = new Dog("갱얼쥐", "강-종", 10); 
		
//		aArry[2] = new Cat("고영희2", "고-종2", "신촌", "무지개"); 
//		aArry[3] = new Dog("갱얼쥐2", "강-종2", 10); 
		
		
//			if(i == 0) {
//				aArry[i] = new Cat("고영희", "고-종", "신촌", "무지개"); 
//			} else if(i == 1) {
//				aArry[i] = new Dog("갱얼쥐", "강-종", 10); 
//			}
		
//		System.out.println(Arrays.toString(aArry));
		
//		int i = 0;
//		for(Animal a : aArry) {			
//			if(i == 0) {
//			aArry[i] = new Cat("고영희", "고-종", "신촌", "무지개"); 
//			} else if(i == 1) {
//				aArry[i] = new Dog("갱얼쥐", "강-종", 10); 
//			} 
////			a.speak();
//		}
		
		for(int j=0; j<aArry.length; j++) {
			for(Animal b : aArry){
			if(b == null) {
				break; // NullPointerException을 피하기 위한 장치
			} else {
				b.speak();
			}
		}
		}
	}
}
