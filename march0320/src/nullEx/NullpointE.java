package nullEx;

public class NullpointE {
	public static void main(String[] args) {
		// c초기값으로 null을 입력
		// 참조변수가 아무런 객체도 참조하고있지 않다는 의미
		// . :주소 접근자, 객체 접근 연산자 
		// . 자동완성으로 호출하면 나오는 목록은 ? . 이후 객체가 가지고 있는 접근 가능한 필드, 메소드
		// 필드 , 메소드
		// 변수명.필드명; , 변수명.메소드명(매개변수);
		
		String name = null;
		name = "Hello";
		// length() : 문자열의 총 길이를 반환
//		System.out.println("총 문자수 출력: " + name.length());
		// 해결방안: 참조변수가 null인 경우 실행되지 않도록 처리한다
		if(name != null) {
			System.out.println("총 문자수 출력: " + name.length());
		}
		System.out.println("정상 종료");
	}
}
