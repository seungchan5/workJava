package com.chapter1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteStreamEx {
	public static void main(String[] args) {
		FileByteStreamEx ex= new FileByteStreamEx();
		
		ex.fileSave();
		ex.fileRead();
	}
	public void fileRead() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a_byte.dat");
			/*
			 * 파일로부터 데이터를 읽어올 때는 read() 메소드를 사용하면 된다.
			 * 하지만 실제로 파일에는 얼마만큼의 데이터가 있는지 모른다.
			 * read() 메소드는 더 이상 읽어올 데이터가 없으면 -1을 리턴한다.
			 * 따라서 반복문을 사용해서 read() 메소드에서 -1이 리턴되기 전까지
			 * 데이터를 읽어오면 된다.
			 */
			int value = 0;
			value = fis.read();
			System.out.println(value);
			// 데이터를 읽어서 value 변수에 저장
			// -1 : 문장의 끝
			while((value = fis.read()) != -1) {
				System.out.print((char)value);
			}
			
//			while(fis.read() != -1) {
//				value = fis.read();
//				if(value==-1) {
//					break;
//				}
//				System.out.println((char)value);
//			}
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
		FileOutputStream fos = null;
		System.out.println("파일 저장 실행");
		try {
			// 프로젝트 내부에 파일 생성
			fos = new FileOutputStream("a_byte.dat");
			fos.write(97); // a 저장
			fos.write('b'); //b 저장
			fos.write(10);
			//fos.write('한');
			
			byte[] byteArray = {'a','b','c','d'};
			fos.write(byteArray);
			fos.write(10);
			// (배열, 시작 인덱스, 개수)
			fos.write(byteArray, 1, 2);
			
			fos.flush();

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
			
		} finally {
			// 사용중인 자원이 있다면 종료시켜준다.
			if(fos != null) {
				try {
					// 스트림을 이용했으면 닫아 주어야 한다.
					fos.close();
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
			}
		}
		
	}
	
	
	
}
