package com.kh.practice;

import com.kh.practice.model.vo.Animal;
import com.kh.practice.model.vo.Cat;
import com.kh.practice.model.vo.Dog;

public class Application {

	public static void main(String[] args) {
		Animal[] animal = new Animal[5];
		
//		animal[0] = new Dog("스누피", "비글", 20);
//		animal[1] = new Cat("키티", "애옹이", "수영장", "물색");
		
		for(int i=0; i<animal.length; i++) {
			int num = (int)(Math.random()*2);
			if(num == 0) {
				animal[i] = new Dog("스누피", "비글", 20);
			} else {
				animal[i] = new Cat("키티", "애옹이", "수영장", "물색");
			}
		}
		
		for(Animal ani : animal) {
			ani.speak();
		}

	
	}

}
