package array;

public class Array12 {
	public static void main(String[] args) {
		String[] newStrArr = new String[5];
//		String[] oldStrArr = {"찰리", "스누피", "우드스톡"};
		String[] oldStrArr = {"그리핀도르", "슬리데린", "후플푸프", "래번클로"};
		
		// java 기본 API에서 제공해주는 메소드를 활용해서 배열을 복사
		// 원본 배열, 옛 배열의 복사를 시작할 index, 신규 배열, 새 배열에 복사를 시작할 index, 복사할 갯수
//		System.arraycopy(oldStrArr, 0, newStrArr, 0, 0);
		System.arraycopy(oldStrArr, 0, newStrArr, 1, oldStrArr.length);
		
		for(int i=0; i<newStrArr.length; i++) {
			System.out.println(newStrArr[i]);
		}
		
		// 향상된 for문
		// (타입 변수명 : 배열명) 
		// 배열의 요소를 모두 순회 : 0 < 배열명.length
		for(String str : newStrArr) {
		}
	}
}
