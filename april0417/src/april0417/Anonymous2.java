package april0417;

public class Anonymous2 {
	Worker field = new Worker() {
		@Override
		public void start() {
			System.out.println("디자인을 합니댕");
		};
		
	};
	
	void method1() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("개발을 합니댕");
			}
		};
		localVar.start();
	}
	
	void method2(Worker worker) {
		worker.start();
	}
	
	
	public static void main(String[] args) {
		Anonymous2 anm = new Anonymous2();
		anm.field.start();
		anm.method1();
		anm.method2(new Worker() {
			@Override
			public void start() {
				System.out.println("테스트를 합니댕");
			}
		});
	}
}
