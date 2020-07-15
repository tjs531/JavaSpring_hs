package com.koreait.hs.blackjack;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gamer {

	String name;
	private List<Card> arr = new LinkedList();		//수정이 잦으면 ArrayList보다 LinkedList가 낫다.
	Scanner scan = new Scanner(System.in);

	public Gamer() {
		name="게이머";
	}

	public void receiveCard(Card card) {
		arr.add(card);
	}

	public void openCards() {
		System.out.println(name);
		for(Card c : arr) {
			System.out.println(c);
		}
		System.out.println("점수: "+ getTotalPoint());
	}
	
	public int getTotalPoint() {			//openCards() 안에 합쳐놔도 되지만 메소드 하나는 한 역할만..!. 다음에 점수계산을 또 쓸 수 도 있다.
		int sum=0;
		for(Card c:arr) {
			sum += c.getPoint();
		}
		return sum;
	}

	public void moreCards(CardDeck cd) {
		while(true) {
			this.openCards();
			System.out.print("카드 더?(Y/N): ");
			String answer = scan.next();

			if(answer.equals("N") ||answer.equals("n")) {
				System.out.println();
				break;
			}else if(answer.equals("Y") || answer.equals("y")) {
				receiveCard(cd.getCard());
			}else{
				System.out.println("올바른 값을 입력해라");
			}

			System.out.println();
		}
	}
}
