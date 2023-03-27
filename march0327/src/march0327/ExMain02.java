package march0327;

public class ExMain02 {

	public static void main(String[] args) {
		Ex.setValue("apple");
		System.out.println(Ex.getValue());
		Ex.toUpper();
		System.out.println(Ex.getValue());
		System.out.println(Ex.valueLength());
		System.out.println(Ex.valueContcat("juice"));
		Ex.setChar(1, 'A');
		System.out.println(Ex.getValue());
		
	}

}
