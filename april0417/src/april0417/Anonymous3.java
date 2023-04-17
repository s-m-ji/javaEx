package april0417;

public class Anonymous3 {
	Vehicle feild = new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("자전거가 달립니댕");
		}
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("승용차가 달립니댕");
				
			}
		};
		localVar.run();
	}

	void method2(Vehicle v) {
		v.run();
	}


	public static void main(String[] args) {
		Anonymous3 anm = new Anonymous3();
		anm.feild.run();
		anm.method1();
		anm.method2(new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("트럭이 달립니댕");
				
			}
		});
	}




}



