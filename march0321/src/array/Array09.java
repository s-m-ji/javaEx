package array;

public class Array09 {

	public static void main(String[] args) {
		int [][] scores = new int[2][];
		scores[0] = new int[] {1,2,3};
		scores[1] = new int[] {1,2};
		
		// scores의 방의 갯수를 확인
		for(int i=0; i<scores.length; i++) {
//			System.out.println("방 번호" + i);
//			System.out.println("int 배열의 길이" + scores[i].length);
			int[] points = scores[i]; 
			
			for(int j=0; j<points.length; j++) {
				// 2차원 배열에서 값에 접근하는 방법
//				System.out.printf("(%d, %d)%d\n", i,j,points[j]);
//				System.out.println(scores[i][j]);
			}
		}
		
		String[][] Scores = {{"도","레"},{"미","파"}};
		String Score1 = Scores[1][0];
		System.out.println(Score1);
		
		
	}

}
