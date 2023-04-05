package com.library;

import java.util.List;

import com.library.dao.Dao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	
	private List<Book> list; 
	private Dao dao = new FileDao();
	
	Library(){
		list = dao.getList();
	}
	
	@Override
	public String toString() {
		String strList = "";
		for(Book book : list) {
			strList += book.toString() + "\n";
		}
		return strList;
	}
	
	// 책 등록 메소드 insertBook() : 외부로부터 받은 데이터를 바탕으로 책을 생성하고 리스트에 추가
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		
		for(Book book : list) {
			if(book.getNo() == no) {
				System.out.println("중복 번호 사용 불가");
				return false;
			}
		}
		Book book = new Book(no, title, author, isRent);
		
		boolean result = dao.fileSave(list);
		
		list.add(book);
		
		if(result) {
			return true;
		} else {
			list.remove(book);
			return false;
		}
	}

}









