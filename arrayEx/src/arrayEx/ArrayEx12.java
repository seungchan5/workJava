package arrayEx;

public class ArrayEx12 {
	public static void main(String[] args) {
		int[] scores= {80, 90, 70, 100};

		//향상된 for문을 이용해서 출력
		//for(타입 변수명 : 배열){}
		int sum = 0;
		for(int data : scores) {
			// 점수의 누계를 구하고 싶어요
			sum += data;
		}
		System.out.println("점수의 총합 : "+sum);
		System.out.println("평균점수 : "+ (sum/scores.length));
	}
}
