package array;

public class Array13 {

	public static void main(String[] args) {
		int[] scores = {80, 90, 70, 100};
		
		int i=0;
		int sum1=0;
		for(int num1 : scores) {
			sum1 += scores[i];
		}
		
		int sum2=0;
		for(int sc : scores) {
			sum2 += sc;
		}
		
//		System.out.println("점수의 총합: " + sum1);
//		System.out.println("평균 점수: " + sum1/scores.length);
		
		
		int[] points = {1,2,3,4,5};
		
		int sum =0;
		for(int num:points) {
			sum += num;
		}
		System.out.println("sum: " + sum);
		System.out.println("avg: " + sum/points.length);
	}

}
