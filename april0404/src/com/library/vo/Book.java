package com.library.vo;

public class Book {
	private int no;	
	private String title;	
	private String author;	
	private boolean isRent;
	
	public Book(int no, String title, String author, boolean isRent) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}
	
	
	@Override
	public String toString() {
		String str = "";
		if(isRent) {
			str = " *대여중";
		}
		return "[" + getNo() +"]"+ getTitle() +" "+ getAuthor() + str;
	}
	
	
	public void info() {
		String str = "";
		if(isRent) {
			str = " *대여중";
		}
		System.out.println(no +"/"+ title +"/"+ author + str);
	}
	
	

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return "추천도서 "+title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author+"님";
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
