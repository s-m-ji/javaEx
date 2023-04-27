package com.library.vo;

public class Book {
	private int no;			// 도서 일련번호 
	private String title;   // 도서명
	private String rentyn;  // 도서 대여여부
	private String author; 	// 작가 
	
	// 도서를 추가할 경우 도서명과 작가명만 알고 있으면 되도록 생성자 추가
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		// 신규도서이므로 N
		this.rentyn = "N";
	}
	
	public Book(int no, String title, String rentyn, String author) {
//		super();
		this.no = no;
		this.title = title;
		this.rentyn = rentyn;
		this.author = author;
	}
	
	@Override
	public String toString() {
		String rentYNStr = "| 대여가능";
		// if문 안에 getRentyn()에 null이 담겼을 경우 null예외가 나올 수도 있기 때문에
		// 코드를 작성할 때도 확실한 비교대상을 앞에 먼저 적을 경우 예외를 피할 수 있다. 
		
		// 도서가 rentYN=Y인 경우 대여중 표시
		if("Y".equals(getRentyn())) {
			rentYNStr = "| *대여중*";
		}
				
		return getNo()+" "+getTitle()+" "+getAuthor()+" "+rentYNStr;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRentyn() {
		return rentyn;
	}
	public void setRentyn(String rentyn) {
		this.rentyn = rentyn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}   
