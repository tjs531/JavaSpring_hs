package com.koreait.hs.level6;

public class PlayerTest {
	
	public static void main(String[] args) {
		//Player player = new Player();		//추상클래스는 객체화 안됨.
		Player player = new CDPlayer();
		player.play();
		
		player = new DVDPlayer();
		player.play();
	}
}
