package com.chap2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 파일 입-출력을 한번에 작업해봅시당
public class FileIO {
	public static void main(String[] args) {
		FileIO io = new FileIO();
//		io.fileIOCopy();
		io.fileCopy();
	}

	/**
	 * [파일 복사하기]
	 * A_File.java 파일을 읽어서 
	 * A_File_copy.java 파일 생성
	 * ※ 파일 용량이 크면 작업 시간이 오래 걸릴 수 밖에 !
	 */
	public void fileIOCopy() {
		
		 long startTime, endTime;
		 startTime = System.currentTimeMillis();
		
		File file = new File("C:\\Users\\user\\git\\java\\IOEx\\src\\com\\chap1\\A_File.java");
		// 파일의 존재 여부를 먼저 확인 후, 없으면 종료
		if(! file.exists()) {
			System.out.println("파일이 존재하지 않음");
			return;
		}  
		
		// 14_3_입출력관련API.pptx
		// try () 안에는 여러 문장 기입 가능 ;로 구분
		try(FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream("A_File_copy.java");)
		{
			int value=0;
			// 1바이트씩 읽어오는데, -1 EndOfFile
			while((value = fis.read()) != -1) {
//				System.out.print((char)value);
				fos.write(value);
			}
			fos.flush();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		}

		endTime = System.currentTimeMillis();
		System.out.println("작업 소요 시간: " + (endTime - startTime));
	}


	// 파일 복사하기 연습
	/**
	 * FileInputStream으로 파일을 열어서
	 * FileOutPutStream으로 파일을 저장합네당
	 */
	public void fileCopy() {
		long sTime, eTime;
		sTime = System.currentTimeMillis();
		
		File file = new File("C:\\Users\\user\\git\\java\\IOEx\\14_3_입출력관련API.pptx");
		
		if(! file.exists()) {
			System.out.println("파일이 없군요?");
			return;
		}
		
		try(FileInputStream fis = new FileInputStream(file);
				// 복사할 파일은 확장자를 꼭 맞춰줘야함
				FileOutputStream fos = new FileOutputStream("14_3_입출력관련API.copy.pptx");) {
			
			int v =0;
//			while((v=fis.read()) != -1) {
//				fos.write(v);
//			}
			
			// i = byte 배열에 읽어온 갯수를 반환
			int i =0;
			// 배열의 크기를 키울수록 작업 소요시간이 줄어들쥐 !
			byte[] byteArry = new byte[1024];
			while((i = fis.read(byteArry)) != -1) {
				// 읽어온 갯수만큼 write로 출력
				// i만큼 읽어오지 않으면 
				// 마지막 출력 시 배열을 모두 채우지 않을 시
				// 이전에 읽어들인 내용이 같이 출력된다.
				
				// 안녕하세요
				// 바이
				//-> '바이+하세요'가 되는걸 방지
				
				fos.write(byteArry,0,i);
			}
			
			fos.flush();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		eTime = System.currentTimeMillis();
		System.out.println("pptx 파일 복사 소요 시간: "+(eTime - sTime));
	}

}













