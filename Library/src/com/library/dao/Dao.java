package com.library.dao;

import java.util.List;
import com.library.vo.Book;

public interface Dao {
	// --- 인터페이스에 추상메소드 만들기
	
	List<Book> getBookList();	// 책 리스트를 조회
	
	int insertBook(Book book);	// 신규 도서 등록
	// *또는 boolean 타입으로 생성해도 好
	
	int deleteBook(Book book);	// 도서 삭제
	
	int rentBook(Book book);	// 도서 정보 업데이트
	
	int returnBook(Book book);	// 도서 반납
}
