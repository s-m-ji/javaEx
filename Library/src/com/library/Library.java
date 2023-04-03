package com.library;

import java.util.ArrayList;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DatabaseDao;
import com.library.dao.FileDao;

import com.library.vo.Book;

public class Library {
	// 도서 리스트 - 메모리(프로그램 종료 시 사라짐)
	private List<Book> bookList = new ArrayList<>();
	
	// 데이터의 입출력 - 데이터 보관(data access object) 
	private Dao dao = null; // 정보를 모두 사용하기위해 필드로 만든거라고요..?
	
	
	
	
	/**
	 * 생성자
	 */
//	public Library() {
//		// 책의 리스트를 조회 (추후 파일 또는 DB 이용)
//		// 책을 생성해서 리스트에 담는다
//		// TODO : 일련번호 중복 방지
//		// -> DB 이용 시에는 번호를 기본key로 사용 시, 중복된 번호는 입력이 안되므로 오류 발생
//		bookList.add(new Book(1, "책1", "작가1", false));
//		bookList.add(new Book(2, "책2", "작가2", false));
//		bookList.add(new Book(3, "책3", "작가3", false));
//		bookList.add(new Book(4, "책4", "작가4", false));
//	}
	public Library(String confDao) {	// 콘피그 다오 : 설정값 하나 받아오기
		if("db".equals(confDao)) {
			this.dao = new DatabaseDao();
		} else {
			this.dao = new FileDao();
		}
		bookList.add(new Book(1, "책1", "작가1", false));
		bookList.add(new Book(2, "책2", "작가2", false));
		bookList.add(new Book(3, "책3", "작가3", false));
		bookList.add(new Book(4, "책4", "작가4", false));
	}
	
	
	/**
	 * 신규 도서 추가
	 * @param no
	 * @param title
	 * @param author
	 * @param isRent
	 * @return
	 */
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		// try-catch..?
		
		// 리스트에 책을 추가
		// bookList.add(new Book(no, title, author, isRent));
		Book book = new Book(no, title, author, isRent);
		bookList.add(book);
		dao.insertBook(book);
		return true;
	}
	
	
	/**
	 * 책 대여
	 * 책의 일련번호를 매개변수로 하여 isRent 값 수정(책의 정보를 수정)
	 * @param index
	 * @return
	 */
	public boolean rentBook(int index) {
		for(Book book : bookList) {
			// 사용자가 입력한 일련번호가 존재하는 경우
			if(book.getno() == index) {
				// 이미 대여중인 경우
				if(book.isRent()) {
					System.err.println(index + "번은 이미 대여중인 도서입니다.");
					return false;
				}
				//대여 여부 수정 : 책의 정보를 수정
				book.setRent(true);
				System.out.println("대여되었습니다.");
				return true;
				// TODO dao.updatebook(book);
			}
		}
		// TODO -> 해당 도서를 찾지 못했을 때 대여되었습니다. 나오면 안됨
		System.err.println(index + "번은 대여 불가한 도서입니다.");
		return false;
	}
	
	
	/**
	 * 책 삭제 
	 * @param index
	 * @return
	 */
	// 삭제하기 - > 인덱스 번호가 없는 경우에 메세지 처리 수 false 반환
	public boolean deleteBook(int index) {
		for(Book book : bookList) {
			// 책의 일련번호를 확인
			if(index == book.getno()) {
//				 bookList.remove(index); // index로 넣으면 1번 책이 아니라, 인덱스 1번째 책이 삭제되므로 book을 넣어야합네당! 
//				 return true;
				dao.deleteBook(book);
				return bookList.remove(book); 
			}
		}
		System.err.println(index + "번에 해당하는 도서를 찾지 못했습니다.");
		return false;
	}
	
	
	// 반납하기
	public boolean returnBook(int index) {
		for(Book book : bookList) {
			if(index == book.getno()) {
				if(! book.isRent()) {
					System.out.println("returnBook -> " + index + "번은 이미 반납 처리된 도서입니다.");
				} else {
				book.setRent(false);
				System.out.println("반납되었습니다.");
				return true;
				}
			} 
		}
		System.out.println(index + "번은 반납 불가한 도서입니다.");
		return false;
	}
	
	
	// 책 리스트 정보 출력
	public void info() {
		System.out.println("===== ===== =====");
		// 리스트를 돌면서
		for(Book book : bookList) {
			book.info(); // 책 정보를 출력 
		}
		System.out.println("===== ===== =====");
	}
	
	
	
	public static void main(String[] args) {
		// 라이브러리 생성
		Library lib = new Library("");
//		Library lib = new Library("db");	// -> DB-신규 도서 입력 이렇게 출력됩니당...
		
		// 도서 리스트 출력
		System.out.println("<<< 도서 리스트 출력 >>>");
		lib.info();
		
		// 신규 도서 등록
		System.out.println("<<< 신규 도서 등록 >>>");
		lib.insertBook(5, "책5", "작가5", false);
		lib.info();
		
		// 도서 대여
		System.out.println("<<< 도서 대여 >>>");
		lib.rentBook(3);
		lib.info();
		
		// 도서 삭제
		System.out.println("<<< 도서 삭제 >>>");
		lib.deleteBook(1);
		lib.info();
		
		// 도서 대여2
		System.out.println("<<< 도서 대여2 >>>");
		lib.rentBook(3);
		lib.info();
		
		// 도서 반납
		System.out.println("<<< 도서 반납 >>>");
		lib.returnBook(3);
		lib.info();
		
	}
}

































