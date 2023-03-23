package exam06;

public class Calculator {
	/**
	 * 정사각형 넓이 구하기
	 * @param width
	 * @return width*width
	 */
	public double areaRectangle(double width) {
		return width*width;
	}
	
	/**
	 * 직사각형 넓이 구하기
	 * @param width
	 * @param height
	 * @return width*height
	 */
	public double areaRectangle(double width, double height) {
		return width*height;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double square = calc.areaRectangle(10.5);
		System.out.printf("정사각형의 넓이는: %.2f",square);
		System.out.println();
		System.out.println("두번째 스퀘어쓰 " + calc.areaRectangle(5.73));
		System.out.println();
		double rectangle = calc.areaRectangle(12, 7);
		System.out.printf("직사각형의 넓이는: %.2f",rectangle);
		System.out.println();
		System.out.println("두번째 렉탱글쓰 " + calc.areaRectangle(2.2, 6));
		
	}
}
