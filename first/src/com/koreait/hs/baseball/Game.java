package com.koreait.hs.baseball;

public class Game {
	public static void main(String[] args) {
		int gameCnt = 3;
		Baseball ball = new Baseball(gameCnt);
		MyBall myBall = new MyBall(gameCnt);
		
		//int val = ball.get(0);
		
		do {
			myBall.setNumbers();
		}while(Checker.check(gameCnt,ball,myBall));

		System.out.println("게임 종료!");
	}
}