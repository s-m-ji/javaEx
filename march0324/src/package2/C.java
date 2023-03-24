package package2;

import java.util.Calendar;

public class C {
	
	private C() {
		// 다른 곳에서 생성을 못하게 제한함 : 외부에서 생성자 접근 제한
		// 대신 이걸 생성할 수 있는 메소드를 만들어서 사용
		// 1개만 만들어서 그걸 공유해서 사용 
		// 그게 바로 싱글톤 패턴(방식). 예시 -> 캘린더
		Calendar calendar = Calendar.getInstance();
	}
	
	public C(int i) {
		this();
	}
	
	
	public void method1() {
		System.out.println("method1");
	}
	private void method2() { 
		// 노란줄 경고가 뜨는 이유?
		// 아직 사용되지 않은 메소드임을 알려줌
		// method1에는 뜨지 않은 이유? 이건 접근제한자가 public이기에 어디건가 쓸 것이라 생각하는듯?
		System.out.println("method2");
	}

	// B b = new B();
	// 다른 패키지에 있는 클래스라서 여기서 못 씀
}
