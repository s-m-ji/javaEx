package com.kh.object;

public class ProductEx {
	private String id;
	private String name;
	private String site;
	private int price;
	private double tax;
	
	public ProductEx() {
		
	}

	public ProductEx(String id, String name, String site, int price, double tax) {
		super();
		this.id = id;
		this.name = name;
		this.site = site;
		this.price = price;
		this.tax = tax;
	} 
	
	/**
	 * 상품의 정보를 출력합니다.
	 * @return
	 */
	public String information() {
		return getId()+" "+getName()+" "+getPrice()+" "+getSite()+" "+getTax();
	}
	
	/**
	 * 상품의 가격을 계산하여 상품명과 함께 출력합니다.
	 */
	public void calculator() {
		int sum = (int)(getPrice()+(getPrice()*getTax()));
		System.out.println("상품명 = "+getName());
		System.out.println("가격 = "+sum+"원");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
