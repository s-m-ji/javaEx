package april0411;

public class Ex {
	public static void main(String[] args) {
		int top = 5;
		int bottom = 10;
		int height = 7;
		double area = ((top+bottom)*height)/2; // int로 연산된 결과 값 52가 double로 자동형변환 되면서 52.0 
		double area2 = ((top+bottom)*height)/2.0; // double로 연산되면서 결과 값이 52.5가 나옴 
		System.out.println(area);
		System.out.println(area2);
	}
}
