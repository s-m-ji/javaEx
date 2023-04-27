package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.Book;

public class BookService {
	
	BookDao dao = new BookDao();
	/**
	 * 도서 목록 조회
	 * @return
	 */
	public List<Book> getList(){
		List<Book> list = dao.getList();
		for(Book b : list) {
			System.out.println(b);
		}
		return list;
	}
}
