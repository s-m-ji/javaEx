package com.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao {
	
	
	public static void main(String[] args) {
		FileDao dao = new FileDao();
		dao.getBookList();
		
		List<Book> list = new ArrayList<>();
		list.add(new Book(0,"책1", "저자1", false));
		
	}

	
	
	@Override
	public List<Book> getBookList() {
		System.out.println("- 책 리스트 조회 -");	
		List<Book> list = new ArrayList<>();
		
		// 파일 읽어오기
		// 공백으로 자르기
		// 책을 생성할 파라미터 만들기
		// 책 생성하기
		// 리스트에 담기
		
		try(BufferedReader br = new BufferedReader(new FileReader("bookList.txt"))) {
			String str = "";
			while((str = br.readLine()) != null){
				
				String strArry[] = str.split(" ");

				list.add( new Book(
						Integer.parseInt(strArry[0]), strArry[1], strArry[2], Boolean.parseBoolean(strArry[3])
						));
			}
			
//			for(Book b : list){
//				b.info();
//			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage()); 
		} catch (IOException e1) {
			System.out.println(e1.getMessage()); 
		}
		
		// 리스트 반환...
		return list;
	}
	
	

//	@Override
//	public int insertBook(Book book) {
//		System.out.println("- 신규 도서 등록 -");	
//		return 0;
//	}
//
//	@Override
//	public int deleteBook(Book book) {
//		System.out.println("- 도서 삭제 -");	
//		return 0;
//	}
//
//	@Override
//	public int rentBook(Book book) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int returnBook(Book book) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	
	@Override
	public int insertBook(List<Book> list) {
		System.out.println("- 신규 도서 등록 -");	
		
		// true 매개변수를 입력하면 이어쓰기가 됩니다.
		// new FileWriter("bookList.txt,true)
		try(FileWriter fw = new FileWriter("bookList.txt")) {
			for(Book book : list) {
				fw.write(book.toString() + "\n");
			}
			
			fw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	
	@Override
	public int deleteBook(List<Book> list) {
		System.out.println("- 도서 삭제 -");	
		return 0;
	}
	
	@Override
	public int rentBook(List<Book> list) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int returnBook(List<Book> list) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int updatBook(List<Book> bookList) {
		// TODO Auto-generated method stub
		return 0;
	}

}
