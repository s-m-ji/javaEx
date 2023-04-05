package com.library;

//import java.util.List;
//
//import com.library.dao.FileDao;
//import com.library.vo.Book;

public class App {
	public static void main(String[] args) {
		/* 테스트 ---------------------------
//		FileDao dao = new FileDao();
//		List<Book> list = dao.getList();
//		
//		System.out.println("===== 생성된 도서 리스트 출력 =====");
//		for(Book book : list) {
//			System.out.println(book.toString());
//		}
		*/
		
		
		Library lib = new Library();
		// 확인했으니 주석처리 System.out.println(lib.toString());
		
		System.out.println(lib.toString());
		lib.insertBook(8, "책", "작가", false);
		System.out.println(lib.toString());
		
	}
}
