package com.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao{
	
	@Override
	public List<Book> getList() {
		List<Book> list = new ArrayList<>();
		try (FileReader fr = new FileReader("bookList.txt");
				BufferedReader br = new BufferedReader(fr);){
			
			String str = "";
			while((str = br.readLine()) != null) {
				Book book = makeBook(str);
				if(book != null) {
					list.add(book);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		return list;
	}
	
	
	
	@Override
	public boolean fileSave(List<Book> list) {
		
		try (FileWriter fw = new FileWriter("bookList.txt");){
			
			for(Book book : list) {
				fw.write(book.toString() + "\n");
			}
			fw.flush();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	
	
	public Book makeBook (String str) {
		Book book = null;
		
		try {
			String[] strArr = str.split(" ");
			
			int no = Integer.parseInt(strArr[0]);
			String title = strArr[1];
			String author = strArr[2];
			boolean isRent = Boolean.parseBoolean(strArr[3]);
			
			book = new Book(no, title, author, isRent);
			
		} catch (Exception e) {
			System.err.println("makeBook()에서 오류 발생");
		}
				
		return book;
	}

	
}























