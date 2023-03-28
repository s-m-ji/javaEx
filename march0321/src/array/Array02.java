package array;

public class Array02 {
	public static void main(String[] args) {
		// 배열을 생성
		String[] names = {"베", "르1", "나", "르2"};
		
		// 반복문을 이용해서 배열에 입력된 값을 출력
		for(int i=0; i<names.length; i++) {
			// 배열의 값에 접근 : 변수명[index]
//			System.out.println(names); // -> 배열의 참조형 어쩌고만 반복해서 보여줌
			System.out.println(names[i]); // -> {값목록}에 담긴 글자를 하나씩 개행해서 보여줌
		}
		
		/*
		double[] score = {1.1 + 2.2 + 3.3 + 4.4 + 5.5 + 6.6 + 7.7 + 8.8 + 9.9};
		double sum =0;
		double j = score.length;
		for(int i=0; i<j; i++) {
//			sum += score[i];
			System.out.println(score[i]);
		}
//		System.out.println("총합: " + sum);
		System.out.println("평균: " + sum/j);
		*/
	
	
	double[] Score = {90, 80, 70, 60, 50, 40, 30, 70, 80, 90}; 
	
	System.out.println("4번째 값은? " + Score[3]);

	double j = Score.length;
	System.out.println("배열의 길이는? " + j);
	
	double sum = 0;
	for(int i=0; i<j; i++) { 
		// double i=0; (X) -> index는 무조건 int(정수)타입만 가능함
		sum += Score[i];
	}
	System.out.println("합계는? " + sum);
	System.out.println("평균은? " + sum/j);
	
	
	
	}
	
	
	
}





