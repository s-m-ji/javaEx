package com.library.dao;

import java.util.List;

import com.library.vo.Book;


public interface Dao {
	
	// 리스트 조회
	List<Book> getBookList();
	// 생성
	boolean insertBook(Book book);
	// 삭제
	boolean deleteBook(Book book);
	// 수정
	boolean updateBook(Book book);
	
}
