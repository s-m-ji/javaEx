package array;

// 접근제어자 class 클래스명 {}
public class Array05 {

	// public 접근제어자 
	// static 객체로 생성하지 않고 기본으로 메모리를 할당 받아 쓰겠다는 의미라고...
	// void : 반환 타입이 없다는 의미 -> 있을 경우 int, String 등등 명시하면 된다
	// main : 메소드이름
	// (String[] args) : 매개변수 (타입 변수명) -> 없으면 생략 가능
	public static void main(String[] args) {
		// System.out.println(args.length);
		// 변수만 생성되고 객체/배열의 방이 생성되지 않았기에 길이는 0
		// System.out.println(args[0]);
		// 그래서 없는 방을 찾았기에 오류 발생
		// 추후 main method의 매개변수로 배열 값이 들어가게됨
		
		// 1: 로컬, 2:테스트, 3:운영 -> 접근할 환경을 분기시킴
		int mode = Integer.parseInt(args[0]);
		if(mode ==1) {
			System.out.println("로컬이어유");
			// 로컬 DB 접속
			
		} else if(mode ==2) {
			System.out.println("테스트여유");
			// 테스트 DB 접속
			
		} else if(mode ==3) {
			System.out.println("운영이어유");
			// 운영 DB 접속
		}
		
		System.out.println(args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
			
	}

}
