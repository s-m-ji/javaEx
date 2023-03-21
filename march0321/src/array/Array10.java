package array;

public class Array10 {
	public static void main(String[] args) {
		String[] names = new String[3];
		names[0] = "Java";
		names[1] = "Java";		
		names[2] = "C++";
		
		// 같은 리터럴을 가지면 if로 출력
		if(names[0] == names[1]) {
			System.out.println("0번 방 == 1번 방");
		} else {
			System.out.println("0번 방 != 1번 방");
		}
		
		// 객체를 생성할 경우 다른 메모리를 참조 -> else if로 출력
		names[0] = new String("Java");
		names[1] = new String("Java");
		
		// 참조타입에서 == : 참조타입의 변수가 가지고 있는 메모리의 주소를 비교
		// equals : 문자열 자체를 비교함
		if(names[0].equals(names[1])) {
			System.out.println("0번 방 == 1번 방");
		} else {
			System.out.println("0번 방 != 1번 방");
		}
			
	}
}
