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

	@Override
	public List<Book> getList() {
		// 파일로 부터 데이터를 읽어서 리스트로 반환
//		System.out.println("FileDao.getList() 시작");
		// 리스트 선언
		List<Book> list = new ArrayList<>();
		
		// 리소스를 자동으로 닫아줍니다. ex) fr.close();
		try (FileReader fr = new FileReader("bookList.txt");
			 // 단독으로 사용 불가 - 기본스트림을 파라메터로 넣어줍니다.
			 BufferedReader br = new BufferedReader(fr);
			){
			
			// 한줄씩 읽어 옵니다 
			// 파일의 끝(EOF) = null
			String readLine = "";
			// null이면 반복문 탈출
			while ((readLine = br.readLine()) != null) {
				// 문자열을 이용해서 Book객체를 생성
				Book book = makeBook(readLine);
				// 생성된 객체를 리스트에 담아줍니다.
				if(book != null) {
					list.add(book);
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
//			e1.printStackTrace();
		}
		
//		System.out.println("FileDao.getList() 종료");
		return list;
	}

	/**
	 * 문자열을 파싱하여 Book객체를 생성 합니다.
	 * @param readLine
	 * @return
	 */
	private Book makeBook(String readLine) {
		// 반환 선언
		Book book=null;
		// 공백을 기준으로 배열로 저장
		String[] str = readLine.split(" ");

		// 강제형변환시 오류가 발생 할수 있으므로
		// 파일이 올바르지 않은 형태로 저장되어있을 경우 오류가 발생
		// 프로그램에서 오류가 발생 했을때, 
		// 프로그램이 비정상적으로 종료되는것을 막기위해서 예외처리 
		try {
			// 문자열을 int 타입으로 변환
			int no = Integer.parseInt( str[0] );
			String title = str[1];
			String author = str[2];
			// 문자열을 boolean 타입으로 변환
			boolean isRent = Boolean.parseBoolean( str[3] );
			
			book = new Book(no, title, author, isRent);
			//return book;
			// Book을 생성하기 위해 알맞은 타입으로 저장
			// 책을 생성
			// 오류가 발생할 경우 null을 반환
			// 책을 반환
			
		} catch (Exception e) {
			// 문자열 파싱중 오류가 발생했을경우 메세지 처리, return null
			System.err.println(readLine + " : 파싱중 오류가 발생 하였습니다.");
			//return null;
		}
		return book;
	}

	@Override
	/**
	 * 리스트를 매개변수로 받아 파일로 출력합니다.
	 */
	public boolean listToFile(List<Book> list) {
		try (FileWriter fw = new FileWriter("bookList.txt");) {
			
			// 리스트에 담긴 책의 정보를 파일로 출력 합니다.
			for(Book book : list) {
				fw.write( book.toString() + "\n");
			}
			
			fw.flush();
			
			return true;
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		return false;
	}
	
}












