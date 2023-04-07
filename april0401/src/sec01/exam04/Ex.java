package sec01.exam04;

import java.io.IOException;

public class Ex {
	public static void main(String[] args) throws IOException {
		
		for(int i=0; i<10; i++) {
//			System.out.println(i);
			if(i == 5) {
//				break;
			}
		}
//		System.exit(0);
//		System.out.println("종료");
		
		byte[] bytes = new byte[100];
//		System.out.print("입력: ");
		int readyByteNo = System.in.read(bytes);
		String str = new String(bytes, 0, readyByteNo+2); // -2,0,+2를 해도 다 같은 결과가 출력된다..? 일단 패스 흑흑ㄱ흐 
//		System.out.println(str);
		
		
		byte[] bytes2 = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str2 = new String(bytes2);
//		System.out.println(str2);
		

		
	}
}
