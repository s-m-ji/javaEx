package march0327;

public class Ex {
	private static String value;
	public static void toUpper() {
		value = value.toUpperCase();
	}
	public static void setChar(int index, char c) {
		char[] charArr = value.toCharArray();
		charArr[index] = c;
		value = String.valueOf(charArr);
	}
	public static int valueLength() {
		return value.length();
	}
	public static String valueContcat(String str) {
		return value.concat(str);
	}
	public static String getValue() {
		return value;
	}
	public static void setValue(String value) {
		Ex.value = value;
	}
	
	
	
	
}
