package april0403;

public class Book {
	private String title;
	private String author;
	private boolean isRent;
	private int no;
	
	@Override
	public String toString() {
		String str = "";
		if(isRent == true) {
			str = " *대여중";
		}
		return no +" "+ title +" "+ author + str;
	}
	
	public Book(int no, String title, String author) {
		this.title = title;
		this.author = author;
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
