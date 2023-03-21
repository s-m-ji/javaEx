package array;

public class Array07 {

	public static void main(String[] args) {
		// 2차원 배열
		// 타입[행][열] 변수명 = 타입[행][열];
		// 마치 행과 열로 구성된 배열
		
		// 변수명[n행][n열]
		int[][] scores = new int[2][3]; 
		
		scores[0] = new int[] {1,2,3} ;
		scores[1] = new int[] {4,5,6} ;
		
//		System.out.println("scores.length는? " + scores.length);
//		System.out.println("scores[0]는? " + scores[0].length);
//		System.out.println("scores[1]는? " + scores[1].length);
//		
//		System.out.println("scores[0][0]는? " + scores[0][0]);
//		System.out.println("scores[1][0]는? " + scores[1][0]);
//		System.out.println("scores[1][2]는? " + scores[1][2]);
		
		for(int i=0; i<scores.length; i++) {
			int[] points = scores[i];
			for(int j=0; j<points.length; j++) {
				System.out.printf("(%d,%d)=%d", i, j, points[j]);
				// System.out.printf("(%d,%d)=%d" + i, j, points[j]);
				// -> + 기호를 넣어버리면 문자열 더하기가 되므로 X
			}
			System.out.println(); // 개행
		}
		
	}

}
