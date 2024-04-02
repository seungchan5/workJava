package sec01.exam04;

public class Main {
	public static void main(String[] args) {
		// 부모타입으로 자식객체를 생성합니다.
		// 자동형변환 됩니다.
		Airplane airplane = new SupersonicAirplane(SupersonicAirplane.SUPERSONIC);
		
		// 부모타입으로 변환시 
		// 1. 부모가 가지고 있는 필드 또는 메서드에만 접근이 가능하다.
		// 2. 재정의 메서드 호출시 - 자식클래스에서 재정의한 메서드가 호출
		System.out.println("재정의 메서드 호출");
		airplane.fly();
		
		// 자식타입으로 형변환 -> 강제 형변환 (명시적 형변환)
		SupersonicAirplane supersonic = (SupersonicAirplane) airplane;
		
		// 원래 타입으로 변환시 자식클래스가 가지고 있는 필드 또는 메서드에 접근 가능
		System.out.println("자식타입으로 강제 형변환");
		supersonic.booster();
		System.out.println(supersonic.flyMode);
		
		
	}
}
