package sec01.exam04;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone smt = new SmartPhone("구글", "안드로이드");
		String strObj = smt.toString();
		System.out.println(strObj);
		System.out.println(smt);
	}

}
