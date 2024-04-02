package Ex;

public class Ex2 {
	public static void main(String[] args) {
		int[] num = new int[6];
		int temp = 0;
		for(int i = 0; i<num.length; i++) {	
			num[i] = (int)(Math.random()*45+1);
			for(int j=0; j<i; j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<i; j++) {
				if(num[i] < num[j]) {
					temp=num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for(int rotto : num) {
			System.out.println(rotto);
		}
	}
}
