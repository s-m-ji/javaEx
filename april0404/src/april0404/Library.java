package april0404;

import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class Library {
	List<Book> list = new ArrayList<>();
	
	public Library() {
		
		list.add(new Book(1, "책1", "작가1", false));
		list.add(new Book(2, "책2", "작가2", false));
		list.add(new Book(3, "책3", "작가3", false));
		list.add(new Book(4, "책4", "작가4", false));
	}
	
	public boolean insertBook(
			int no, String title, String author, boolean isRent) {
		Book book = new Book(no, title, author, isRent);
		list.add(book);
		return true;
	}
	
	public boolean deleteBook(int index) {
		for(Book book : list) {
			if(index == book.getNo()) {
				list.remove(book);
				return true;
			}
		}
		return false;
	}
	
	public boolean rentBook(int index) {
		for(Book book: list) {
			if(index == book.getNo()) {
				if(book.isRent()) {
					System.out.println("대여 불가");
					return false;
				} else {
					book.setRent(false);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean returnBook(int index) {
		for(Book book : list) {
			if(index == book.getNo()) {
				if(!book.isRent()) {
					System.out.println("반납 불가");
					return false;
				} else {
					book.setRent(false);
					return true;
				}
			}
		}
		return false;
	}
	
	public void info() {
		System.out.println("--- 도서 목록 ---");
		for(Book book : list) {
			book.info();
		}
		System.out.println("----------------");
	}
}







