package exceptionEx;

import java.io.IOException;

public class B_Throws {
	public static void method1() throws Exception, IOException {
		// 이렇게 각각 불러서 처리할 수도 있음 
		// public void method1() throws Exception {
		
		System.out.println("method1() 호출 얍얍");
		// 1~3까지 임의의 정수를 추출
		int num = (int)(Math.random()*3+1);
		if(num == 1) {
			throw new Exception();
		} else if(num == 2) {
			throw new IOException();
		} else if(num == 3) {
			throw new NullPointerException();
		}
		// 2,3의 오류들은 Exception (최상위 클래스)를 상속 받아서 만들어진 것
		
		
	}
	
	public static void method2() {
		System.out.println("method2()에서 method1() 호출 얍얍");
		
		// 어떤 종류의 예외가 발생했는지 확인 후 종류에 따라 다르게 처리
		// 오류 처리 시에는 이렇게 정확하게 해주는게 더 좋단당
		try {
			method1();
		} catch (IOException e) {
			System.out.println("파일 입/출력 도중 오류 발생");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
		
		System.out.println("method1() 종료 얍얍");
	}

	public void method3() {
		
	}
	
	public static void main(String[] args) {
		// method1();
		method2();
	}
}
