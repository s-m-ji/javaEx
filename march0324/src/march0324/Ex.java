package march0324;

public class Ex {
	public static void main(String[] args) {
		
		// 숫자 3자리마다 , 찍는 방법
		double a = 1000000;
		System.out.printf("%,f", a);
		
		int[] numbers = {5,3,4,2,1};
		// 배열의 값을 정렬하고싶을때? -> 일단 for문을 2개 활용하라고 하심.
		// 방을 바꾸기 위해서 새로운 변수를 선언하고 이용.
		
		int lottoNum;
		for(int num : numbers) {
//			if (num == lottoNum) {
				
			}	
			
		String str = "안녕하세요!!";
		
		// 스트링의 인덱스도 0번부터 시작함
 		System.out.println(str.charAt(0));
 		System.out.println((int)str.charAt(0));
		
		// 문자열 끊기
		System.out.println(str.length());
		System.out.println(str.substring(0,2)); 
		// 문자열의 0번째에서부터 2번째 글자까지 -> 어디부터 어디까지 가져올건지 인덱스값을 기입하는것
		
	}
}
