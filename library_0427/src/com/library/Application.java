package com.library;

import java.util.List;

import com.library.controller.LibraryController;
import com.library.dao.BookDao;
import com.library.dao.MemberDao;
import com.library.vo.Book;
import com.library.vo.Member;

public class Application {

	public static void main(String[] args) {
//		Book book = new Book(1, "스니커즈 사피엔스", "N", "박상영");
//		System.out.println(book.toString());
//		System.out.println(book);
		
//		BookDao dao = new BookDao();
//		dao.getList().toString();	
		// toString()은 문자열을 반환하는 메소드이기 때문에 콘솔에 출력 안된다.
//		
//		Book book = new Book("test5","test5");
//		dao.insert(book);

//		Book book2 = new Book("스니커즈 사피엔스8","박상영8");
//		dao.insert(book2);
		
//		dao.delete(7);
//		dao.delete(9);
//		
//		dao.update(6, "Y");
//		
//		List<Book> list = dao.getList();
//		for(Book b : list) {
//			System.out.println(b.toString());
//		}
//		
//		System.out.println(dao.getList().toString());
//		System.out.println("------------------------------------------------------------");
//		System.out.println(dao.getList());
		
		
//		MemberDao mDao = new MemberDao();
		
//		System.out.println(mDao.login("ADMIN", "1234"));
		
//		Member member = new Member("user01", "1234", "사용자1", "N", "N", "C") ;
//		Member member = new Member("user03", "1234", "사용자3", null, null, null);
//		mDao.insert(member);
		
//		System.out.println(mDao.idCheck2("user01"));
		
//		System.out.println(mDao.delete("user03"));
//		mDao.delete("user03");
		
//		BookDao bDao = new BookDao();	
//		System.out.println(bDao.getList());

		LibraryController lib = new LibraryController();
		lib.library();
		
		
		
	}

}




















