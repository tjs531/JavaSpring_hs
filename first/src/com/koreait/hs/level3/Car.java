package com.koreait.hs.level3;

public class Car {
	String name;
	String color;
	int cc;
	
	public Car() {		//기본생성자. 메인에서 호출할때 기본으로 호출되는 생성자.
						//생성자와 메소드의 차이점.
						//1.이름이 클래스랑 똑같다.
						//2.리턴타입이 없다.
		//super();
		//System.out.println("기본생성자!");
		this("소나타","흰색",2500);			//본인 생성자 호출
	}
	
	
	
	public Car(String name, String color, int cc) {
		super();
		this.name = name;
		this.color = color;
		this.cc = cc;
	}

	public void introduceMyCar() {
		System.out.printf("%s의 컬러는 %s이고 %dcc이다.\n", name, color,cc);
		
	}
}
