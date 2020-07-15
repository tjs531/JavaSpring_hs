package com.koreait.hs.cafe;

import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) {

		Menu menu = new Menu();
		Customer cus = new Customer();
		Barista bas = new Barista();
		
		MenuItem choiceMenu = cus.order(menu);
		Coffee coffee = bas.makeCoffee(choiceMenu);
		
		cus.drinkCoffee(coffee);
		
		
		/*Scanner scan = new Scanner(System.in);
		int c;

		while (true) {
			System.out.print("메뉴 선택(종료: -1): ");
			c= scan.nextInt();
			if(c == -1) {
				break;
			}
			MenuItem mi = menu.choose(c);
			if (mi != null) {
				System.out.println(mi);
			}
		}*/
	}
}
