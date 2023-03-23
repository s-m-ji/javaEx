package exam06;

public class MemberService3 {
	// 필드
	public String id;
	public String pw;
	
	public MemberService3(String id, String pw) {
		this.id=id;
		this.pw=pw;
	}
	
	// 메소드
	/**
	 * 로그인 처리
	 * 필드에 등록된 id, pw가 
	 * 일치하면 ture, 불일치하면 false
	 * @param id
	 * @param pw
	 * @return 로그인 성공: true, 로그인 실패: false
	 */
	public boolean login(String id, String pw) {
		// 필드 id : this.id
		if(id!=null 
				&& this.id.equals(id) 
				&& pw!=null
				&& this.pw.equals(pw)) {
		System.out.print("로그인에 성공했슈");
		return true;
		}
		System.out.print("로그인에 실패했슈");
		return false;
	}
	
	public void logout() { 
		// 동일한 이름의 지역변수로 매개변수를 쓰지 않았기 때문에
		// 아래의 id는 필드 id를 의미함 그래서 사용 가능함
		System.out.println("'"+id+"'"+"님 로그아웃 됐슈");
	}
}
