package ex;

public class Ex1 {

	public static void main(String[] args) {
		 int dan = 3; 
		 while (true) { 
			 if(dan%2 == 1) {
				 System.out.println("=== " + dan + "단 ===");
			 }
			 for (int i = 1; i < 10; i++) {
				 if(dan%2 == 0) {
					 break;
				 }
			  System.out.printf("%d*%d=%d\n", dan, i, dan * i); 
			 } dan++; 
			 System.out.println(); // 개행용
			 if (dan == 10) { break; } 
		 }
	}
}
