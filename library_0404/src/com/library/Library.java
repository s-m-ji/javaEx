package com.library;

import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DatabaseDao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	
	// 필드 (전역변수)
	// 클래스 내부 어디서든지 사용 가능
	private List<Book> list;
	
	// Dao는 FileDao 또는 DatabaseDao로 생성할 수 있도록 인터페이스 타입으로 선언해두었음
	private Dao dao = new FileDao();
	
	public Library() {
		// 파일을 읽어서 리스트를 초기화
		list = dao.getList();
	}
	
	public Library(String type) {
		if(type.equalsIgnoreCase("db")) {
			dao = new DatabaseDao();
		}
	}
	
	
	@Override
	public String toString() {
		String listStr = "";
		for(Book book : list){
			listStr += book.toString() + "\n";
		}
		return listStr;
	}
	
	// 책 등록 : 외부로부터 받은 데이터를 바탕으로 책을 생성하고 리스트에 추가
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		
		for(Book book : list) {
			if(book.getNo() == no) {
				System.out.println("중복되는 일련번호가 존재");
				return false;
			}
		}
		
		Book book = new Book(no, title, author, isRent);
		
		// fileSave 메소드를 생성하여 list 자체를 매개변수로 넣음.
		boolean result = dao.fileSave(list);
//		boolean result = dao.fileSave(book); 
// -> 파일 새로쓰기(x), 이어쓰기(o)하려고 메소드 하나 더 만들어두었음. 
		
		list.add(book);
		if(result) {
			// 파일이 성공적으로 저장되면 리스트에 추가
			return true;
		} else {
			list.remove(book);
			return false;
		}
	}
	
	
	
}





























