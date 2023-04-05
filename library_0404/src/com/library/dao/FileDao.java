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

	/**
	 * 파일을 읽고 book을 반복하여 list로 반환
	 */
	@Override
	public List<Book> getList() {
		System.out.println("FileDao.getList() 시작");
		List<Book> list = new ArrayList<>();
		
		/**
		 * 파일을 읽어서 리스트를 반환
		 */
		// 반납할 리소스(자원)가 있는 경우 try()안에 생성할 경우 자동으로 .close()까지 됩네당
		try(FileReader fr = new FileReader("bookList.txt");
				BufferedReader br = new BufferedReader(fr);) {

			String str = "";
			// 파일로부터 1줄씩 읽어들여서 null(파일의 끝)이 될 때까지 반복합니다.
			while((str = br.readLine()) != null) {
				Book book = makeBook(str);	
				
				// 리스트 파싱 중 오류가 발생한 건은 제외
				if(book != null) {
					list.add(book);
				}
			}
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
		}
		
		return list;
	}

	
	/**
	 * 문자열을 받아서 책을 생성하여 반환합니다
	 * @param str
	 * @return
	 */
	public Book makeBook (String str) {
		// 추후 반환을 위해 선언해둠
		Book book = null;
		try {
			// 공백" "을 이용하여 문자열을 잘라서 배열로 반환
			String[] strArry = str.split(" ");

			int no = Integer.parseInt(strArry[0]);
			String title = strArry[1];
			String author = strArry[2];
			boolean isRent = Boolean.parseBoolean(strArry[3]);	
					
			// 				 0	  책1   저자1    false
			book = new Book(no, title, author, isRent);
			
		} catch (Exception e) {
			// 데이터 파싱 중 오류가 발생하더라도 프로그램이 종료되지 않도록 오류 처리
			System.err.println("리스트 등록 중 오류 발생");
			System.err.println("===== br.readLine(): "+str);
		}
		
		// 책이 정상적으로 생성된 경우 book 반환
		// 생성 중 오류 발생 히 null 반환
		return book;
	}

	/**
	 * list를 file로 저장
	 */
	@Override
	public boolean fileSave(List<Book> list) {
		try (FileWriter fw = new FileWriter("bookList.txt");) {
			
			// 반복문 이용할 수 있는 이유는 list를 받아오기 때문에
			for(Book book : list) {
				fw.write(book.toString()+"\n");
			}
			
			// 파일로 출력
			fw.flush();
			
			// 파일 출력 성공
			return true;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 파일 출력 실패
		return false;
	}


	@Override
	public boolean fileSave(Book book) {
		try (FileWriter fw = new FileWriter("bookList.txt",true);) {
					
					fw.write(book.toString()+"\n");
					
					// 파일로 출력
					fw.flush();
					
					// 파일 출력 성공
					return true;
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// 파일 출력 실패
				return false;
			}
	
}




























