package com.koreait.hs.blackjack;

public class Card {
	private final String pattern;				//카드 모양
	private final String denomination;			//카드 숫자
	public static String[] PATTERNS = {"스페이드","하트","클로버","다이아"};
	private final int point;
	
	public Card(String pattern, String denomination, int point) {	//생성자 : 1. 리턴형 안쓴다. 2.클래스명과 똑같다.
		this.pattern = pattern;
		this.denomination = denomination;
		this.point = point;
	}
	
	public String getPattern() {
		return pattern;
	}
	
	public String getDenomination() {
		return denomination;
	}
	
	public int getPoint() {
		return point;
	}
	
	@Override
	public String toString() {
		return String.format("p: %s, d: %s, po: %d", pattern, denomination, point);
	}
}
