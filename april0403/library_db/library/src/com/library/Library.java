package com.library;

import java.util.ArrayList;
import java.util.List;

import com.library.dao.BookDatabaseDao;
import com.library.dao.BookFileDao;
import com.library.dao.Dao;
import com.library.vo.Book;

public class Library {
	// 책 리스트를 생성
	// 길이가 자동으로 늘어나면서 자료가 저장됩니다.
	private List<Book> bookList = new ArrayList<>();
	Dao dao = null;
	
	public Library(String selectDao, String fileName) {
		if("db".equals(selectDao)) {
			dao = new BookDatabaseDao();
		} else {
			dao = new BookFileDao(fileName);
		}
				
		bookList = dao.getBookList();
		// 책 추가
		addBook("책1", "지은이1");		
				
	}
	public Library(List<Book> bookList) {
		// 초기화
		this.bookList = bookList;
	}
	
	public Book addBook(String title, String author) {
		// 외부로부터 받아온 매개변수를 활용하여 책을 생성
		int no = bookList.get(getBookSize()-1).getNo()+1;
		Book book = new Book(no, title, author, "false");
		
		// 리스트에 책을 추가
		bookList.add(book);
		// 파일에 책을 추가
		dao.insertBook(book);
		return book;
	}
	
	public boolean removeBook(int no) {
		for(Book book : bookList) {
			if (book.getNo() == no) {
				// 리스트에서 제거
				bookList.remove(book);
				// 파일에서 제거
				dao.deleteBook(book); 
				System.out.println("삭제되었습니다. " + book.info() );
				
				return true;
				
			}
		}
		return false;
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
		
		// 책의 목록을 출력
		System.out.println("책 목록 *******************");
		for(Book book : bookList) {
			System.out.println(book.info());
		}
		System.out.println("**************************");
		return "";
	}
	
	public void rentBook(int no) {
		Book book = getBook(no);
		if(book == null) {
			System.err.println("번호를 확인해주세요. 없는 번호 입니다.");
			return;
		}
		if(book.isRent()) {
			System.err.println("이미 대여중인 책입니다.\n대여가 불가능 합니다.");
		} else {
			book.setRent(true);
			dao.updateBook(book);
		}
	}
	
	public void returnBook(int no) {
		Book book = getBook(no);
		if(book == null) {
			System.err.println("번호를 확인해주세요. 없는 번호 입니다.");
			return;
		}
		if(book.isRent()) {
			book.setRent(false);
			dao.updateBook(book);
		} else {
			System.err.println("반납할수 없습니다.\n관리자에게 문의해주세요.");
		}
	}
	
	private Book getBook(int no) {
		for(Book book : bookList) {
			if(book.getNo()==no) {
				return book;
			}
		}
		return null;
	}
	public int getBookSize() {
		return bookList.size();
	}
}












