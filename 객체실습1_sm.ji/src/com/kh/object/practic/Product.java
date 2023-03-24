package com.kh.object.practic;

public class Product {
	private String id;
	private String name;
	private String site;
	private int price;
	private double tax;
	
	public Product() {
		
	}
	
	public Product(String id, String name, String site, int price, double tax) {
		// super(); 상속 받는 친구라고 합니다. 일단은 주석 처리!
		this.id = id;
		this.name = name;
		this.site = site;
		this.price = price;
		this.tax = tax;
	}
	
	/**
	 * 모든 필드의 정보를 출력합니다.
	 * @return
	 */
	public String information() {
		return
			getId()+" "+getName()+" "+getPrice()+" "+getSite()+" "+getTax(); 
		// 아직 명확한 반환값을 모른다면 참조 타입이니까 초기값 null로 우선 설정 가능
		// 반환값으로 그냥 Id, Name 등의 필드를 가져오지 않는 이유?
		// -> getID로 가져와야 유효성 검증까지 할 수 있어서..?라고 대충 설명해주심
	}
	
	/**
	 * 상품명을 출력하고
	 * 가격을 계산해서 출력합니다.
	 */
	public void clac() {
		System.out.println("상품명 = "+getName());
		int res = (int)(getPrice()+(getPrice()*getTax()));
		System.out.println("부가세 포함 가격 = "+res+"원");
	}

	// 보통 getter/setter는 이렇게 코드의 마지막 부분에 위치
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
