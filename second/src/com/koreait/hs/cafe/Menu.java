package com.koreait.hs.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu{
	
	private List<MenuItem> arr = new ArrayList();
	
	public Menu() {
		arr.add(new MenuItem("아메리카노", 1500));
		arr.add(new MenuItem("카푸치노", 2000));
		arr.add(new MenuItem("카라멜 마키아또", 2500));
		arr.add(new MenuItem("에스프레소", 2500));
		arr.add(new MenuItem("유자차", 1500));
	}
	
	public void addMenu(String name, int price) {
		arr.add(new MenuItem(name, price));
	}
	
	public void printMenu(){
		for(int i=0; i<arr.size(); i++) {
			System.out.printf("%d: %s \n",i+1, arr.get(i));
		}
	}
	
	public MenuItem choose(int i) {
		return arr.get(i-1);

	}
}
