package exceptionEx;



public class NullpointerException {
	public static void main(String[] args) {
		String str = null;
		// 참조변수가 null값을 가지고 있을 때, 
		// 참조변수로부터 객체접근연산자(.)을 이용해서 접근할 때 발생하는 오류
		// str.toString();
		// 코드 실행하면 오류 처리 뜸
		
		// 1. try-catch문으로 예외를 처리해주거나
		try {
			str.toString();
			print(str); // 예외를 넘긴 친구도 try 안에 넣어서 처리시킴
		} catch (Exception e) {
			System.out.println("오류가 발생하였다.");
		}
		
		// 예외처리 : 프로그램이 정상 종료될 수 있도록 처리 
		System.out.println("프로그램이 정상적으로 종료되었다.");
		
		// 2. 예외가 발생하면 나를 호출한 쪽으로 예외를 위임
		// str.toString()에 null이 들어가있어서 
		// print(str)에 예외가 생김
		// print(str);
	}
	
	// Exception 최상위 오류 클래스
	// 일반 예외 (exception)
	// 실행 예외 (runtime exception) -> 이 친구를 상속받으면 다 이 성질이 된다구웅 그래서 크게 2가지로 나뉜다고합네당
	public static void print(String str) throws Exception {
		// System.out.println(str.toString());
		
		throw new Exception("강제 오류 발생 삐용삐용");
	}
}
