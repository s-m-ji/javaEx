package com.library.vo;

public class Book {
	private int no;
	private String title;
	private String author;
	private boolean isRent;
	
	public Book(int no, String title, String author) {
		this.no = no;
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		String str = "";
		if(isRent == true) {
			str = " -대여중-";
		}
		return no +"/"+ title +"/"+ author + str;
	}
	
	
	public void info() {
		String str = "";
		if(isRent) {
			str = " *대여중*";
		}
		System.out.println(no +"/"+ getTitle() +"/"+ getAuthor() + str);
	}
	

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return "제목-"+title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return "작가-"+author;
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
