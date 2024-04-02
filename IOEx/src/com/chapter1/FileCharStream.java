package com.chapter1;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCharStream {
	public static void main(String[] args) {
		FileCharStream fcs = new FileCharStream();
		
		//fcs.fileSave();
		fcs.fileRead();
	}
	
	public void fileRead() {
		try(FileReader fr = new FileReader("b_char.txt")) {
			int value = 0;
			// 한글자씩 내용 출력
			//System.out.println((char)fr.read());
			
			// 반복해서 전체 내용 출력
			while((value = fr.read()) !=-1) {
				System.out.print((char)value);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void fileSave() {
		
		// 리소스를 자동으로 close()
		// FileWriter를 이용해서 파일을 생성하고
		// 데이터를 문자단위로 저장 한다.
		try(FileWriter fw = new FileWriter("b_char.txt")) {
			fw.write("IO 어떤가\n");
			fw.write("혼자서도 잘할 수 있다");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');
			fw.write(new char[]{'a','b','c','d'});
			
			fw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("fileSave() 종료");
		}
	}
}
