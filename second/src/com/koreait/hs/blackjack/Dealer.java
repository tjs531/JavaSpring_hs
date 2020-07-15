package com.koreait.hs.blackjack;

public class Dealer extends Gamer{
	
	public Dealer() {
		name="딜러";
	}
	@Override
	public void moreCards(CardDeck cd) {
		//딜러가 가지고 있는 카드의 합계 점수가 17점 이상이 될 때까지 카드 뽑기를 해야합니다.
		int stopPoint = 17;
		while(getTotalPoint() < stopPoint) {
			receiveCard(cd.getCard());
		}
	}
}
