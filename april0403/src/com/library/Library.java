package com.library;

import java.util.ArrayList;
import java.util.List;

import com.library.dao.Dao;
import com.library.vo.Book;

public class Library {
	private List<Book> bookList = new ArrayList<>();
	private Dao dao = null;
	
	public Library() {
		bookList.add(new Book(1, "b1", "a1"));
		bookList.add(new Book(2, "b2", "a2"));
		bookList.add(new Book(3, "b3", "a3"));
	}
	
	public static void main(String[] args) {
		Library lib = new Library();
		lib.info();

		lib.insertBook(4, "b4", "a4");
		lib.info();
		
		lib.rentBook(3);
		lib.info();
		
		lib.deleteBook(0);
		lib.info();
		
		lib.rentBook(1);
		lib.info();
		
		lib.returnBook(3);
		lib.info();
		
		
	}
	
	// 도서 목록 조회
	public void info() {
		System.out.println("----------------------");
		for(Book b : bookList) {
//			b.toString();
			b.info();
		}
		System.out.println("----------------------");
	}
	
	// 신규 도서 추가
	public boolean insertBook(int no, String title, String author) {
		Book book = new Book(no,title,author);
		bookList.add(book);
		return true;
	}
	
	// 도서 삭제
	public boolean deleteBook(int index) {
		for(Book b : bookList) {
			if(index == b.getNo()) {
				bookList.remove(index);
				return true;
			}
		}
		System.out.println(index+"번 도서는 없습니다.");
		return false;
	}
	
	// 도서 대여
	public boolean rentBook(int index) {
		for(Book b :bookList) {
			if(index == b.getNo()) {
				if(b.isRent()) {
					System.err.println(index + "번 도서는 대여중입니다.");
					return false;
				}
				b.setRent(true);
				System.out.println("대여 완료");
				return true;
			}
		}
		return false;
	}
	
	// 도서 반납
	public boolean returnBook(int index) {
		for(Book b :bookList) {
			if(index == b.getNo()) {
				if(!b.isRent()) {
					System.out.println(index + "번 도서는 반납된 상태입니다.");
					return false;
				}
				b.setRent(false);
				System.out.println("반납 완료");
				return true;
			}
		}
		return false;
	}
	
	
	
}






















