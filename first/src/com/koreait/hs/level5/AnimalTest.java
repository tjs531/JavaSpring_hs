package com.koreait.hs.level5;

public class AnimalTest {

	public static void main(String[] args) {
		Animal ani = new Dog();
		ani.cry();
		ani = new Cat();
		ani.cry();
		//ani.sleep();		//호출 불가능 (Animal에는 없는 메소드)
		
		Cat cat = (Cat)ani;
		cat.cry();
		cat.sleep(); 		//호출 가능. (Cat 타입에는 sleep메소드 있다)
	}
}
