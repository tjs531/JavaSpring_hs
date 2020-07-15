package com.koreait.hs.cafe;

import java.util.Scanner;

public class Customer {

	public MenuItem order(Menu menu) {
		menu.printMenu();
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			try {	
				System.out.print("메뉴골라라: ");
				int num = scan.nextInt();
				MenuItem mi = menu.choose(num);
				return mi;
			}catch(Exception e) {
				System.out.println("메뉴 다시골라");
			}
		}
	}
	
	public void drinkCoffee(Coffee coffee) {
		System.out.println(coffee.getName() + "를 호로록");
	}
}
