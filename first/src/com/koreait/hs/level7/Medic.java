package com.koreait.hs.level7;

public class Medic extends Unit {		//공격유닛 아니라 AttackUnit 인터페이스 상속 안함
	
	public Medic() {
		super("메딕",70);		//이름,최대피
	}
	
	public void heal(Unit unit) {	//일단 모두 치료는 받을 수 있게 Unit으로 받음(컴파일에러 안나게)
									//일단 받고나서 치료할지 안할지 처리함
		if(unit == this || !(unit instanceof Carable)) { //Carable로 형변환 할 수 있는 애들이라면 치료 받을 수 있는 애들. 
			System.out.println("치료할 수 없습니다.");
			return; 
		}
		unit.setCurrent_hp(unit.MAX_HP);						
	}
}
