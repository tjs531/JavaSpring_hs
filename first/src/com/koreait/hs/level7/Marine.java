package com.koreait.hs.level7;

public class Marine extends Unit implements AttackUnit, Carable{		//인터페이스 여러개 상속 가능. (,로 구분)

	private int damage;
	
	public Marine() {
		super("마린", 50);	//어차피 변하지 않는 값. (name, max_hp)
		this.damage = 5;	//시작할 때 데미지는 5
	}
	
	@Override
	public void attack(Unit u) {
		if(u != this) {
			System.out.println("따다다다");
			u.getDamage(damage);
		}
	}
}
