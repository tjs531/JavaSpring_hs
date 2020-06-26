package com.koreait.hs.level4;

public class Animal {					//상속. 부모로 올라갈수록 추상적,자식으로 내려갈수록 구체적.
										//Animal의 부모클래스는 Object클래스. (extends Object 생략됨)
										//Object는 객체 선언 할 때마다 만들어짐.(static 아님)
	private String name;
	private String type; //포유류, 조류, 어류
	
	/*public Animal() {					//기본생성자가 없으면 자식클래스에 에러가 뜬다.
										//자식클래스 기본생성자 안에 super();가 들어있기 때문
										//부모클래스에 기본 생성자를 따로 만들어주거나
										//자식클래스 기본생성자 안에 super("",""); 해주면 됨.
	}*/
	
	protected Animal(String name, String type) {		//생성자를 만들면 Animal을 상속받은 Bird에서 에러가 뜬다.
		this.name = name;
		this.type = type;
	}
	
	void crying() {
		System.out.println("울다~~");
	}
	
	void eat() {
		System.out.println("먹다아");
	}
	
	void whoAmI() {
		System.out.printf("나는 %s인 %s입니다.\n", type,name);
	}
}
