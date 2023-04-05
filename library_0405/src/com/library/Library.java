package com.library;

import java.util.List;

import com.library.dao.Dao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	// 필드 - 책 목록
	List<Book> list = null;
	
	// 인터페이스를 타입으로 선언 후 구현체를 이용해서 생성
	Dao dao = new FileDao();
	
	public Library() {
		list = dao.getList();
		System.out.println(toString()); 
		// 메소드명을 바로 적으면 해당 클래스 내에 있는 메소드로 잘 인식함
	}
	
	@Override
	public String toString() {
		System.out.println("---책 목록을 보여줍니다.---toString()");
		String info = "";
		for(Book book : list) {
			info += book.info() +"\n";
		}
		return info;
	}
	
	
	
	// 파라미터로 책의 정보를 받아서 리스트에 등록
	// 리스트를 파일로 출력
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		
		// 입력하려는 책의 번호가 중복인지 체크
		for(Book book : list) {
			if(no == book.getNo()) {
				System.err.println("중복 번호는 입력 불가");
				return false;
			}
		}
		
		Book book = new Book(no, title, author, isRent);
		
		list.add(book);
		
		// 파일에 저장이 잘 되었는지를 또 체크
		// listToFile() 메소드의 타입이 boolean이라서 같은 타입으로 함
		boolean result = dao.listToFile(list);
		
		if(! result) {
			// 파일이 정상 등록되지 않았다면 리스트에서 제거
			list.remove(book);
			System.out.println("책이 등록되지 않았습니다. 관리자에게 문의는 포도가 모꼬시푼뎅");
			return false;
		}
		System.out.println("예아 ~~~ 책이 등록되었습니다.");
		System.out.println("목록을 재출력합니다.");
		System.out.println(toString());
		return true;
	}

	
	/**
	 * 책의 일련번호를 입력 받아서 리스트에서 삭제
	 * 리스트를 파일로 출력(리스트와 파일의 데이터를 동일하게 저장)
	 * @param no
	 * @return
	 */
	public boolean deleteBook(int no) {
		for(Book book : list) {
			if(no == book.getNo()) {
				list.remove(book);
				boolean result = dao.listToFile(list);
				
				// 파일 출력에 실패할 경우 다시 리스트에 추가
				if(!result) {
					list.add(book);
					System.out.println("파일 출력 도중 오류 발생---lib.deleteBook()");
					return false;
				} 
				System.out.println(no+"번 책은 삭제되었습니당 ^_^");
				System.out.println("목록을 재출력합니다.");
				System.out.println(toString());
				return true;
			}
		}
		System.out.println(no+"번 책은 없는데여??? 번호를 다시 확인해주세요");
		return false;
	}

	
	/**
	 * 일련번호에 해당하는 책 찾기
	 * 대출 가능한 상태(isRent = false)라면 대출하고 상태 바꾸기(isRent = true)
	 * 렌트가 안되면 메세지 처리
	 * 리스트를 파일로 출력
	 * @param no
	 * @return
	 */
	public boolean rentBook(int no) {
		for(Book book : list) {
			if(no == book.getNo()) {
				if(!book.isRent()) {
					book.setRent(true);
					boolean check = dao.listToFile(list);
					if(!check) {
						System.err.println("파일 출력 중 오류 발생---lib.rentBook");
						book.setRent(false);
					}
					System.out.println(no+"번을 대출했습니다.");
					System.out.println("목록을 재출력합니다.");
					System.out.println(toString());
					return true;
				} 
				System.err.println(no+"번은 이미 대출중입니다.");
				return false;
			}
		}
		System.err.println("해당하는 번호의 책을 찾지 못했습니다.");
		return false;
	}

	/**
	 * 일련번호에 해당하는 도서를 찾는다
	 * 도서가 대출중(isRent = true)이라면 반납처리
	 * 아니면 "반납 가능한 도서가 아닙니다." 메시지 처리
	 * @param no
	 * @return
	 */
	public boolean returnBook(int no) {
		for(Book book : list) {
			if(no == book.getNo()) {
				if(book.isRent()) {
					book.setRent(false);
					dao.listToFile(list);
//					if(!result) {
//						System.err.println("파일 출력 중 오류 발생");
//						book.setRent(true);
//					}
					System.out.println(no+"번을 반납했습니다.");
					System.out.println("목록을 재출력합니다.");
					System.out.println(toString());
					return true;
				} else {
					System.err.println(no+"번은 이미 반납되었습니다.");
					return false;
				}
			} 
		}
		System.err.println("번호를 다시 확인해주세요.");
		return false;
	}
	
	
	
	
	
	
}






















