package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {
	// 파일을 읽어서 리스트를 반환 합니다.
	List<Book> getList();
	
	// 리스트를 파일로 출력합니다.
	boolean listToFile(List<Book> list);
}
