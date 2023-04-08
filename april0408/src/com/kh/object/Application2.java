package com.kh.object;

import com.kh.object.practice.NonStaticSample;

public class Application2 {

	public static void main(String[] args) {
		NonStaticSample nss = new NonStaticSample(); 
		
		System.out.println("=== printLottoNumbers ===");
		nss.printLottoNumbers();
		
		System.out.println("=== outputChar ===");
		nss.outputChar(10, 'a');
		
		System.out.println("=== alphabette ===");
		nss.alphabette();
		
		System.out.println("=== mySubstring ===");
		System.out.println(nss.mySubstring("appleBanana", 1, 5));
		
	}

}
