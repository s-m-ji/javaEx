package march0328;

public class HttpservletExample {
	public static void main(String[] args) {
		// 일단 메인메소드 생성해두고 여기에 들어갈 친구들에 밑줄-오류가 뜨면 클릭해서 클래스를 만들어줘도 된다 !
		// 이클립스가 알아서 매개변수 HttpServlet 타입으로 들어갈 수 있도록 extends(상속)까지 해준다 ! 똑똑해라 ~
		
		// 클래스 내에 만들어진 메소드라서 메소드명만 기입해도 호출된다.
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}

	private static void method(HttpServlet hs) {
		hs.service();
	}
}
