package arrayEx;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {
		// 배열 선언
		int[] score;
		// 배열을 선언한 후 중괄호를 사용해서 값을 입력하면 오류가 발생
		// score = {10,20,30}; <-- 오류발생
		// 1. 배열 선언후 생성하는 방법 
		// 변수명 = new 타입[] {값 목록, ......};
		score = new int[] {10,20,30};
		
		// 2. 배열 선언후 생성하는 방법 
		// 값의 목록이 없지만 미리 배열을 만드는 경우
		// 타입[] 변수 = new 타입[길이];
		score = new int[10];
		System.out.println("int타입을 저장된 10개의 공간을 만들었다.");
		
		
		// 초기화;조건식;증감식
		for(int i=0; i<score.length;i++) {
			System.out.println(score[i]);
		}
		// java.lang.ArrayIndexOutOfBoundsException
		// 배열의 index는 0부터 시작한다
		// 배열의 총길이는 갯수를 반환한다
		// 배열의 index를 초과하는 방번호가 입력된 경우
		// int sum = score[3]; <- 오류 발생
		
	}

}
