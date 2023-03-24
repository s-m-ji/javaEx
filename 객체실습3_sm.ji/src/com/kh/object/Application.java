package com.kh.object;

import com.kh.object.practice.NonStaticSample;

public class Application {

	public static void main(String[] args) {
		NonStaticSample sample = new NonStaticSample();
		
		sample.printLottoNumbers();
//		sample.outputChar(0, 0);
		sample.alphabette();
		sample.mySubstring(null, 0);
		
	}
}
