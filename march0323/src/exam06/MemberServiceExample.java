package exam06;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		if(service.login("hong", "123456")) {
			System.out.println("로그인 성공입니다.");
			service.logout("hong");
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
	}
}
