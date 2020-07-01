package com.koreait.hs.level7;

public class Unit {
	public final String NAME;		//바뀌지 않음. 상수 -> 객체가 생성될 때마다 다른 값이 들어가야 하기 때문에 값을 메소드가 아닌 생성자로 넣어줘야한다.
	public final int MAX_HP;
	private int current_hp;
	
	public Unit(String name, int max_hp) {	//객체를 만들 때마다 값이 달라야하기 때문에 생성자에 매개변수로 받음
		this.NAME = name;
		this.MAX_HP = max_hp;
		this.current_hp = max_hp;		//처음 만들때 피는 다 차있어야 하니까
	}
	
	public int getCurrent_hp() {
		return current_hp;
	}
	
	public void setCurrent_hp(int hp) {
		this.current_hp = hp;
	}
	
	public void getDamage(int damage) {
		current_hp -= damage;
	}
	
	public void move(int x, int y) {
		System.out.printf("x:%d, y:%d 좌표로 이동\n", x,y); 
	}
	
	@Override
	public String toString() {
		return String.format("%s, 현재 HP : %d",NAME,current_hp);
	}
}
