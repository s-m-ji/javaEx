package sec02.exam03;

public class Car {
	// 초기값 : null
	private Tire tireFR; // 앞-오른쪽 바퀴
	private Tire tireFL;
	private Tire tireBR;
	private Tire tireBL;
	
	/*
	 // 생성 방법 1.
	public Car(){
		// 생성자
		// 타이어 필드를 초기화 : n회전 가능한 타이어 
		tireFR = new Tire("FR", 3);
		tireFL = new Tire("FL", 2);
		tireBR = new Tire("BR", 1);
		tireBL = new Tire("BL", 10);

	}
	 */
	
	// 생성 방법 2. 
	public Car(Tire tire1, Tire tire2, Tire tire3, Tire tire4){
		// 생성자
		// 타이어 필드를 초기화 : n회전 가능한 타이어 
		tireFR = tire1;
		tireFL = tire2;
		tireBR = tire3;
		tireBL = tire4;

	}
	
	/**
	 * 바퀴가 굴러갑니다.
	 * @return
	 */
	public int run() {
		System.out.println("부릉부릉..........");
		boolean next = tireFR.roll();
		// 타이어 교체
		if(!next) {
			System.out.println("====== " + tireFR.location + "타이어 교체");
			// tire = new Tire(null, 3);
			// 다형성에 의해 자식객체는 부모 타입으로 자동형변환 되었음 ~~~
			// tireFR = new KumhoTire(tireFR.location, 3);
			System.out.println();
			return 1; 
			// 하지만 return을 만나면 아래 다른 바퀴들 if문은 실행되지 않고 종료되어버림.
		}
		
		if(!tireFL.roll()) {
			System.out.println("====== " + tireFL.location + "타이어 교체");
			// tireFL = new KumhoTire(tireFL.location, 6); 
			System.out.println();
			return 2;
		}
		
		if(!tireBR.roll()) {
			System.out.println("====== " + tireBR.location + "타이어 교체");
			// tireBR = new KumhoTire(tireBR.location, 7);
			System.out.println();
			return 3;
		}
		
		if(!tireBL.roll()) {
			System.out.println("====== " + tireBL.location + "타이어 교체");
			// tireBL = new KumhoTire(tireBL.location, 8);
			System.out.println();
			return 4;
		}
		return 0;
	}
	
	// 반복되는 기능을 정리하기 위해서 메소드를 하나 생성하였음.
	/**
	 * 바퀴의 위치를 매개변수로 받아서 해당 위치의 바퀴를 교체합니다.
	 * @param location
	 */
	public void changeTire(int location) {
		switch (location) {
		case 1:
			 tireFR = new KumhoTire(tireFR.location, 3);
			break;

		case 2:
			tireFL = new KumhoTire(tireFL.location, 3); 
			break;
			
		case 3:
			tireBR = new KumhoTire(tireBR.location, 3);
			break;
			
		case 4:
			tireBL = new KumhoTire(tireBL.location, 3);
			break;
		}
	}
}































