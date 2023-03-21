package m0320;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 1) {
				sum += i;
			}
			continue;
		}		
		System.out.println(sum);
		
		Outter:
		for(char j='A'; j<='Z'; j++) {
			for(char k='a'; k<='z'; k++) {
				System.out.println(j+", "+k );
				if(k == 'c') {
					break Outter;
				}
			}
		}
		
		while(true) {
			int num = (int)(Math.random()*6 +1);
			System.out.println(num);
			if(num == 6) {
				break;
			}
		} System.out.println("종료");
		
		int N = 1;
		int Sum = 0;
		while(N<=100) {
//			System.out.println(N);
			N += 1;
			Sum += N;
		}
		System.out.println(Sum);
		
		int s = 1;
		while(s<=10) {
			System.out.println(s);
			s++;
		}
		
		for(int a=2; a<=9; a++) {
			System.out.println(a + "단");
			for(int b=1; b<=9; b++) {
				int r = a*b;
//				System.out.println(a+"*"+b+"="+r);	
				System.out.printf("%d*%d*=%d\n", a,b,r);
			}
		}
		
		for(int x=1; x<=20; x++) {
			for(int y=1; y<=x; y++) {
				System.out.printf("1");
			}
			System.out.println();
		}
		
		for(int p=1; p<=20; p++) {
			for(int q=20; q>=p; q--) {
				if(p<=q) {
					System.out.printf("1");
				} else {
				System.out.printf(" ");
				}
			} System.out.println();
		}
		
		for(int e=1; e<=20; e++) {
			for(int f=20; f>0; f--) {
				if (e>=f) {
					System.out.printf("1");
				} else {
					System.out.printf(" ");
				}
			}System.out.println();
		}
		
		for(int u=1; u<=20; u++) {
			for(int p=20; u<=p; p--) {
				if(!(p==u)) {
					System.out.printf("1");
				} else {
					System.out.printf(" ");
				}
			} System.out.println();
		}
		
	}
}
