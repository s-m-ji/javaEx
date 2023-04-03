// 데이터를 담는 그릇
package com.library.vo;

public class Book {
	private int no;		// 책 일련번호
	private String title;	// 책 제목
	private String author;	// 책 작가
	private boolean isRent; // 대여 여부(true:대여중, false:대여가능)
	// 대여자
	// 대여일

	
	public Book(int no, String title, String author, boolean isRent) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}
	
	// 책 정보 출력
	public void info() {
		String str = "";
		if(isRent == true) {
			str = " *대여중";
		} 
		System.out.println(getno() +" "+ getTitle() +" "+ getAuthor() +" "+ str);
	}
	
	
	public int getno() {
		return no;
	}
	public void setno(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isRent() {
		return isRent;
	}
	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
	
	
	
	
}
