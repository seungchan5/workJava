package ifelse;

public class Rotto2 {

	public static void main(String[] args) {

		int r = 0;
		while(true) {
		int rotto = (int)(Math.random()*45+1);
		System.out.print(rotto+" ");
		r++;
		if(r==6) {
			break;
		}
		}
	}

}
