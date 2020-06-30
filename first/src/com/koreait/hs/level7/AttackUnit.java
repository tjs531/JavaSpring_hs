package com.koreait.hs.level7;

public interface AttackUnit {		//인터페이스가 인터페이스를 상속 받을 수 있다. 그런경우 extends를 씀.(클래스는 상속받지 못한다)
	void attack(Unit u);			//인터페이스는 클래스 안에 이 메소드가 있는지를 본다. 상속받은 것도 오케이.
}
