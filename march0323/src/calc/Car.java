package calc;

public class Car {
	// 필드
	public int gas;
	
	// 생성자 : gas 초기화
	
	/* // 이렇게 접근제한자를 명시하지 않으면 default로 설정됨.
	Car(){
	}
	*/
	
	public Car(int gas) {
		this.gas = gas;
	}
	
	public void run() {
		while(true) {
			if(gas>0) {
				gas -= 1; // gas--; // gas = gas-1; 
				System.out.println("주행");
				System.out.println("남은 기름양: " + gas);
				if(gas == 0) {
					return; // 이렇게 바로 실행 종료할 수도 있음.
				}
			} else {
				System.out.println();
				System.out.println("====== 주유하세요우 ======");
				System.out.println("남은 기름양: " + gas);
				// break; 반복문을 탈출
				return;	// 메소드를 강제 종료
			}
		}
	}

	// boolean 타입이 리턴인 경우에는 메소드의 이름이 is~로 되는 경우 多
	// 기름 양이 0이면 false를 리턴
	public boolean isLeftGas() {
		if(gas>0) {
			return true;
		} else {
			return false;
		}
	}

	// "주행" 출력
	public void run2() {
		System.out.println("주행");
		// 내부 메소드 호출하기
		stop();
		// 매개변수의 이름,갯수가 일치하는 메소드를 찾아서 실행함
		sound("삐용삐용");
	}
	
	public void stop() {
		System.out.println("정지");
	}
	
	public void sound(String sound) {
		System.out.println("빵빵");
		
	}
	

}

