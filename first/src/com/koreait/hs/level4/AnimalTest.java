package com.koreait.hs.level4;

public class AnimalTest {
	public static void main(String[] args) {
		//Animal animal = new Animal();
		Bird bird = new Bird("참새");
		Bird bird2 = new Bird("기러기");
		Sparrow sparrow = new Sparrow();
		
		//animal.crying();
		bird.crying();				//Bird가 Animal 클래스를 상속받아서 bird에서도 animal에 있는 메소드 사용할 수 있음.
		
		//animal.flying();			//부모 클래스는 자식 클래스의 메소드를 호출할 수 없음 
		bird.flying();
		//sparrow.crying();			//bird에서 재정의된 메소드로 호출 됨. (Animal에 있는 crying()은 사용 불가)
									//Animal에 있는 crying()도 같이 호출하고 싶으면
									//bird에서 재정의 한 메소드 안에 super.crying() 호출해주면 됨.
	
		bird.whoAmI();
		bird2.whoAmI();
		sparrow.whoAmI();
	}
}
