package com.library.dao;

import java.util.List;
import com.library.vo.Book;

public class DatabaseDao implements Dao{

	@Override
	public List<Book> getBookList() {
		System.out.println("DB-리스트 조회");
		return null;
	}

	@Override
	public int insertBook(List<Book> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBook(List<Book> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rentBook(List<Book> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int returnBook(List<Book> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatBook(List<Book> bookList) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public int insertBook(Book book) {
//		System.out.println("DB-신규 도서 입력");
//		return 0;
//	}
//
//	@Override
//	public int deleteBook(Book book) {
//		System.out.println("DB-도서 삭제");
//		return 0;
//	}
//
//	@Override
//	public int rentBook(Book book) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int returnBook(Book book) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
