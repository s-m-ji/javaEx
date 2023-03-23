package exam06;

public class MemberService2 {
	String id;
	String password;
	
	public MemberService2(String id, String password) {
		this.id = "스누피";
		this.password = "0323";
	}

	public boolean login(String id,	String password) {
		if(this.id.equals(id) 
				&& this.password.equals(password)) {
			return true;
		} else {
			return false;
				}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃쓰 빼애앰");
	}
}
