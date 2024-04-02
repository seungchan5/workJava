package ifelse;

public class Rotto {

	public static void main(String[] args) {
		// 1부터 45까지의 수중에서
		// 무작위로 5개의 숫자를 출력
//		for(int i=0; i<=5; i++ ) {
//		int rotto = (int)(Math.random()*45)+1;
//		System.out.println(rotto);
//		}
//		System.out.println("=========");
		int j=0;
		while(true) {
			int num = (int)(Math.random()*45+1);
			System.out.println(num+" ");
			
			//카운트
			j++;
			
			if(j==5) {
				break;
			}
		}
	}

}
