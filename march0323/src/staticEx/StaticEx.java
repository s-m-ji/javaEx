package staticEx;

public class StaticEx {
	
	// 인스턴스 멤버 예시 
	public String name; // 1) 이건 메인 메소드에서 new로 생성해야 사용가능
	// public static String name; // 2) 그런데 static을 붙여주면
	
	// 정적 멤버 예시
	public static void main(String[] args) {
		StaticEx s = new StaticEx(); // 1) 이렇게 new로 생성해야 사용가능
		// String a = name; // 2) 이렇게 바로   사용 가능
	}
}
