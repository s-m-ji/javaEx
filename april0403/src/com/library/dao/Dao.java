package com.library.dao;

import java.util.List;
import com.library.vo.Book;

public interface Dao {
	// 책 리스트 조회
	List<Book> getBookList();
	
	// 신규 도서 등록
	int insertBook(Book book);
	
	// 도서 삭제
	int deleteBook(Book book);
	
	// 도서 대여
	int rentBook(Book book);
	
	// 도서 반납
	int returnBook(Book book);
}
