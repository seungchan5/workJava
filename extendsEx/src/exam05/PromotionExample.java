package exam05;

class A{}

class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}

public class PromotionExample {
	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; // 자동 형변환 : 부모타입으로 자동 형변환
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
//		B b2 = e; // 상속관계의 연관이 없어 자동 변환 불가능
//		C c2 = d;
		
		
		
		
		
	}
}
