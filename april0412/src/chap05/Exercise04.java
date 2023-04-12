package chap05;

public class Exercise04 {
	public static void main(String[] args) {
		/*
		int max = 0;
		int[] array = {1,5,3,8,2};
		// 가장 큰 값을 출력??
		// 배열 값 순서대로 정리
		// 제일 마지막 값을 출력
		int temp =0;
		for(int i=0; i<array.length; i++) {
			// j=0이면 내림차순, j=1이면 오름차순
			for(int j=i; j<array.length; j++) {
				if(array[j] < array[i]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
//		System.out.print(Arrays.toString(array));
		max = array[array.length-1];
		System.out.println("max: " + max);
		*/
		
//		===== 교재 정답 참고... 내가 작성한 코드보다 훨씬 간결하다 ! =====
		int max = 0;
		int[] array = {1,5,3,8,2};
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		System.out.println("max: " + max);
		
	}
}
