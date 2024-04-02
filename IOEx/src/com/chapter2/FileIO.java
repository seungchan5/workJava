package com.chapter2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {
	public static void main(String[] args) {
		FileIO io = new FileIO();
		io.fileIOCopy();
		io.fileCopy();
	}
	/**
	 * 파일 복사하기
	 * 
	 * A_File.java 파일을 읽어서
	 * A_File_copy.java 파일을 생성 합니다.
	 */
	
	public void fileIOCopy() {
		
		long startTime, endTime;
		startTime = System.currentTimeMillis();
		
		File file = new File("D:\\work\\IOEx\\src\\com\\chapter1\\A_File.java");
		// 파일의 존재 여부를 확인 후 존재하지 않으면 종료
		if(!file.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		try(FileInputStream fis = new FileInputStream(file); FileOutputStream fos = new FileOutputStream("A_File_copy.java")) {
			
			int value = 0;
		
			// 1바이트씩 읽어 옵니다.
			// -1 EndOfFile
			int i = 0;
			byte[] byteArr = new byte[1024];
			// i = 바이트 배열에 읽어온 개수를 반환 합니다.
			while( (i=fis.read(byteArr)) != -1) {
				// 읽어온 개수만큼 출력합니다.
				// 마지막 출력시 배열의 개수를 다 채우지 못하면
				// 이전에 읽어들인 내용이 출력됩니다.
				fos.write(byteArr,0,i);
			}
//			while( (value=fis.read()) != -1) {
//				//System.out.print((char)value);
//				fos.write(value);
//			}
			fos.flush();
			
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
		}
		endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime - startTime));
	}
	
	/**
	 * 복사하기 - 복사할 파일을 준비
	 * 
	 * FileInputStream 읽어와서
	 * FileOutputStream 저장하기
	 */
	public void fileCopy( ) {
		// 파일 복사하기
		
		long start, end;
		start = System.currentTimeMillis();
		
		File file2 = new File("D:\\work\\IOEx\\src\\10_1_예외클래스.pptx");
		if(!file2.exists()) {
			System.out.println("파일을 찾을 수 없습니다");
			return;
		}
		try (FileInputStream fis2 = new FileInputStream(file2); FileOutputStream fos2 = new FileOutputStream("예외클래스복사.pptx"))  {
				int some = 0;
				while( (some=fis2.read()) != -1) {
					fos2.write(some);
			}
				fos2.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		System.out.println("ppt복사 소요시간 : "+ (end - start));
	}
}
