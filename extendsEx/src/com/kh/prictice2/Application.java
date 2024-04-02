package com.kh.prictice2;

import com.kh.prictice2.model.vo.*;
//import com.kh.prictice2.model.vo.Animal;
//import com.kh.prictice2.model.vo.Cat;
//import com.kh.prictice2.model.vo.Dog;


public class Application {

	public static void main(String[] args) {

		Animal[] ap = new Animal[5];
		
		for(int i=0; i<ap.length; i++) {
			int animal = (int)((Math.random()*2)+1);
			if(animal==1) {
				ap[i] = new Dog("쫑", "치와와", 3);
			} else {
				ap[i] = new Cat("홍", "개냥이", "집", "흰색");
			}
		}
		for(Animal j : ap) {
			j.speak();
		}
	}
	
	// Animal 타입의 객체배열 크기 5로 생성
	// Animal animalArry = new Animal[5];
	
	// 각 인덱스에 무작위로 Dog객체 또는 Cat객체를 생성
	// 매개변수 생성자를 이용하여 생성
	// Dog dog = new Dog("쫑","치와와",3);
	// Cat cat = new Cat("홍", "개냥이", "집", "흰색");
	
	// 배열의 각 방에 고양이 또는 멍멍이를 입력
	//	for(int i=0; i<5; i++) {
	//		int index = (int)(Math.random()*2);
	//		if(index==1) {
	//			animalArry[i] = dog;
	//		} else {
	//			animalArry[i] = cat;
	//		}
	//	}
	// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스 까지의
	// 객체의 speak() 메소드 호출
	// for(Animal a : animalArry) {
	//    //자식 객체에서 재정의(오버라이딩) 되어진 메소드 호출
	// a.speak();

}
