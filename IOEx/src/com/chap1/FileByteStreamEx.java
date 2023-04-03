package com.chap1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteStreamEx {
	public static void main(String[] args) {
		FileByteStreamEx ex = new FileByteStreamEx();
		ex.fileSave();
		ex.fileRead();
	}
	
	public void fileRead() {
		// try { } 블록 안에만 있으면 fis를 finally { }에서 쓸 수가 없어서 이렇게 밖으로 분기함 
		FileInputStream fis = null; 
		System.out.println("fileRead 실행 ~~~ ");
		try {
			fis = new FileInputStream("a_byte.dat");
			
			/*
			 * 파일로부터 데이터를 읽어올 때는 read() 메소드 사용
			 * 하지만 실제로 얼만큼의 파일 데이터가 있는지 모르기에
			 * read() 메소드는 더 이상 읽어올 데이터가 없으면 -1을 리턴함
			 * 따라서 반복문을 사용해서 read()메소드에서 -1이 리턴되기 전까지만 데이터를 읽어오면 된당
			 */
			int value=0;
			// 데이터를 읽어서 value변수에 저장
			// -1 : 문장의 끝 => -1이 아닐때까지만 값을 읽어오는 반복문
			while((value = fis.read()) != -1) {
				System.out.print((char)value);
			}

			while(fis.read() != -1) {
				System.out.println(fis.read()); 
			}
			
			while(true){
				value = fis.read();
				if(value == -1) {
					break;
				}
				System.out.print((char)value);
			}
			
//			value = fis.read();
//			System.out.println(value); // -> 한 글자만 읽어옴

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		
		} catch (IOException e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void fileSave() {
		FileOutputStream fos = null; // 처음 초기값
		System.out.println("fileSave 실행 ~~~ ");
		try {
			fos = new FileOutputStream("a_byte.dat");
			fos.write(97); // a 저장
			fos.write('b'); // b 저장
			fos.write(10);
//			fos.write('강'); // 문자기반 스트림이라서 한글은 정상 출력되지않음
			
			
			byte[] byteArry = {'x', 'y', 'z', 'v'};
			fos.write(byteArry);
			fos.write(10);
			fos.write(byteArry, 1, 2); // 배열, 시작인덱스, 갯수 (-> 인덱스 1부터 2개)
			// *** 여기까지는 버퍼 공간에만 있지 실제 파일로 저장된 것은 아님
			
			fos.flush(); // -> 그래서 이렇게 저~장~을 해줘야함
//			fos.close(); // -> 만약 아래 finally처럼 클로즈를 안했다면 여기에라도 기입을 !
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
			// 사용중인 자원이 있다면 종료시켜줍네당 -> 스트림을 이용했으면 닫아주어야함
		} finally { 
			if(fos != null) {
				try { // close할 때에도 오류가 발생할 수 있기에 try문으로 감싸준다
					fos.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
