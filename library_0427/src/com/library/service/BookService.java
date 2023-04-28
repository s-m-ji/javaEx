package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.Book;

public class BookService {
	
	BookDao bDao = new BookDao();
	/**
	 * 도서 목록 조회
	 * @return
	 */
	public List<Book> getList(){
		List<Book> list = bDao.getList();
		for(Book b : list) {
			System.out.println(b);
		}
		return list;
	}
	
	/**
	 * 도서 입력1
	 * @param book
	 * @return
	 */
	public int insertBook(Book book) {
		int res = bDao.insert(book);
		if(res>0) {
			System.out.println(res + "건 입력되었습니다.");
			System.out.println("***** 도서 등록 완료 *****");
			getList();
		} else {
			System.err.println("!!!!! 도서 등록 실패 !!!!!");
		}
		return 0;
	}
	
	/**
	 * 도서 입력2
	 * @param title
	 * @param author
	 */
	/* insertB를 쓸거면 
	 * LibraryController 클래스 adminMenu() case1에서
	 * Book book = new Book(title, author); 이렇게 책을 안 만들어줘도된다.
	 */
	public void insertB(String title, String author) {
		Book book = new Book(title, author);
		int res = bDao.insert(book);
		if(res>0) {
			System.out.println(res + "건 입력되었습니다.");
			System.out.println("***** 도서 등록 완료 *****");
			getList();
		} else {
			System.err.println("!!!!! 도서 등록 실패 !!!!!");
			System.err.println("관리자에게 문의해주세요.");
		}
	}

	/**
	 * 도서 삭제
	 * @param no
	 */
	public void deleteBook(int no) {
		int res = bDao.delete(no);
		if(res>0) {
			System.out.println(res + "건 삭제되었습니다.");
			System.out.println("***** 도서 삭제 완료 *****");
			getList();
		} else {
			System.err.println("!!!!! 도서 삭제 실패 !!!!!");
			System.err.println("관리자에게 문의해주세요.");
		}
		
	}

	/**
	 * 도서 대여
	 * 1. 대여 가능한 도서인지 확인
	 * 2. 대여 처리
	 * @param no
	 */
	public void rentB(int no, String id) {
		
		String rentYN = bDao.getRentYN(no);
		if("Y".equals(rentYN)) {
			System.out.println("이미 대여중인 도서인걸?");
		} else if ("".equals(rentYN)) {
			System.out.println("그 번호의 도서는 없는걸?");
		}
		int res = bDao.update(no, "Y");
		if(res>0) {
			System.out.println(res + "건 대여되었습니다.");
			System.out.println("***** 도서 대여 완료 *****");
			getList();
		} else {
			System.err.println("!!!!! 도서 대여 실패 !!!!!");
			System.err.println("관리자에게 문의해주세요.");
		}
		
	}

	/**
	 * 도서 반납
	 * 1. 반납 가능한 도서인지 확인
	 * 2. 반납 처리
	 * @param no
	 */
	public void returnB(int no) {
		String rentYN = bDao.getRentYN(no);
		if("N".equals(rentYN)) {
			System.out.println("이미 반납된 도서인걸?");
		} else if ("".equals(rentYN)) {
			System.out.println("그 번호의 도서는 반납할 수 없는걸?");
		}
		int res = bDao.update(no, "N");
		if(res>0) {
			System.out.println(res + "건 반납되었습니다.");
			System.out.println("***** 도서 반납 완료 *****");
			getList();
		} else {
			System.err.println("!!!!! 도서 반납 실패 !!!!!");
			System.err.println("관리자에게 문의해주세요.");
		}
		
	}


}
