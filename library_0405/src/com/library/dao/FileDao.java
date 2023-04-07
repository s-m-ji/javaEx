package com.library.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao {

	@Override
	public List<Book> getList() {
		System.out.println("---파일을 읽어오고 있습니다.---getList()");
		// 리스트 선언 'list'
		List<Book> list = new ArrayList<>();
		
		// 리소스 자동으로 닫아주기
		// 파일을 읽어오는 스트림 사용
		// 보조스트림은 단독 사용 불가 : 기본스트림을 파라미터로 넣어주기
		try (BufferedReader br = 
				new BufferedReader(new FileReader("bookList.txt"));){
			
			// 데이터를 한 줄씩 읽어오기 : 파일의 끝까지(EOF) = null
			// null이면 반복문 탈출 : null이 아닐때까지 반복
			String readLine = "";
			while((readLine = br.readLine()) != null ){
				
				// 문자열로 Book 생성 : 해당 기능을 가진 메소드 생성 'makeBook'
				Book book = makeBook(readLine);
				
				// null이 아니면 : 책이 정상적으로 생성되었다면 list에 book을 담기
				if(book != null) {
					list.add(book);
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
//			e.printStackTrace();
		} catch (IOException e) {
			System.err.println(e.getMessage());
//			e.printStackTrace();
		}
		
		return list;
	}
	
	/**
	 * 문자열을 파싱하여 Book 객체를 생성
	 * @param readLine
	 * @return
	 */
	
	private Book makeBook(String readLine) {
		
		// 책을 반환 - 캐스팅 오류 또는 파일 파싱 시 오류 발생 가능
		// 오류 발생 시, 프로그램이 비정상적으로 종료되는 것을 방지하기 위해 오류 처리
			
		try {
			// 공백 또는 특정 문자를 기준으로 배열 저장
			String[] strArry = readLine.split("/");
			
			// 배열 데이터를 알맞은 타입/변수로 저장
			int no = Integer.parseInt(strArry[0]);
			String title = strArry[1];
			String author = strArry[2];
			boolean isRent = Boolean.parseBoolean(strArry[3]);
//			System.out.println("test" + isRent);
			
			
			// 생성된 책으로 반환하기
			return new Book(no, title, author, isRent);
			
			
			// 오류가 발생할 경우 null을 반환
		} catch (Exception e) {
			System.err.println("makeBook() [" +readLine+ "] 에서 오류 발생");
			System.err.println(e.getMessage());
			return null;
		}
			
	}

	
	
	/**
	 * list를 매개변수로 받아서 file로 출력
	 */
	@Override
	public boolean listToFile(List<Book> list) {
		try (FileWriter fw = new FileWriter("bookList.txt");){
			
			// 리스트에 담긴 책의 정보를 파일로 출력합니다.
			for(Book book : list) {
				fw.write(book.toString() + "\n");
			}
			
			fw.flush();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}





























