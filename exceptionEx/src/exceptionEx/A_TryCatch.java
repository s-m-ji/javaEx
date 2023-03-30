package exceptionEx;

/**
 * try{
 * 	// 예외가 발생할 수 있는 코드를 작성
 * }catch (Exception e){
 * 	// try 블록에서 예외 발생 시 실행을 멈추고 catch 블록을 실행
 * } finally{
 * 	// 일반적으로는 생략 가능(필수 블록은 아님), 예외 미발생/발생 시 모두 실행되는 블록
 * 	// 필요 시 보통 자원을 반납하는 문장을 작성 : 파일을 계속 사용중이면 안되기 때문에 반납必이라고 하심..
 * }
 * @author user
 *
 */
public class A_TryCatch {
	
	public static void main(String[] args) throws Exception {
		A_TryCatch a = new A_TryCatch();
		// =====> 예외를 처리했을 때
		a.method1();
		// a.method2();
		
		// =====> 예외를 처리하지 않았을 때
		System.out.println("----------------------------");
		a.method3();
	}
	
	public void method3() throws Exception {
		method2();
	}
	
	public void method1() {
		// 오류 발생 소지가 있는 메소드를 t-c로 감싼다
		// 오류 처리를 할 수 있다
		// ==> 프로그램이 강제 종료되지 않고 계속 실행될 수 있도록 함 : 사용자 편의성을 고려함
		
		// * 오류처리 방법 2가지 정리
		// 1. 메소드를 호출한 곳으로 오류 위임 -> 강제 종료의 위험 有
		// 2. try catch 문으로 처리
		try {
			System.out.println("method2() 호출 전");
			method2();
			System.out.println("method2() 호출 후");
			// "~ 호출 후" 는 출력되지 않음 -> 오류 발생 시 즉시 중단
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("method2() 호출 도중 오류 발생");
		} finally {
			// finally 구문은 무조건 실행 ~
			System.out.println("finally 구문은 무조건 실행");
		}
	}

	// 메소드를 호출한 곳으로 예외 처리를 미룸
	public void method2() throws Exception {
		System.out.println("method2 호출 중 예상치 못한 오류 발생 흐긓ㄱ");
		throw new Exception("강제로 예외를 발생시킨다.");
	}
}
