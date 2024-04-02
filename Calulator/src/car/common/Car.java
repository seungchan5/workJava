package car.common;

public class Car {
	//필드
	// 필드의 기본 형태 
	// 타입 필드 = 초기값 (초기값은 생략 가능)
	String model;
	String color = "black"; 
	int maxSpeed;
	
	// 생성자의 오버로딩
	// 매개변수의 타입, 개수, 순서가 다르게 여러개를 선언
	
	// 생성자의 특징 2가지
	// 클래스와 동일한 이름
	// 반환타입이 없다
	public Car() {
		// 생성자 호출
		// this. : 필드
		// this() : 생성자
		// 생성자를 사용하기 위해서 매개변수에 알맞은 파라미터를 넣어준다
		
		// 1. 생성자에서 다른 생성자를 호출할 수 있다.
		// -> 중복되는 코드를 줄이기 위해서 
		this("기본모델", "블랙", 150);
	} 
		
	
	// 기본생성자
	public Car(String model) {
		// model = model; -> 코드블럭 안에서는 로컬 변수(매개변수)가 우선되므로 아무런 의미가 없음
		//this.model = model;
		this(model, null, 0);
	} 

	// 생성자 오버로딩
	public Car(String model, String color) {
		// 생성자를 호출하는 것은 첫번째 줄에서만 가능하다.
		this(model, color, 0);
		
	}
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
}
