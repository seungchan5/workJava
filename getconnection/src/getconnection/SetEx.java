package getconnection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		// 컬렉션프레임워크
		// 데이터를 효율적으로 관리(추가, 삭제, 검색, 저장)할 수 있는 자료구조
		// List : 인덱스로 관리
		// Set : 중복을 허용하지 않음
		// Map : key, value
		
		Set lotto = new HashSet<Integer>();
		
		while(lotto.size()<6) {
			int i = (int)(Math.random()*45)+1;
			lotto.add(i);
			
			System.out.println("추출 : "+i);
			System.out.println(lotto);
		}
		/*
		 * 컬렉션에서 요소를 제어하는 기능
		 * next(). previous()를 사용하여 앞뒤로 이동이 가능
		 * hashNext()를 사용하여 다음 요소가 있는지 확인 하는 기능
		 */
		Iterator i = lotto.iterator();
		while(i.hasNext()) {
			System.out.println(i.next() + " ");			
		}
		
		
	}
}
