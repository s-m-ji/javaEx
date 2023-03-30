package com.labary;

public class Libary {

	// 책 리스트
	private Book[] bookArry = new Book[5];
	
	/**
	 * 책 리스트를 추가
	 */
	public void addBook() {
		bookArry[0] = new Book("혼자공부하는자바", "신용권");
		bookArry[1] = new Book("자바의정석", "신용식");
		bookArry[2] = new Book("do!it! java", "김기량");
		bookArry[3] = new Book("불편한편의점", "홍경민");
		bookArry[4] = new Book("너무열심히산건같다", "잘했다");
	}
	
	@Override
	public String toString() {
		String str = "";
		for(Book b: bookArry) {
			str += b.getTitle() + " " + b.getAuthor() + "\n";
		}
		
		return str;
	}
	
}
