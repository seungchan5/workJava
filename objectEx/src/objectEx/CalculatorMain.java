package objectEx;

public class CalculatorMain {

	public static void main(String[] args) {
		
		// 타입 변수명 = new 타입();
		Calculator calc = new Calculator();
		int rest = calc.add(5, 3);
		System.out.println("두수의 합 : "+rest);
		
		int rest2 =calc.sub(5, 3);
		System.out.println("두수의 차 : "+rest2);
		
		int rest3 =calc.mul(5, 3);
		System.out.println("두수의 곱 : "+rest3);
		
		double rest4 =calc.div(5, 3);
		System.out.println("두수의 나누기 값 : "+rest4);
		
		int rest5 =calc.rem(5, 3);
		System.out.println("두수를 나눈 나머지 값 : "+rest5);
		
		
	}

}
