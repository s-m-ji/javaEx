package com.library.vo;

public class Book {
	private int no;
	private String title;		// 책제목
	private String author;		// 작가
	private boolean isRent = false;		// 대여여부
	
	@Override
	public String toString() {
		String str = "";
		if(isRent) {
			str = "대여중";
		}
		return getTitle() +" "+ getAuthor() + " " + str;
	}
	
	public String info() {
		return getNo() 
				+ " " + getTitle() 
				+ " " + getAuthor() 
				+ " " + isRent;
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book(int no, String title, String author, String isRent) {
		this.title = title;
		this.author = author;
		if(isRent != null) {
			this.isRent = Boolean.parseBoolean(isRent);
		}
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

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
}
