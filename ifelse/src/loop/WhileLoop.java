package loop;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 0, sum =0;
		while(i<100) {
			i++;
			sum = sum + i;
			System.out.println("while 문" + i);
		}
		System.out.println("1부터 100까지의 합 : " + sum);
		
	}

}
