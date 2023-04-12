package chap05;

import java.util.Arrays;

public class Exercise05 {

	public static void main(String[] args) {
		int[][] array= {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		
		int sum=0;
		double avg =0.0;
		
		/*	===== 내가 작성한 잘못된 값..! 실제 계산기로 총합/평균을 구해보면 아예 다른 값이 도출된다. ===
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<i; j++) {
				sum += array[i][j];
			}
		}
		avg = sum/array.length;
		*/
		
		int count=0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
				System.out.println("array["+i+"]["+j+"] ="+ array[i][j]);
			}
		}
		avg = (double) sum/count; // sum,count가 처음에 int형으로 선언되었기때문에 초기 연산 결과가 int로 나온다. 그래서 double로 형변환 해줘야함..!
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
	}

}
