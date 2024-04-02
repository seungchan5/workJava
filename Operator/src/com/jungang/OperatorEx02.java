package com.jungang;

public class OperatorEx02 {

	public static void main(String[] args) {
		int x = 10, y = 5, z = 3;
		
		// 삼항연산자
		// (조건)?참:거짓
		int score = 75;
		String res = (score>90)?"A":(score>80?"B":"C");
		System.out.println(res);
		
		int res1 = 1;
		String s = (true)?"정상":"비정상";
		if(true) {
			res1 = 0;
			s = "정상";
		} else {
			s="정상";
		}
		
		// 대입연산자
		// 왼쪽의 값을 오른쪽에 대입
		x=10;
		x+=10; // x=x+10
		x*=10; // x=x*10
		x%=10; // x=x%10
		
		boolean t = true;
		t|=false; //t = true | false
		
		// 그리고 두개의 항이 모두 true 일때
		// true true
		// & : 두항 모두 연산하고 비교 한다
		// && : 첫번째 항이 false일 경우 두번째 항은 확인하지 않는다
		if(x>y && x>z) {
			
		}
		// 또는 두개의 항중 하나만 true여도 true
		// | : 두항 모두 연산하고 비교한다
		// || : 첫번째 항이 true일 경우 두번째 항은 확인하지 않는다
		if(x>y || x>z) {
			
		}

	}

}
