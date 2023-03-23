package exam06;


public class MemberService {
	public boolean login(String id, String password) {
		// password에 null이 들어갈 경우 nullpointExeception이 발생할 우려..
		// null이 아닌 경우 체크로직을 실행하거나 "123456".equals를 사용
		if(password != null 
				&& "hong".equals(id) 
				&& password.equals("123456")) {
			return true;
		} 
		return false;
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}	
	
}
