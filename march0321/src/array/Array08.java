package array;

public class Array08 {

	public static void main(String[] args) {
		// 2차원 배열 선언
		// new int[행][열];
		int[][] scores = new int[2][3];
		
		// 값을 참조하는 방법 : scores[행 번호][열 번호]
		// 행 참조 -> 변수명[행 번호] = new int[] {값 목록, ...};
		scores[0] = new int[] {1,2,3};
		scores[1] = new int[] {4,5,6};

		//i=행번호, j=열번호
		for(int i=0; i<scores.length; i++) {
			int[] points = scores[i];
			for(int j=0; j<points.length; j++) {
				System.out.println(points[j]);
			}
		}
	}

}
