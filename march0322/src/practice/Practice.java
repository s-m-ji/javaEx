package practice;

public class Practice {

	public static void main(String[] args) {
		int[] scores = {60, 70, 90, 95};
		int i = 0;
		int sum = 0;
		for(i=0; i<scores.length; i++) {
//			System.out.println("학생의 점수는: " + scores[i]);
			sum += scores[i];
		}
//		System.out.println("점수의 총 합은: " + sum);
//		System.out.println("평균 점수는: " + sum/scores.length);
		
		String[] names = new String[2];
		names[0] = "hello";
		names[1] = "bye";
		for(int j=0; j<names.length; j++) {
//			System.out.println(names.hashCode());
		}
		
//		System.exit(0);
		
		int[][] array = new int[3][5];
		array[0] = new int[] {1,2,3};
		array[1] = new int[] {4,5,6,7};
		
		for(int a=0; a<array.length; a++) {
			int Arr[] = array[a];
			for(int b=0; b<Arr.length; b++) {
				System.out.printf("(%d, %d)=%d\n", a,b,Arr[b]);
			}
		}
		
	}

}
