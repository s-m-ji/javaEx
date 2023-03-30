package exceptionEx;

import java.io.FileNotFoundException;
import java.io.IOException;

public class C_SubClass extends C_SuperClass {
//	@Override
//	// 부모클래스의 메소드보다 상위타입의 예외를 발생시키는 것은 불가능
//	public void method() throws IOException {
//		// 오버라이딩할 경우 'throws IOException' 이 부분도 함께 옴
//		super.method();
//	}
	
//	@Override
//	// 오버라이딩 시 예외를 작성하지 않아도 된다
//	public void method() {
//		// super.method(); //-> 대신 예외가 있는 부모-메소드를 호출하지도 않아야함
//	}
	
	@Override
	// 부모의 예외(IOException)를 상속하는 다른 Exception도 쓸 수 있다.
	public void method() throws FileNotFoundException {
		// super.method();
	}
}
