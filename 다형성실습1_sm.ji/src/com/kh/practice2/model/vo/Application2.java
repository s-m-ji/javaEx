package com.kh.practice2.model.vo;

public class Application2 {
	public static void main(String[] args) {
		// Animal타입의 객체배열을 5크기로 생성
		Animal[] animalArry = new Animal[5];
		
		Dog dog = new Dog("멍뭉쓰", "삽살쓰", 25);
		Cat cat = new Cat("냥냥쓰", "하나밖에 없는", "마포", "회색");
		
		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체를 생성
		// 이 때 매개변수 생성자를 이용하여 생성
		
		// 임의의 수 두 개 뽑기 (0 또는 1)
		// int index = (int)(Math.random()*2);
		// 만약 1,2로 하고싶다면?
		// int index = (int)(Math.random()*2+1);

		// i는 0~4까지 돌면서 배열의 각 방에 고양이 또는 강아지를 입력
		for(int i=0; i<5; i++) {
			// 0,1
			int index = (int)(Math.random()*2);
			if(index==1) {
				animalArry[i] = dog;
			} else {
				animalArry[i] = cat;
			}
		}
		
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출
		for(Animal a : animalArry) {
			// 자식 객체에서 오버라이딩(재정의)된 메소드로 호출됨
			a.speak();
		}
	}
}
