package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.BookVo;

public class BookService {

	BookDao dao = new BookDao();
	
	// 책 리스트를 출력
	public void bookListPrint() {
		List<BookVo> list = dao.getList();
		
		if (list == null) {
			System.out.println("등록된 책이 없습니다."); 
			return;
		}
		
		System.out.println("책 목록 =========================== ");
		for(BookVo book : list) {
			System.out.println(book.toString());
		}
	}
	/**
	 * 책 추가
	 * @param no
	 * @param title
	 * @param author
	 * @return
	 */
	public boolean InsertBook(int no, String title, String author) {
		// 외부로부터 받아온 매개변수를 활용하여 책을 생성
		BookVo book = new BookVo(no, title, author, "N");
		// DB에 책을 추가
		int res = dao.insert(book);
		return res>0 ? true:false;
			
	}
	
	/**
	 * 책 삭제
	 * @param no
	 * @return
	 */
	public boolean deleteBook(int no) {
		// DB로 부터 데이터 삭제
		int res = dao.delete(no);
		// 삭제 되었으면 리스트 다시 읽어오기
		return res>0 ? true:false;
	}
	
	/**
	 * 책 대여
	 * @param no
	 */
	public int rentBook(int no) {
		 
		// 대여 가능 상태인지 조회
		boolean res = dao.selStatus(no,"N");
		int cnt = 0; 
		if(res) {
			// 대여처리
			cnt = dao.update(no, "Y");
			if(cnt > 0) {
				System.out.println(cnt + "건 대여 되었습니다.");
			}
		} else {
			System.out.println("대여가 불가능한 상태 입니다. 관리자에게 문의해주세요.");
		}
		return cnt;
	}
	
	/**
	 * 책 반납
	 * @param no
	 */
	public void returnBook(int no) {
		// 반납 가능 상태인지 조회
		boolean res = dao.selStatus(no,"Y");
		int cnt = 0;
		if(res) {
			// 반납처리
			cnt = dao.update(no, "N");
			if(cnt > 0) {
				System.out.println(cnt +"건 반납 되었습니다.");
			}
		}else {
			System.out.println("반납이 불가능한 상태 입니다. 관리자에게 문의해주세요.");
		}
		
	}
	
}












