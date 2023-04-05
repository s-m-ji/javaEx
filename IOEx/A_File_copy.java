package com.chap1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A_File {
	public static void main(String[] args) throws IOException {
		// 메인메소드에서 method1을 실행하기 위해 객체를 생성
		A_File aF = new A_File();
//		aF.method1();
		aF.method2();
	}
	
	public void method2() {
//		File file = new File("d:/test2.txt");
		File file = new File("d:/test/test2.txt");
		File dir = new File("d:/test" , "d:/test2");
		try {
			// 디렉토리 만들기
			dir.mkdir(); // 경로 내 디렉토리 하나 생성
			// -> 만들고자하는 디렉토리의 상위 디렉토리가 존재하지 않을 경우 생성 불가
//			dir.mkdirs(); // 경로 내 디렉토리 여러개 생성
			// -> 만들고자하는 디렉토리의 상위 디렉토리가 존재하지 않을 경우, 상위 디렉토리가지 생성
			
			// 파일 생성
			file.createNewFile();
			
		} catch (IOException e) {
			System.out.println(e.getMessage()); // -> 예외처리 메세지를 출력해줌 "지정된 경로를 찾을 수 없웅앵웅"
		}
	}
	
	
	public void method1() throws IOException {
		// 별도의 경로를 지정하지 않으면 현재 플젝 안에 파일을 생성해준다.
		// 현재는 메모리상에만 존재하기에
		File file = new File("test.txt");
		
		System.out.println("파일명: " + file.getName());
		System.out.println("절대 경로: " + file.getAbsolutePath());
		System.out.println("상대 경로: " + file.getPath()); // 현재 프로젝트를 기준으로 한 경로
		System.out.println("파일 용량: " + file.length());
		System.out.println("파일 존재여부: " + file.exists());

		// 이건 그냥 내가 해본 테스트
		FileReader reader = new FileReader("test.txt");
		 int ch;
	        while ((ch = reader.read()) != -1) {
	            System.out.print((char) ch);
	        }
	        
		// 실제 파일을 생성
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
