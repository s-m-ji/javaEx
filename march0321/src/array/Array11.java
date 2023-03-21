package array;

public class Array11 {

	public static void main(String[] args) {
		// 배열의 길이는 수정할 수 없으므로
		// 배열의 길이를 늘이거나 줄이기 위해서는
		// 새로운 배열을 만들고 기존 배열을 복사한다
		
		int[] oldArr = {1,2,3};
		int[] newArr = new int[5];
		// int[] newArr = {0, 0, 0, 0, 0}; -> 윗줄을 풀어쓰자면.
		
		// oldArr 출력
		for(int i=0; i<oldArr.length; i++) {
//			System.out.println(oldArr[i]);
			newArr[i] = oldArr[i];
			System.out.println(oldArr[i]);
		}
	
		// newArr 출력
		for(int i=0; i<newArr.length; i++) {
			System.out.printf("%d ",newArr[i]);
		}
		
	}

}
