package exceptionEx;

import java.io.FileNotFoundException;
import java.io.IOException;

public class C_subClass extends C_SuperClass{
	
	// 부모클래스의 메서드보다 상위타입에 예외를 발생시키는것은 불가능
//	public void method() throws Exception {
//		super.method();
//	}
	
	
//	// 오버라이딩시 예외를 작성하지 않아도 된다
//	public void method() {
//		// TODO Auto-generated method stub
//		// super.method();
//	}
	@Override
	// 부모 클래스의 메소드 보다 하위 타입의 예외를 발생시킬 수 있다
	public void method() throws FileNotFoundException {
		// TODO Auto-generated method stub
		//super.method();
	}
}
