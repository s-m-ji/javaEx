package sec01.exam05;

class A{}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends B {}

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 타입 - 부모타입으로 자동형변환
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
	}
}
