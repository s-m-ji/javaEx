package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public class DatabaseDao implements Dao{

	@Override
	public List<Book> getBookList() {
		System.out.println("DB-*도서 목록 조회*");
		return null;
	}

	@Override
	public int insertBook(Book book) {
		System.out.println("DB-*신규 도서 입력*");
		return 0;
	}

	@Override
	public int deleteBook(Book book) {
		System.out.println("DB-*도서 삭제*");
		return 0;
	}

	@Override
	public int rentBook(Book book) {
		return 0;
	}

	@Override
	public int returnBook(Book book) {
		return 0;
	}

}
