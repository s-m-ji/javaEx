package calc;

public class Calculator {
	// true:켜짐, false:꺼짐
	boolean powerOnOff; // 초기값 = false:꺼짐
	
	/**
	 * 전원을 키거나 끕니다.
	 */
	public void powerOnOff() {
		if(powerOnOff) { // boolean 타입이기 때문에 필드값을 바로 true/false로 활용할 수 있음.
			powerOnOff = false;
			System.out.println("계산기를 종료합니다.");
		} else {
			powerOnOff = true;
			System.out.println("계산기를 실행합니다.");
		}
		
	}
	
	public int add(int x, int y) {
		if(powerOnOff) {
			return x + y;
		} else {
				System.out.println("계산기를 실행해주세요");
			return 0;
		}
	}
	
	public int add(int[] numbers) {
		int sum = 0;
		for(int num : numbers){
			sum += num;
		}
		return sum;
	}
	
	// 배열 형식으로 값을 받아옴
	// 위의 배열 add와 이름이 같으면 오류가 나기에 다른 이름으로 생성함
	public int addFn(int ... numbers){
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		return sum;
	}
}
