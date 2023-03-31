package com.Libraby;

import java.util.ArrayList;
import java.util.List;

public class Library2 {
	// 책 리스트를 생성
	private List<Book> bookList = new ArrayList<>();
	
	private Library2() {
		
	}

	private Library2(List<Book> bookList) {
		// 초기화
		this.bookList = bookList;
	}
	
	public boolean addBook(String title, String author) {
		// 외부로부터 받아온 매개변수를 활용하여 책을 생성
		Book book = new Book(title, author);
		// 맨 마지막에 인덱스를 추가하고 객체를 저장
		return bookList.add(book);
	}

	@Override
	public String toString() {
		int i=0;
		// 책 목록 출력
		for(Book b : bookList) {
			System.out.println(i + " : " + b.toString());
			i++;
		}
		return super.toString();
	}
	
}
