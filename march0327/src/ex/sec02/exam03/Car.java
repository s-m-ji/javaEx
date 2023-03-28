package ex.sec02.exam03;

public class Car {
	private Tire tFR;
	private Tire tFL;
	private Tire tBR;
	private Tire tBL;
	
	public Car(Tire tFR, Tire tFL, Tire tBR, Tire tBL) {
		this.tFR = tFR;
		this.tFL = tFL;
		this.tBR = tBR;
		this.tBL = tBL;
	}
	
	public int run() {
		System.out.println("run() 시작");
		if(tFR.roll()) {
			System.out.println(tFR.loca + "타이어 교체");
			tFR = new Kum(tFR.loca, 2); 
			System.out.println("run() 종료");
		}
		if(tFL.roll()) {
			System.out.println(tFL.loca + "타이어 교체");
			tFL = new Kum(tFL.loca, 3); 
			System.out.println("run() 종료");
		}
		if(tBR.roll()) {
			System.out.println(tBR.loca + "타이어 교체");
			tBR = new Han(tBR.loca, 4); 
			System.out.println("run() 종료");
		}
		if(tBL.roll()) {
			System.out.println(tBL.loca + "타이어 교체");
			tBL = new Han(tBL.loca, 5); 
			System.out.println("run() 종료");
		}
		
		return 0;
	}
}
