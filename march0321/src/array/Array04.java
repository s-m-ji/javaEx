package array;

public class Array04 {

	public static void main(String[] args) {
		// String 타입의 배열 5칸 만들기
		// 첫번째 칸에 이름 입력
		
		String[] names = new String[5];
		names[0] = "스누피";
		
		System.out.println(names);
		
		// 자바에서 참조형 주소에 메모리 주소를 표시하는 방법
		// names.hashCode();
		System.out.println("names 객체의 hashCode: " + names.hashCode());
		
		// 16진수로 표시 (2가지 방법)
		// Integer.toHexString(names.hashCode());
		System.out.println("16진수로 변환: " + Integer.toHexString(names.hashCode()));
		System.out.printf("%x", names.hashCode()); // %x 
		
	}

}
