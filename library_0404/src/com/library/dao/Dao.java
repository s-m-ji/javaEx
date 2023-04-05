package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {

	// File로부터 데이터를 읽어서 list에 담아 반환
	List<Book> getList();

	boolean fileSave(List<Book> list);
	boolean fileSave(Book book);

}
