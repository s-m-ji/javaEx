package april0403;

import java.util.ArrayList;
import java.util.List;

public class Library {

	// 책 리스트 생성
	private List<Book> bookList = new ArrayList<>();
	
	// 초기화
	public Library() {
		
	}
	
	public Library(List<Book> bookList) {
		this.bookList = bookList;
	}



	// addBook
	public boolean addBook(int no, String title, String author) {
		Book book = new Book(no, title, author);
		return bookList.add(book);
	}
	
	// removeBook
	public void removeBook(int index) {
		Book book = bookList.remove(index);
		System.out.println(index + "번 책(" + book.toString() + ") 삭제됨");
	}
	
	// updateBook
	public void updateBook(int index) {
		/*
		 * 1. 인덱스에 들어있는 책을 꺼내오기
		 * 2. 렌트여부 수정
		 * 3. 책 저장하기
		 * */
		Book book = bookList.get(index);
		book.setRent(true);
		bookList.set(index, book);
		System.out.println("책 정보 수정");
	}
	
	// rentBook
	public void rentBook(int index) {
		Book book = bookList.get(index);
		if(book.isRent()) {
			System.out.println("대여 불가");
		} else {
			book.setRent(true);
			bookList.set(index, book);
			System.out.println("대여 완료");
		}
	}
	
	// returnBook
	public void returnBook(int index) {
		Book book = bookList.get(index);
		if(book.isRent()) {
			book.setRent(false);
			bookList.set(index, book);
			System.out.println("반납 완료");
		} else {
			System.out.println("반납 불가");
		}
	}
	
	
	// getBookSize
	public int getBookSize() {
		return bookList.size();
	}
	
	
	// toString 오버라이딩
	@Override
	public String toString() {
		// 책 목록을 출력
		System.out.println("==========================");
		int i=0;
		for(Book b : bookList) {
			System.out.println(i + " : " + b.toString());
			i++;
		}
		return "";
	}
}




















