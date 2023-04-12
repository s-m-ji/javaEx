package chap05;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum =0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		
		while(run) {
//			try {
				System.out.println("---------------------------------------------");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
				System.out.println("---------------------------------------------");
				
				System.out.println("선택>");
				
				int selectNo = Integer.parseInt(sc.nextLine());
				if(selectNo==1) {
					System.out.println("학생수를 입력");
					studentNum = Integer.parseInt(sc.nextLine());
					System.out.println("학생수>" + studentNum);
					scores = new int[studentNum];	// 학생수만큼 길이를 가진 배열로 만들기
				}
				else if(selectNo==2) {
					System.out.println("점수를 입력");
					for(int i=0; i<scores.length; i++) {
						System.out.println("scores["+i+"]>");
						scores[i] = Integer.parseInt(sc.nextLine());
					}
				}
				else if(selectNo==3) {
					for(int i=0; i<scores.length; i++) {
						System.out.println("scores["+i+"]>"+scores[i]);
					}
				}
				else if(selectNo==4) {
					int max=0;
					int sum=0;
					for(int i=0; i<scores.length; i++) {
						if(max<scores[i]) {
							max = scores[i];
						}
//						max = (max<scores[i])? scores[i] : max;		
						// 위의 if문을 3항연산자로 쓰면 한 줄로 더 간결하게 처리 가능
						sum += scores[i];
					}
					System.out.println("최고 점수: "+ max);
//					System.out.println("최고 점수: "+scores[max]);		// Arrayindexof어쩌고웅앵오류남..
					System.out.println("평균 점수: "+sum/scores.length);
				}
				else if(selectNo==5) {
					run = false;
				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
		} // while(run) 끝
		System.out.println("프로그램 종료");
	}

}
