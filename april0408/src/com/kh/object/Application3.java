package com.kh.object;

import com.kh.object.practice.StaticSample;

public class Application3 {

	public static void main(String[] args) {
		StaticSample.setValue("java");
		
		System.out.println(StaticSample.getValue());
		StaticSample.toUpper();
		System.out.println(StaticSample.getValue());

		StaticSample.setChar(0, 'j');
		System.out.println(StaticSample.getValue());
		
		System.out.println(StaticSample.valueLength());
		
		System.out.println(StaticSample.valueConcat("공부해요"));
	}

}
