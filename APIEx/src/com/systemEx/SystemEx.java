package com.systemEx;

public class SystemEx {
	public static void main(String[] args) throws InterruptedException {
		// 수행시간 구하기
		Long startTime =  System.currentTimeMillis();
		
		// System이 가진 여러 메소드
		// System.in -> 입력 받을 때
		// System.out -> 출력할 때
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += i;
			if(i==4) {
				// 결과를 내기 전에 JVM 강제 종료
				System.exit(0);
			}
			// 1초 대기
			Thread.sleep(1000);
		}
		
		System.out.println("sum: " + sum);
		
		Long endTime = System.currentTimeMillis();
		
		System.out.println("수행시간은 "
						+ (endTime - startTime)/1000 // 1/1000초라서 나누기해야함
						+ "초 소요되었다.");
	}
}
