package com.library.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;



public class BookFileDao implements Dao{
	
	public String fileName = "bookList.txt";
	
	public BookFileDao() {}
	public BookFileDao(String fileName) {
		if(!fileName.isEmpty()) {
			this.fileName = fileName;
		}
	}
	public static void main(String[] args) {
		Dao fd = new BookFileDao();
		
//		boolean res = fd.fileWriteBook(new Book("자바의정석", "남궁성"));
//		if(res) {
//			System.out.println("저장 되었습니다.");
//		}
		
//		List<Book> bookList = fd.getBookList();
//		System.out.println(bookList);
		
		System.out.println("start");
		Book book = new Book("자바의정석", "남궁성");
		book.setRent(true);
		fd.updateBook(book);
		
		System.out.println("end");
		
	}
	
	@Override
	public List<Book> getBookList(){
		List<Book> bookList = new ArrayList<>();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fileName);
		
			br = new BufferedReader(fr);
			String readline = "";
			
			while((readline = br.readLine()) != null) {
				String[] bookInfo = readline.split(" ");
				bookList.add( new Book(Integer.parseInt(bookInfo[0]), bookInfo[1], bookInfo[2], bookInfo[3]) );
			}
		} catch (FileNotFoundException e1) {
			System.out.println("bookList.txt 파일을 찾을수 없습니다.");
			e1.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입출력중 오류가 발생 하였습니다.");
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
		
		
		return bookList;
		
	}

	@Override
	public boolean insertBook(Book book) {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fw = new FileWriter(fileName, true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			pw.println(book.info());
			pw.flush();
			
					
			return true;
			
		} catch (IOException e) {
			System.err.println("파일 입출력중 오류가 발생 했습니다.");
		} finally {
			if(bw != null || pw != null) {
				try {
					pw.close();
					bw.close();
					fw.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
					System.out.println("fileWriter를 닫는 도중 오류가 발생 하였습니다.");
				}				
			}
			
		}
		
		return false;
	}
	
	@Override
	public boolean deleteBook(Book book) {
		return fileUpdate(book, false);
	}

	@Override
	public boolean updateBook(Book book) {
		return fileUpdate(book, true);
		
	}
	
	/**
	 * 파일 수정 삭제 임시파일 생성
	 * @param book : 수정시 책 정보
	 * @param flag : true(수정), false(삭제)
	 * @return
	 */
	public boolean fileUpdate(Book book, boolean flag) {
		
		try {
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			String readLine = "";
			while((readLine = br.readLine()) != null) {
				// 책 제목이 일치 할경우 수정또는 삭제
				String str[] = readLine.split(" ");
				if(book.getNo() == Integer.parseInt(str[0])) {
					if(flag) {
						sb.append(book.info()+"\n");
					}
				} else {
					sb.append(readLine+"\n");
				}
			}
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			bw.append(sb);
			bw.flush();
			bw.close();
			br.close();
			
			return true;
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	

}
