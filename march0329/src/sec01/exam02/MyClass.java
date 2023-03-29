package sec01.exam02;

import sec01.exam01.Audio;
import sec01.exam01.RemoteControl;
import sec01.exam01.SmartTV;

public class MyClass {
	// 인터페이스는 생성할 수 없지만
	// 인터페이스는 필드, 생성자의 매개변수, 
	// 메소드의 매개변수, 메소드의 로컬변수로 선언할 수 있다. -> 타입으로 쓸 수 있다.
	// ==> 결론은 다형성이다.
	
	// 인터페이스가 필드의 타입으로 선언된 경우
	// 인터페이스의 구현체만 인터페이스를 타입으로 사용할 수 있다.
	// 아래는 접근제한자가 default라서 Application에서 접근할 수 있음 !!!
	RemoteControl rc = new SmartTV();
	
	public MyClass() {
		
	}

	// 매개변수 타입을 RemoteControl로 하여 생성자를 만들었음
	public MyClass(RemoteControl rc) {
		// 매개변수로 받아온 rc를 필드에 저장
		this.rc = rc;
	}
	
	public void methodA() {
		// Audio 객체를 생성하여 Remotecontrol타입으로 변환
		// 인터페이스의 타입으로 지역변수를 생성
		RemoteControl rc = new Audio();
		// 생성된 객체(new Audio)를 필드에 저장
		this.rc = rc;
	}

	public void methodB(RemoteControl rc) {
		// 매개변수로 넘어온 rc를 필드에 저장
		this.rc = rc;
	}

}
