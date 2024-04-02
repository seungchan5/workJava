package arrayEx;

public class ArrayEx2_1 {

	public static void main(String[] args) {
		int[] score = {10, 20, 30, 40 , 50};
		
		int sum = 0;
		for(int i = 0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("합계 = "+sum);
		System.out.println("평균 = "+ (sum/score.length));
	}

}
