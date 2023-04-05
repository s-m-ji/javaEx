package com.chap2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * [보조 스트림]
 * 	- 기반 스트림(Input/OutputStream 등등)과 연결된다
 * 	- 여러가지 편리한 기능을 제공해주는 스트림을 말한다
 * 	- 단독으로 외부 매체(파일, 네트워크, 키보드, 모니터 등등)와 데이터를 직접 주고받을 수 없다
 * 	- 기반 스트림을 먼저 생성하고 보조 스트림을 연결해줘야한다
 * 
 *  [성능 향상 보조 스트림] 
 *  - 기반 스트림의 속도를 향상시켜주는 기능을 한다
 *  - 기반 스트림에 대한 레퍼런스가 필요하다
 *  - 버퍼라는 공간을 사용해서 속도 향상에 도움을 준다 (버퍼라는 공간에 데이터를 쌓아놨다가 한번에 입/출력 시킴)
 *  - 기반 스트림에서 제공하지 않는 메소드(newLine(), readLine())을 제공해준다.
 */

public class A_BufferedStream {
	public static void main(String[] args) {
		A_BufferedStream bEx = new A_BufferedStream();
		bEx.fileSave();
		bEx.fileRead();
	}
	
	public void fileSave() {
		// 기반스트림 생성
		// true : 이어서 작성 / false : 덮어쓰기(기본값)
		try(FileWriter fw = new FileWriter("c_buffer.txt",true);
				// 보조스트림 생성
				BufferedWriter bw = new BufferedWriter(fw)) {

			// 이렇게 바로 보조에 기반을 생성해도 됩니다.
//		BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt",true))) {
			
			bw.write("안녕하새우");
			bw.newLine();
			bw.write("안녕하모니카");
			
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		// 보조스트림은 단독으로 사용 불가
		// 기반스트림을 생성자의 매개변수로 넣어줘야한다
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {

			// 기반 스트림에서 제공하지 않는 메소드
			// 파일에서 한 줄을 읽어올 때 사용
			// null이 아닐때까지 출력하자는 것
			String str = "";
			while((str = br.readLine()) != null) {
				System.out.println(str);
			} 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
}































