package com.library.vo;

public class BookVo{
	private int no;
	private String title;		// 책제목
	private String author;		// 작가
	private String rentYN = "N";		// 대여여부


	@Override
	public String toString() {
		String str = "";
		if(getRentYN().equals("Y")) {
			str = "대여중";
		}
		return getNo() +" "+ getTitle() +" "+ getAuthor() + " " + str;
	}
	
	public String info() {
		return getNo() 
				+ " " + getTitle() 
				+ " " + getAuthor() 
				+ " " + getRentYN();
	}
	
	public BookVo(int no, String title, String author, String rentYN) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.rentYN = rentYN;
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
	
	public String getRentYN() {
		return rentYN;
	}

	public void setRentYN(String rentYN) {
		this.rentYN = rentYN;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
}
