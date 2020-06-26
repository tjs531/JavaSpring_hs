package com.koreait.hs.level4;

public class Bird extends Animal {			//상속. 자바에서는 클래스 다중상속 불가능. 인터페이스는 다중상속 가능.
	
	protected Bird(String name) {
		super(name,"조류");
	}
	
	void flying() {
		System.out.println("훨훨");
	}

	@Override 				//오버라이딩할 떄 써줘야 함. 실수하는걸 방지하기 위해. 이걸 써주면 이름 다르게 쓰면 오버라이딩이 안됐다고 빨간줄로 알려줌.
	void crying() {			//오버라이딩. 부모클래스에 있는 메소드를 재정의. 메인에서 실행할 시 자식에게 있는 메소드가 실행된다.
							//이름, 타입, 매개변수 다 똑같이 써야함.(오버로딩은 타입과 매개변수는 달라도 됨)
		System.out.println("쨱짹");
	}
}
