package com.object;

public class Member {
	
	public static void main(String[] args) {
		Member mem1 = new Member("id");
		Member mem2 = new Member("id");
		
//		System.out.println("mem1.equals(mem2): " + mem1.equals(mem2));
		// 원래의 주소값 비교가 아닌 id를 비교했음
		mem1.equals(mem2);
	}
	
	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	/**
	 * this(Member객체)가 가지고 있는 id값과 
	 * 매개변수로 받은 Object의 id값과 일치하는지 비교
	 */
	@Override
	public boolean equals(Object obj) {
		// 객체가 가지고 있는 id 값이 맞다면 true / 아니면 false로 리턴하고싶음 
		
		// 두 객체가 가지고있는 주소값을 비교
		obj.equals(new Object());
		
//		if(this.id == obj.id){ // obj의 id를 바로 가져올 수 없음
		if(obj instanceof Member) {
			Member member = (Member)obj;
//			this.id.equals(obj);
//			((Member)obj).getId();
			System.out.println("obj.equals(): " + super.equals(obj));
			System.out.println("Member.equals(): " + getId().equals(member.id));
			if(this.id == ((Member)obj).getId()){
				return true;
			}
		}
		return false;
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
