package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {

	// 파일로부터 데이터를 읽어서 리스트로 반환하는 메소드 생성 'getList' 
	List<Book> getList(); 
	
	// 몇 건이 처리되었는지 보여줄 메소드 
	int delete(int no);
	int update(int no);
	int insert(Book book);
	
	// 리스트를 파일로 출력하는 메소드 생성 'listToFile'
	boolean listToFile(List<Book> list);
}
