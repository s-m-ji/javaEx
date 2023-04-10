package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.BookVo;

public class BookService {
	BookDao bookDao = new BookDao();
	public void bookListPrint() {
		List<BookVo> list = bookDao.bookListPrint();
		System.out.println("--- 도서목록조회 ---");
		for(BookVo bv : list) {
			System.out.println(bv.toString());
		}
	}
	public int insertB(BookVo bookVo) {
		int res = bookDao.insertB(bookVo);
		if(res>0) {
			System.out.println("도서 등록 완료");
			bookListPrint();
		} else {
			System.err.println("등록 오류"); 
			
		}
		return 0;
	}
	public void deleteB(int bookNo) {
		int res = bookDao.deleteB(bookNo);
		if(res>0) {
			System.out.println("도서 삭제 완료");
			bookListPrint();
		} else {
			System.err.println("삭제 오류");
		}
		
	}
	public void rentB(int bookNo) {
		boolean flag = status(bookNo, "N");
		if(flag) {
			int res = bookDao.updateB(bookNo,"Y");
			if(res>0) {
				System.out.println("도서 대여 완료");
				bookListPrint();
			} else {
				System.err.println("대여 오류");
			}
		}
		
	}
	public boolean status(int bookNo, String string) {
		boolean res = bookDao.status(bookNo, string);
		return res;
	}
	public void returnB(int bookNo) {
		boolean flag2 = status(bookNo, "Y");
		if(flag2) {
			int res = bookDao.updateB(bookNo, "N");
			if(res>0) {
				System.out.println("도서 반납 완료");
			} else {
				System.out.println("반납 오류");
			}
		}
		
	}
}
