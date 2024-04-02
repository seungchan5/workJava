package com.kh.prictice2.model.vo;

public abstract class Animal {
	private String name;
	private String kinds;
	
	protected Animal() {
		
	}
	
	protected Animal(String name, String kinds) {
		// 초기화
		this.name = name;
		this.kinds = kinds;
	}
	// 문자열을 반환합니다
	public String toString() {
		return "저의 이름은 " + name + " 이고," + " 종류는 "+ kinds + " 입니다.";
	}
	
	public abstract void speak();
	
}
