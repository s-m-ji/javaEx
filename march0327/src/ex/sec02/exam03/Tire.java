package ex.sec02.exam03;

public class Tire {
	public String loca;
	public int max;
	public int rota;

	public Tire(String loca, int max) {
		this.loca = loca;
		this.max = max;
	}
	
	public boolean roll() {
		rota++;
		System.out.println(loca +"의 누적: "+ rota);
		System.out.println(loca +"의 최대: "+ max);
		
		if(rota >= max) {
			return true;
		}
		return false;
	}
	
	
}
