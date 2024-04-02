package arrayEx;

public class ArrayEx10 {

	public static void main(String[] args) {
		// 배열의 길이를 변경할수 없으므로
		// 배열의 길이를 늘이거나 줄이기 위해서는
		// 새로운 배열을 만들고 기존 배열을 복사한다
		
		// int 타입 배열을 선언
		// 배열의 값 목록{1,2,3}
		int[] oldArr = {1,2,3};
		int[] newArr = {0, 0, 0, 0, 0}; //new int[5];
		
		for(int i=0;i<oldArr.length;i++) {
			newArr[i] = oldArr[i];
			System.out.println("oldArr " +i +" : "+oldArr[i]);
		}
		//newArr 출력
		System.out.println("=========newArr");
		for(int j=0;j<newArr.length;j++) {	
			// System.out.println("newArr" + j + " : "+newArr[j]);
			System.out.println(newArr[j]);
		}
	}
	
}
