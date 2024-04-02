package com.arrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// 리스트에 저장
		list.add("Java");
		list.add("JDBC");
		list.add("servle/JSP");
		list.add("myBATIS");
		list.add(2, "Database");
		
		// 삭제
		list.remove(1);
		
		// 변경
		list.set(2, "Oracle");
		
		// 리스트에 저장된 총 개수
		int size = list.size();
		System.out.println("총 개수 : " + size);
		
		// 리스트에 저장된 객체 얻기
		String str = list.get(2);
		System.out.println("2번 인덱스 : "+str);
		
		for(int i=0; i<list.size(); i++) {
			str = list.get(i);
			System.out.println(i+ " : "+str);
		}
		int i = 0;
		for(String s : list) {
			System.out.println(i+ " : "+s);
			i++;
		}
	}
}
