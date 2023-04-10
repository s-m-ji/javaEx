package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.BookVo;


/**
 * 비즈니스 로직
 * 사용자의 요청을 검증(유효성 검사, 사용자의 입력값을 체크),  * DB CRUD 요청, * 사용자 요구에 맞게 반환
 * Dao 호출: DB 입출력
 * @author user
 *
 */
public class BookService {
	
	BookDao bookDao = new BookDao();
	
	public void getList() {
		List<BookVo> list = bookDao.getList();
		System.out.println("===== 도서 목록 조회 =====");
		for(BookVo book : list) {
			System.out.println(book.toString());
		}
		System.out.println(); // 개행용
	}
	
	public int insertBook(BookVo bookVo) {
		int res = bookDao.insertBook(bookVo);
		if(res>0) {
			System.out.println("도서 등록되었습니다.");
			getList();	// 도서 목록 조회
		} else {
			System.err.println("도서 등록 중 오류가 발생했습니다.");
		}
		return 0;
	}

	public void deleteBook(int bookNo) {
		int res = bookDao.deleteBook(bookNo);
		if(res>0) {
			System.out.println("도서 삭제되었습니다.");
			getList();	// 도서 목록 조회
		} else {
			System.err.println("도서 삭제 중 오류가 발생했습니다.");
		}
	}

	/**
	 * 책이 대여 가능한 상태인지 확인
	 * 가능하면 대여 처리
	 * 아니면 오류 메시지 처리 
	 * @param bookNo
	 */
	public void rentBook(int bookNo) {
		boolean flag = selStatus(bookNo, "N");
		if(flag) {
			int res = bookDao.updateBook(bookNo, "Y");
			if(res>0) {
				System.out.println("도서 대여되었습니다.");
				getList();
			} else {
				System.err.println("도서 대여 중 오류가 발생했습니다.");
			}
		} else {
			System.err.println("대여할 수 없는 도서입니다.");
		}
		
	}
	
	/**
	 * 대여/반납 가능한 책인지 조회
	 * @param no
	 * @param restYN
	 * @return
	 */
	public boolean selStatus(int no, String rentYN) {
		boolean res = bookDao.selStatus(no, rentYN);
		return res;
	}

	public void returnBook(int bookNo) {
		boolean flag = selStatus(bookNo, "Y");
		if(flag) {
			int res = bookDao.updateBook(bookNo, "N");
			if(res>0) {
				System.out.println("도서 반납되었습니다.");
				getList();
			} else {
				System.err.println("도서 반납 중 오류가 발생했습니다.");
			}
		} else {

			System.err.println("반납할 수 없는 도서입니다.");
		}
	}
		
	
}







