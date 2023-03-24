package com.kh.object;

import com.kh.object.practice.Book;

public class Application {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("자바의 정석", 20000, 0.2, "윤상섭");
		
		book1.print();
		book2.print();
//		System.out.println(book1.information());
//		System.out.println(book2.information());
		System.out.println("============================");
		
		book1.setTitle("오라클의 정석");
		book1.setPrice(10000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("섭상윤");

		book1.print();
//		System.out.println(book1.information());
		System.out.println("============================");
		
		book1.calculator();
		book2.calculator();
	}

}
