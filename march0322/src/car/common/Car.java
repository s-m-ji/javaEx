package car.common;

public class Car {
	// 생성자 오버로딩
	// 매개변수의 타입, 개수, 순서가 다른 여러개를 선언
	
	// 생성자의 특징
	// 클래스명과 동일, 리턴 타입이 없음
	
	String model;
	String color;
	int maxSpeed;
	
	// this. : 필드
	// this() : 생성자
	// 생성자를 사용하기 위해서 매개변수에 알맞은 파라미터를 넣어준다
	
	public Car() {
		// 생성자 호출
		this("기본 모델", "블랙", 150); // 초기값으로 임의의 값을 넣음
		// 임의 설정하지 않는다면 null, null, 0이 초기값
	} // 기본생성자
	
	public Car(String model) {
		this(model, "", 150); // model을 제외한 다른 값은 임의로 넣음
		// this.model = model;
	} // 오버로딩
	
	public Car(String model, String color) {
		// 생성자를 호출하는 것은 첫번째 줄에서만 가능함
		this(model, color, 150);
//		this.model = model; 
//		this.color = color;
	} // 오버로딩
	
	// 상단의 다른 생성자들은 지금 이 친구를 호출하고 있음 : 모든 필드를 다 갖고있으므로.
	public Car(String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	} // 오버로딩
	
	public Car(String model, int maxspeed) {
		this(model, "무지개", 0);
//		this.model = model;
//		this.maxSpeed = maxSpeed;
	}
	
//	public Car(String model) {
//		model = model; -> 아무런 의미가 없음
//		this.model = model; -> 그래서 이렇게 this를 넣어줘야함
//	} 
	
}
