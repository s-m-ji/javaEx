package array;

public class ArrayIndexOutOfBoundsEx {
	public static void main(String[] args) {
		// 배열의 인덱스는 0부터 시작
		// 배열의 총길이는 갯수를 반환
		// 배열의 index를 초과하는 방번호가 입력된 경우
		// -> 오류 발생
		// int sum = score[3]; // 인덱스3은 나올 수 없음
		
		// 배열 선언
		int[] score;
		// 배열 선언 후 중괄호 사용하여 값을 입력하면 ?
		// score = {10, 20, 30}; 오류 발생
		
		// 배열 선언 후 생성하는 방법 1)
		// 변수명 = new 타입[] {값 목록};
		// score = new int[] {};
		score = new int[] {10, 20, 30};
		
		// 배열 선언 후 생성하는 방법 2)
		// 값 목록이 없지만 미리 배열을 만드는 경우
		// 타입[] 변수 = new 타입[길이]
		score = new int[10];
//		System.out.println("int 타입을 넣을 10개의 저장공간을 생성"); -> 알아서 0으로 초기화하여 보여줌
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);			
		}
		
		
		
	}
}
