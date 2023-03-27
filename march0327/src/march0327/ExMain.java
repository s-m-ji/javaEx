package march0327;

public class ExMain {

	public static void main(String[] args) {
		Ex.setValue("hello");
		System.out.println(Ex.getValue());
		Ex.toUpper();
		System.out.println(Ex.getValue());
		
		Ex.setChar(1, 'a');
		System.out.println(Ex.getValue());
		
		System.out.println(Ex.valueLength());
		
		System.out.println(Ex.valueContcat(" 헬로"));
		
	}

}
