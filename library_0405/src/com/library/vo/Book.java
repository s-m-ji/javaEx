package com.library.vo;

public class Book {
	// 필드 = private 일련번호, 제목, 작가, 대출여부 4가지 생성
	private int no;
	private String title;
	private String author;
	private boolean isRent;
	
	// 생성자 
	public Book(int no, String title, String author, boolean isRent) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}
	
	// @ toString
	@Override
	public String toString() {
		String rentStr = "";
		if(isRent) {
			rentStr = "*대출중";
		} 
		
		return getNo()+"번"+" "+getTitle()+" "+getAuthor()+" "+rentStr; // 세팅값
	}
	
	
	// 
	public String info() {
		String rentStr = "대여가능";
		if(isRent) {
			rentStr = "*대출중*";
		} 
		
		return getNo()+"번"+" "+getTitle()+" "+getAuthor()+" "+rentStr; // 세팅값
	}
	
	
	
	
	
	
	// getter/setter 
	public int getNo() { 
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return "제목:"+title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return "작가:"+author;
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
