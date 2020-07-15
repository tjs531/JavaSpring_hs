package com.koreait.hs.blackjack;

public class Game {
	
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer();
		Dealer dealer = new Dealer();
		
		for(int i=0; i<2; i++) {
			dealer.receiveCard(cd.getCard());
			gamer.receiveCard(cd.getCard());
		}
		
		dealer.moreCards(cd);
		gamer.moreCards(cd);
		dealer.openCards();

		Rule.whoIsWin(gamer,dealer);			//비겼는지 누가 이겼는지 결과를 나타냄.
	}
}
