package com.library.dao;

import java.util.List;

import com.library.vo.Book;


public interface Dao {
	
	// 리스트 조회
	List<Book> getBookList();
	// 생성
	int insertBook(Book book);
	// 삭제
	int deleteBook(Book book);
	// 수정
	int updateBook(Book book);
	
}
