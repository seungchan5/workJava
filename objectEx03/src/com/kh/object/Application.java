package com.kh.object;

import com.kh.object.practice.NonStaticSample;

public class Application {
	public static void main(String[] args) {
		NonStaticSample sample = new NonStaticSample();
		sample.printLottoNumbers();
		
		// char 하나의 글자를 입력
		// ' ' 홑따옴표 안에 입력
		// 하나의 글자를 꼭 입력해야 합니다.
		sample.outputChar(5, 'a');
		sample.alphabette();
		// 				   012 345
		String str= "안녕하세요. 반갑습니다";
		// 문자열을 추출(시작인덱스, 끝인덱스)
		// code123456 -> 상품코드 4자리 추출시 사용
		// System.out.println(str.substring(0, 6));
		// 원하는 위치의 문자열을 추출하여 반환해주므로
		// 원본은 수정되지 않는다.
		sample.mySubstring(str, 0, 2);
		System.out.println("원본 : " + str);
	}
}
