package com.Libraby;

import java.util.ArrayList;
import java.util.List;

public class Library {
	// 책 리스트를 생성
	// 접근제한자 별도 설정 없으니 접근 가능 : 사실 private이라고 해도 나는 접근 가능
	private List<Book> bookList = new ArrayList<>();
	
	public Library() {}
	
	public Library(List<Book> booList) {
		// 초기화
		this.bookList = booList;
	}
	
	// 이렇게 작성하거나 또는 아래와 같이 ! 
//	public void removeBook(int index) {
//		bookList.remove(index);
//	}
	
	public void removeBook(int index) {
		Book book = bookList.remove(index);
		System.out.println(book.toString() + " 삭제 완료. \n");
	}
	
	public void updateBook(int index) {
		/*
		 * 1. 책 조회 -> 인덱스에 들어있는 책 꺼내오기 : get()
		 * 2. 렌트 여부 수정
		 * 3. 책 저장하기
		 */
		Book book = bookList.get(index);
		book.setRent(true);
		bookList.set(index, book);
	}
	
	/**
	 * 책 추가
	 * @param title
	 * @param author
	 */
	public void addBook(String title, String author) {
		Book book = new Book(title, author);
		bookList.add(book);
	}
	
//	public boolean addBook(String title, String author) {
//		// 외부로부터 받아온 매개변수를 활용하여 책을 생성
//		Book book = new Book(title, author);
//		// 맨 마지막에 인덱스를 추가하고 객체를 저장
//		return bookList.add(book);
//	}
//	
	
//	@Override
//	public String toString() {
//		String res = "";
//		for(Book book : bookList) {
//			res = book.getTitle() + "/" + book.getAuthor() + book.isRent() + "\n";
//		}
//		return res;
//	}

	// String res로 담지 않는다면 바로 출력해서 부모의 toString을 리턴타입으로 넣으면 된다 
//	@Override
//	public String toString() {
//		for(Book book : bookList) {
//			System.out.println(book.getTitle() + "/" + book.getAuthor() + book.isRent() + "\n");
//		}
//		return super.toString();
//	}
//	
	@Override
	public String toString() {
		int i=0;
		for(Book book : bookList) {
			String str = "";
			if(book.isRent() == true) {
				str = " *대여중*";
			}
			System.out.println( i+ "번: " + book.getTitle() + "/" + book.getAuthor() + str + "\n");
			i++;
		}
		return null;
	}
	
//	@Override
//	public String toString() {
//		int i=0;
//		// 책 목록 출력
//		for(Book b : bookList) {
//			System.out.println(i + " : " + b.toString());
//			i++;
//		}
//		// return super.toString();
//		return "";
//	}
	
	
}







