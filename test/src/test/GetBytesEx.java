package test;

import java.io.UnsupportedEncodingException;

public class GetBytesEx {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "hello";
		
		// str객체가 가진 문자열을 바이트 배열로 변환
		
		byte[] bytes = str.getBytes(); 
		// byte[] bytes = "문자열".getBytes() 
		// 시스템의 기본 문자셋으로 인코딩된 바이트 배열 반환

		byte[] bytes1 = str.getBytes("euc-kr");
		// byte[] bytes = "문자열".getBytes(Charset charset) 
		// 특정 문자셋으로 인코딩된 바이트 배열 반환
		
		String restr = new String(bytes);
		// String 변수명 = new String(byte[] bytes) 
		// 기본 문자셋으로 인코딩한 바이트 배열을 다시 문자열로 디코딩하여 반환
		
		String restr1 = new String(bytes1, "euc-kr");
		// String 변수명 = new String(byte[] bytes, String charsetName) 
		// 특정 문자셋으로 인코딩된 바이트 배열을 다시 특정 문자셋으로 디코딩하여 반환
		
		System.out.println(bytes);
		System.out.println(bytes1);
		System.out.println(restr);
		System.out.println(restr1);
	}
}