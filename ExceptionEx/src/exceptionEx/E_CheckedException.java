package exceptionEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * CheckedException
 *  - Exception을 상속하고 있는 예외들
 *  - 컴파일시 예외처리코드가 있는지 검사하는 예외
 *  - 예외처리가 되어 있지 않으면 오류를 발생 
 *  - 조건문이나 소스코드 수정으로는 해결이 되지 않는다
 * @author user
 *
 */
public class E_CheckedException {
	public void method1() {
		
	}
	public void method2() throws IOException {
		String str = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("문자열을 입력해주세요");
		str = br.readLine();
		
//		int num = "";
	}
}
