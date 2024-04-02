package getter.setter;

public class CalculatorMain {

	public static void main(String[] args) {
		// 정적 필드, 정적 메서드는 생성하지 않고
		// 클래스 이름으로 접근하여 사용합니다.
		double res = 10*10*Calculator.pi;
		int plus = Calculator.plus(5, 5);
	}

}
