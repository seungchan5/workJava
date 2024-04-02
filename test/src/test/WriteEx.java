package test;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx {

	public static void main(String[] args) throws Exception {
	
		Writer writer = new FileWriter("d:/test7.txt");
		// 데이터들의 도착지를 test7.txt로 하는 문자 기반 파일 출력 스트림을 생성
		
		char[] array = {'a','b','c','d','e'};
		
		writer.write(array, 1, 4); // 배열에 1번인덱스부터 4개 출력 
		
		writer.flush(); // 출력 버퍼에 잔류하는 모든 문자를 출력
		writer.close(); // 출력 스트림을 닫음
	}
}	


