package com.koreait.hs.blackjack;

public class Rule {
	
	public static void whoIsWin(Gamer gamer, Dealer dealer) {
		int gPoint = gamer.getTotalPoint();
		int dPoint = dealer.getTotalPoint();

		if( 21 < gPoint) {
			System.out.println((21<dPoint) ? "무승부":"딜러 승");
		}else if( 21 < dPoint) {
			System.out.println("게이머 승");
		}else if( gPoint == dPoint ) {
			System.out.println("무승부");
		}else {
			System.out.println((gPoint>dPoint) ? "게이머 승":"딜러 승");
		}
	}
}
