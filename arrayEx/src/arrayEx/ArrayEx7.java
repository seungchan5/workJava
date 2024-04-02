package arrayEx;

public class ArrayEx7 {
	public static void main(String[] args) {
		
		// 이차원 배열 선언
		// new int[행][열]
		int[][] scores = new int[2][3];
		
		// 행에 배열을 생성해서 넣어준다
		// 변수명[행번호] = new int[]{값 목록,...};
		scores[0] = new int[]{1,2,3};
		scores[1] = new int[]{4,5,6};
		
		// 값을 가지고 오는 방법
		// 변수명[행번호][열번호]
		// i = 행번호, j = 열번호
		for(int i=0;i<scores.length;i++) {
			int[] points = scores[i];
			for(int j=0;j<points.length;j++) {
				System.out.println(points[j]);
			}
		}
		
	}
}
