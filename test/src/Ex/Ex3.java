package Ex;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("BMI");
		System.out.print("키(m) : ");
		String height = scan.next();
		System.out.print("몸무게(kg) : ");
		String weight = scan.next();
			
		double h = Double.parseDouble(height);
		double w = Double.parseDouble(weight);
			
		double bmi = w/(h*h);
		System.out.printf("BMI : %.1f \n",bmi);
			
		scan.close();
	}
	
}
