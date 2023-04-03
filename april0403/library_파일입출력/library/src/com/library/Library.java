package com.library;

import java.util.ArrayList;
import java.util.List;

import com.library.dao.BookFileDao;
import com.library.vo.Book;

public class Library {
	// 책 리스트를 생성
	// 길이가 자동으로 늘어나면서 자료가 저장됩니다.
	private List<Book> bookList = new ArrayList<>();
	BookFileDao bookFileDao = new BookFileDao();
	
	public Library() {
		
	}
	public Library(List<Book> bookList) {
		// 초기화
		this.bookList = bookList;
	}
	
	public boolean addBook(String title, String author) {
		// 외부로부터 받아온 매개변수를 활용하여 책을 생성
		Book book = new Book(title, author);
		// 맨 마지막에 인덱스를 추가하고 객체를 저장
		return bookList.add(book);
	}
	
	public void removeBook(int index) {
		Book book = bookList.remove(index);
		bookFileDao.deleteBook(book); 
		System.out.println("삭제되었습니다. " + book.toString() );
	}
	
	public void updateBook(int index) {
		/*
		 * 1. 인덱스에 들어있는 책을 꺼내오기
		 * 2. 렌트여부 수정
		 * 3. 책 저장하기
		 * */
		Book book = bookList.get(index);
		book.setRent(true);
		bookList.set(index, book);
		
		
	}
	@Override
	public String toString() {
		int i=0;
		// 책의 목록을 출력
		System.out.println("책 목록 *******************");
		for(Book book : bookList) {
			System.out.println(i + " : " +book.toString());
			i++;
		}
		System.out.println("**************************");
		return "";
	}
	public void rentBook(int index) {
		Book book = bookList.get(index);
		if(book.isRent()) {
			System.err.println("이미 대여중인 책입니다.\n대여가 불가능 합니다.");
		} else {
			book.setRent(true);
			bookFileDao.updateBook(book);
			bookList.set(index, book);			
		}
	}
	public void returnBook(int index) {
		Book book = bookList.get(index);
		if(book.isRent()) {
			book.setRent(false);
			bookFileDao.updateBook(book);
			bookList.set(index, book);			
		} else {
			System.err.println("반납할수 없습니다.\n관리자에게 문의해주세요.");
		}
	}
	
	public int getBookSize() {
		return bookList.size();
	}
}












