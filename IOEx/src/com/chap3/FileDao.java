package com.chap3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDao {
	public static void main(String[] args) {
		FileDao file = new FileDao();
//		file.fileRead();
		
		
		try(BufferedReader bf = new BufferedReader(new FileReader("bookList.txt"))) {
			String str = "";
			List<Book> list = new ArrayList<>();
			while((str = bf.readLine()) != null) {
				// String str = "1/제목1/작가1/false";
				String strArr[] = str.split(" ");
				
				int no = Integer.parseInt(strArr[0]);
				String title = strArr[1];
				String author = strArr[2];
				boolean isRent = Boolean.parseBoolean(strArr[3]);
				
				list.add(new Book(no, title, author, isRent));
				
			}
				System.out.println("파일로부터 읽어들인 책 정보를 출력");
				for(Book book : list) {
					System.out.println(book.toString());
				}
				
//				System.out.println(book.toString());
				
				
//				int i=0;
//				for(String s : strArr) {
//					System.out.println("방번호: "+i+ ", 값: "+s);
//				}
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	
	/**
	 * 리스트에 담겨있던 책 정보를 파일로 출력
	 */
	public void fileSave() {
		List<Book> list = new ArrayList<>();
		
		// 데이터 생성
		list.add(new Book(1, "上", "김", false));
		list.add(new Book(2, "中", "이", false));
		list.add(new Book(3, "下", "박", false));
		
		// 파일 출력
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("bookList.txt"))) {
			
			for(Book b : list) {
//				System.out.println(b.toString());
				bw.write(b.toString());
				bw.newLine();
			}
			
			bw.flush();
			System.out.println("파일 출력 완료우 ~~~");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
//TODO		System.out.println(list.toString()); //-> [이 안에 나오는 이유는??????]
		
	}

	
	/**
	 * 파일을 읽어서 책 리스트를 다시 생성
	 */
	public void fileRead() {
		
		try(BufferedReader bf = new BufferedReader(new FileReader("bookList.txt"))) {
			String str = "";
			List<Book> list = new ArrayList<>();
			
			System.out.println("===== 책 정보를 읽어옵니다 =====");
			
			while ((str = bf.readLine()) != null) {
				String[] strArr = str.split(" ");
			
				list.add(				
				new Book(Integer.parseInt(strArr[0]),
						strArr[1], 
						strArr[2], 
						Boolean.parseBoolean(strArr[3])));
			}
			
			System.out.println("===== 생성된 리스트를 출력합니다 =====");
			
			for(Book b : list) {
				System.out.println(list.toString());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
//		String str = "1 타이틀1 작가1 false";
		// 파라미터로 입력된 구분자를 이용하여 문자열을 자르고 배열로 반환
		// 구분자로 끊어서 배열로 반환
		// {1, 타이틀1, 작가1, false}
//		String[] strArr = str.split(" ");
		// new Book(1,"타이틀1", "작가1", false);
//		new Book(Integer.parseInt(strArr[0]),
//				strArr[1], 
//				strArr[2], 
//				Boolean.parseBoolean(strArr[3]));
		
		
//		try(BufferedReader br = new BufferedReader(new FileReader("bookList.txt"))) {
//			while(br.readLine()) {
//			}
		
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
	}
}
