package com.koreait.hs.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> arr = new ArrayList(); 		//Card 타입만 받는 리스트
	
	public CardDeck() {
		for(int i=0; i<Card.PATTERNS.length; i++) {
			for(int z=1; z<=13; z++) {
				arr.add(new Card(Card.PATTERNS[i], getDeno(z), getPoint(z))); 
			}
		}
	}
	
	private String getDeno(int num) {
		switch(num) {
		case 1:return "A";
		case 11:return "J";
		case 12:return "Q";
		case 13:return "k";
		default: return String.valueOf(num);
		}
	}
	
	private int getPoint(int num) {
		return (num>=11) ? 10 : num;
	}
	
	/*
	@Override
	public String toString() {
		for(Card c : arr) {
			System.out.println(c);
		}
		return "";
	}*/
	
	@Override
	public String toString() {
		String str="";
		for(Card c:arr) {
			str += c + "\n";
		}
		return str;
	}
	
	public Card getCard() {
		int num = (int)(Math.random()*arr.size());
		
		return arr.remove(num);			//remove도 주소값 반환해줌.
	}
}
