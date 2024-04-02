package arrayEx;

public class ArrayEx6 {

	public static void main(String[] args) {
		// 2차원 배열
		// 마치 행과열로 구성된 배열
		// 타입[][] 변수명 = 타입[행][열]
		int [][] scores = new int[2][3];
		
		scores[0] = new int[]{1,2,3}; 
		scores[1] = new int[]{4,5,6};
		
		System.out.println("scores.length" + scores.length);
		System.out.println("scores[0]" +scores[0].length);
		System.out.println("scores[1]" +scores[1].length);
		// 변수이름[몇행][몇열]
		System.out.print("scores[0][0] : ");
		System.out.println(scores[0][0]);
		
		for(int i=0; i<scores.length;i++) {
			int[] points = scores[i];
			for(int j=0; j<points.length; j++) {
				System.out.printf("(%d,%d) = %d", i, j, points[j]);
			}
			System.out.println();
		}
	}

}
