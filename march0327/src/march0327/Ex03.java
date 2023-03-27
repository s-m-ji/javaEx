package march0327;

public class Ex03 {
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Ex03() {
		
	}

	public Ex03(String title, int price, double discountRate, String author) {
		super();
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	public String information() {
		return getAuthor()+" "+ getDiscountRate()+" "+getPrice()+" "+getTitle();
	}
	
	public void calculator() {
		int sum = (int) (price - (price*discountRate));
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
