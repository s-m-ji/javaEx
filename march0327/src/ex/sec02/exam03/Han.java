package ex.sec02.exam03;

public class Han extends Tire {

	public Han(String loca, int max) {
		super(loca, max + 4);
	}
	
	@Override
	public boolean roll() {
		rota++;
		System.out.println("금호 "+loca+" 누적: "+rota);
		System.out.println("금호 "+loca+" 최대: "+max);
		
		if(rota>= max) {
			return true;
		}
		return false;
	}
}
