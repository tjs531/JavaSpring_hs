package com.koreait.hs.level4;

public class Value {
	
	private int val;
	
	public Value(int val) {
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
		//return String.format("%,d", val);		//println과 똑같지만 얘는 리턴, println은 출력.
		return String.valueOf(val);
	}
}