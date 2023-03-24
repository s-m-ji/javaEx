package com.kh.object;

import com.kh.object.practic.Product;

public class Application {

	public static void main(String[] args) {
		
		Product product1 =
				new Product("ssgnote9","갤럭시노트9","경기도 수원",960000,10.0);
		Product product2 =
				new Product("lgnote5","LG스마트폰5","경기도 평택",780000,0.7);
		Product product3 =
				new Product("ktsnote3","KT스마트폰3","서울시 강남",250000,0.3);
		
		System.out.println(product1.information());
		System.out.println(product2.information());
		System.out.println(product3.information());
		System.out.println("----------------------------------------");
		
		product1.setPrice(1200000);
		product2.setPrice(1200000);
		product3.setPrice(1200000);
		
		product1.setTax(0.05);
		product2.setTax(0.05);
		product3.setTax(0.05);
		
		System.out.println(product1.information());
		System.out.println(product2.information());
		System.out.println(product3.information());
		System.out.println("----------------------------------------");

		product1.clac();	
		product2.clac();	
		product3.clac();	
	}

}
