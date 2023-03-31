package com.Libraby;

public class Book {
	private String title;
	private String author;
	private boolean isRent = false;   // 도서 대여 : 기본 초기값은 false
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		String str = "";
		if(isRent == true){
			str = " ※대여중";
		}
		return getTitle() + "/" + getAuthor() + str;
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
