package march0327;

public class ExMain03 {

	public static void main(String[] args) {
		Ex03 book1 = new Ex03();
		Ex03 book2 = new Ex03("자바의 정석", 20000, 0.2, "윤상섭");
		
		book2.setPrice(5000);
		System.out.println(book2.information());
		
		book2.setDiscountRate(0.5);
		System.out.println(book2.information());
	}

}
