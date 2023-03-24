package package1;

import package2.C;

// 클래스가 여러개여도, public 접근제한자는 1개만 붙일 수 있음
public class A {
	//  C c = new C();
	// private이라서 오류. 만약 C가 public이면 import 가능

	public void method1Call() {
	//	c.method1();
	}
	
	B b = new B();
	
}

class B {
	// default일 경우 같은 패키지에서 호출 가능
	
	B(){
		
	}
}
