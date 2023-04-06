package com.kh.object;

import com.kh.object.practice.Product;

public class Application {

	public static void main(String[] args) {
		
		Product pd1 = new Product("note9", "갤럭시", "수원", 96, 10.0);
		Product pd2 = new Product("note5", "LG", "평택", 78, 0.7);
		Product pd3 = new Product("note3", "KT", "강남", 25, 0.3);
		
		System.out.println("====== 초기 설정 ======");
		System.out.println(pd1.information());
		System.out.println(pd2.information());
		System.out.println(pd3.information());
		
		pd1.setPrice(120);
		pd2.setPrice(120);
		pd3.setPrice(120);

		pd1.setTax(0.05);
		pd2.setTax(0.05);
		pd3.setTax(0.05);
		
		System.out.println("====== 정보 수정 ======");
		System.out.println(pd1.information());
		System.out.println(pd2.information());
		System.out.println(pd3.information());

		System.out.println("====== 최종 출력 ======");
		System.out.println(pd1.print());
		System.out.println(pd2.print());
		System.out.println(pd3.print());
		
	}

}
