package com.koreait.hs.cafe;

public class Barista {

	Coffee coffee = null;
	public Coffee makeCoffee(MenuItem choiceMenu) {
		coffee = new Coffee(choiceMenu);
		return coffee;
	}
	
	
}
