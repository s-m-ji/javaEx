package ex;

public class Ex2 {

	public static void main(String[] args) {
			Ex2 sample = new Ex2();
			sample.printLottoNumbers();
		}
		
	public void printLottoNumbers() {
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1; 

			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
		int temp = 0;
		for(int i=0; i<lotto.length; i++) {
			for(int j=i; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		System.out.println("=== Lotto number ===");
		for(int num : lotto) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
