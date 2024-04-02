package test;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx {
	public static void main(String[] args) throws Exception  {
		
		InputStream ips = new FileInputStream("d:/test3.db");
		// 데이터 출발지를 test3.txt로 하는 바이트 기반 파일 입력 스트림을 생성
		
		byte[] array = new byte[5];
		
			int num = ips.read(array, 1, 4);
			// 입력 스트림으로부터 4byte를 읽고 array[1], array[2], array[3], array[4]에 각각 저장
			if (num != -1) { //읽은 문자가 있다면
				for(int i=0; i<array.length; i++) {
					System.out.print(array[i]);	 // 배열 전체를 읽고 출력										
				}
			}
		ips.close(); // 입력 스트림을 닫음
	}
	// 출력 결과 : 01234
}

 