package com.library.vo;

public class BookVo {
	int bookNo; 
	String bookTitle;
	String bookAutuor;
	String bookRentYN;

	public BookVo(int bookNo, String bookTitle, String bookAutuor, String bookRentYN) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAutuor = bookAutuor;
		this.bookRentYN = bookRentYN;
	}

	
	@Override
	public String toString() {
		String str = getBookRentYN().equals("Y")? "[대여중]":"";
		return 	getBookNo()+"번 "+
				"제목: "+getBookTitle()+" "+
				"작가: "+getBookAutuor()+" "+
				str;
	}
	
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAutuor() {
		return bookAutuor;
	}

	public void setBookAutuor(String bookAutuor) {
		this.bookAutuor = bookAutuor;
	}

	public String getBookRentYN() {
		return bookRentYN;
	}

	public void setBookRentYN(String bookRentYN) {
		this.bookRentYN = bookRentYN;
	}

}
