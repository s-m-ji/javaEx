package march0329.ex02;

public class Dog implements Soundable {

	@Override
	public String sound() {
		return "멍멍";
		
		// System.out.println("멍멍");
		// return null;
		// -> 이렇게 쓸 경우 리턴값까지 반환해서 멍멍, null이 출력된다우
	}

}
