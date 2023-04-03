package com.chap1;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCharStream {
	public static void main(String[] args) {
		FileCharStream fcs = new FileCharStream();
		fcs.fileSave();
		fcs.fileRead();
	}
	
	public void fileRead() {
		try(FileReader fr = new FileReader("b_char.txt")) {
			int value=0;
			while((value = fr.read()) != -1) {
				System.out.println((char)value);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void fileSave() {
		
		// 리소스를 자동으로 close()
		// FileWriter를 이용하여 파일을 생성하고 데이터를 문자 단위로 저장
		try(FileWriter fw = new FileWriter("b_char.txt")) {
			fw.write("IO 어떤가요.....");
			fw.write("끝인가요.....");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');
			fw.write(new char[] {'e','p','i','k'});
			
			fw.flush();
		
		} catch (Exception e) {

		} finally {
			System.out.println("fileSave() 종료");
		}
	}
}
