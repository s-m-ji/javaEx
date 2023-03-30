package com.object;
	
public class Book {
	private String title;
	private String writer;
	
	public Book(String title, String writer) {
//		this.title = title;
//		this.writer = writer;
		setTitle(title);
		setWriter(writer);
		// 만약 setTitle을 별도로 초기화해준게 아니라면 
		// this.title로 써도 상관없음. 같이 똑같아서 !
		// 다만 ▼ 아래처럼 writer+"님"; 이런 식으로 
		// ~ 님이라는 형태 출력을 원하면 set값으로 쓴다고합네당 
	}
	
	

	@Override
	public String toString() {
		return title +" / "+ writer;
		
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer+"님";
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

}
