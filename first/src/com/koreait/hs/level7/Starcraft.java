package com.koreait.hs.level7;

public class Starcraft {
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Medic medic = new Medic();
		FireBat fb = new FireBat();
		
		//System.out.println(m1);	
		//마린, 현재 HP : 50
		
		m1.attack(m2);
		m1.attack(m2);
		m2.attack(m2);
		
		System.out.println("m1: " + m1);
		System.out.println("m2: " + m2);
		
		System.out.println();
		
		fb.attack(m1);
		fb.attack(m1);
		fb.attack(m1);
		System.out.println(m1);
		
		m1.attack(fb);
		m1.attack(fb);
		
		System.out.println(fb);
		
		medic.heal(fb);		//firebat은 Carable 인터페이스를 안받아서 치료 불가능
		medic.heal(m1);		//Marine은 Carable인터페이스 상속받아서 치료 가능.
		
		System.out.println(m1);
		
		//System.out.println(fb instanceof Carable);
		//System.out.println(m1 instanceof Carable);
	}
}
