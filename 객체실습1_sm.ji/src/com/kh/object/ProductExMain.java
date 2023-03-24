package com.kh.object;

public class ProductExMain {

	public static void main(String[] args) {
		ProductEx pd1 = new ProductEx("note9","갤럭시","수원",960000,10.0);
		ProductEx pd2 = new ProductEx("note5","LG","평택",780000,0.7);
		ProductEx pd3 = new ProductEx("note3","KT","강남",250000,0.3);
		
		System.out.println(pd1.information());
		System.out.println(pd2.information());
		System.out.println(pd3.information());
		System.out.println("===================================");
		
		pd1.setName("노트9");
		pd2.setName("스마트폰5");
		pd3.setName("스마트폰3");
		
		pd1.setSite("경기도");
		pd2.setSite("경기도");
		pd3.setSite("서울시");
		
		System.out.println(pd1.information());
		System.out.println(pd2.information());
		System.out.println(pd3.information());
		System.out.println("===================================");

		pd1.calculator();
		pd2.calculator();
		pd3.calculator();
		System.out.println("===================================");
	
	}

}
