package Ex;

public class Ex1 {
	public static void main(String[] args) {
		
		for(int i=3; i<10; i+=2) {
			System.out.println("========");
			System.out.println(i+"단");
			for(int j=1; j<10; j++) {
				System.out.printf("%d*%d=%d\n", i, j, i*j);
			}
			System.out.println("========");
		} 
	}
}
