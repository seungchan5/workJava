package arrayEx;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		// new 연산자로 배열을 생성하는 방법
		// String 타입의 배열을 만들어주세요 총길이는 10으로 생성
		//String[] names = new String[10]; 
		String[] names = {"",""};
		int[] score;
		Scanner scan = new Scanner(System.in);
		System.out.println("몇개의 방을 만들까요?");
		int index = scan.nextInt();
		score = new int[index];
		
		
		names[0] = "홍길동";
		names[1] = "나몰라";
		
		for(int i=0; i<names.length;i++) {
			
			System.out.println(names[i]);
		}
		
		// 타입[] 변수명 = new 타입[길이]; 길이 = 변수명.length
		// 타입에 맞게 기본값으로 초기화 되어 값이 입력된다
		// 정수= 0, 실수 = 0.0, boolean = false, 객체 = null
		// 배열의 방길이는 변하지 않는다 줄이거나 늘일수 없다.
		

	}

}
