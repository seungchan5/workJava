package sec03.exam02;

public class Cat extends Animal{
	
	public Cat() {
		this.kind = "포유류";
	}
	
	// 오버라이딩 : 메서드 재정의
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}
}
