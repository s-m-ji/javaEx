package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {
	// List 컬렉션 <> 타입 파라미터 Book, 이름 getList 추상메소드 생성
	List<Book> getList();
	
	// 타입 boolean , 이름 fileSave, 매개변수 타입 List<Book> 추상메소드 생성
	boolean fileSave(List<Book> list);
}
