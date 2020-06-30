package com.koreait.hs.level4;

public class Value {			//class 앞에 final 붙이면 상속 못함 //클래스에는 static 못붙임.(static은 변수랑 메소드에만)
	
	private int val;			//변수 앞에 final 붙이면 상수.(변경 불가)
	
	public Value(int val) {		//메소드 앞에 final 붙이면 오버라이딩 안됨.
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}

	@Override
	public boolean equals(Object obj) {
		Value v = (Value)obj;
		
		return this.getVal() == v.getVal(); 
	}
	
	@Override
	public String toString() {
		//return Integer.toString(this.getVal());
		//return String.format("%,d", val);		//println과 똑같지만 (String으로 변환) 얘는 리턴, println은 출력.
		return String.valueOf(val);				//valueOf는 (값)만, format은 (문자열+값) 가능.좀 더 유연
	}
	
}