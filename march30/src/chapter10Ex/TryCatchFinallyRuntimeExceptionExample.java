package chapter10Ex;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String d1 = null;
		String d2 = null;
		try {
			d1 = args[0];
			d2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("실행 매개값의 수가 부족하다");
		} finally {
			System.out.println("다시 실행해달라");
		}
		
		// d1 = args[0];
		// d2 = args[1];
	}
}
