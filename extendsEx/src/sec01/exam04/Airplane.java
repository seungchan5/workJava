package sec01.exam04;

	// final 키워드가 클래스에 붙었을때 : 부모클래스가 될 수 없음
	// public final class Airplane {
	public class Airplane {	
		Airplane() {
			System.out.println("============Airplane 생성합니다");
		}
	public void land() {
		System.out.println("착륙 합니다");
	}
	// final 키워드가 메서드에 붙었을때 : 메서드를 재정의 할 수 없다.
	// public final void fly() 
	public void fly(){
		System.out.println("일반 비행입니다");
	}
	
	public void takeOff() {
		System.out.println("이륙 합니다");
	}
	
	
}
