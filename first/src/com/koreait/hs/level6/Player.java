package com.koreait.hs.level6;

public abstract class Player {					//추상메소드 있는 클래스는 무조건 abstract 붙여야 함.추상 메소드가 없어도 객체화 방지하려고 붙이기도 한다.
	
	public abstract void play();				//추상메소드: 정의만 하고 내용은 적지 않는다. 추상메소드 특징 : 1.객체화 안됨  2.부모역할만 하겠다.(나를 상속해라)
	
	public void stop() {						//추상클래스 안에 일반 메소드도 선언 가능
		System.out.println("재생을 멈췄다.");
	}
}

abstract class APlayer extends Player{		//추상클래스를 다른 추상클래스가 상속받을 수 있음
	
}

class CDPlayer extends Player{
	
	@Override
	public void play() {
		System.out.println("CD를 재생합니다.");
	}
}

class DVDPlayer extends Player {

	@Override
	public void play() {
		System.out.println("DVD를 재생합니다.");
	}
	
}