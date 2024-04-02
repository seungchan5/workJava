package arrayEx;

public class ArrayEx14 {
	public static void main(String[] args) {
		
		String[] names = {"홍길동","뉴진스","아이유","코요테","빅뱅"};
		
		// for(타입 변수명 : 배열이름)
		for(String str : names) {
			System.out.println("이름 : " + str);
		}
	}
}
