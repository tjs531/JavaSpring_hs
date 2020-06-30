package com.koreait.hs.level4;

public class ValueTest {
	public static void main(String[] args) {
		String str = new String("A");
		String str2 = new String("A");
		
		System.out.println("1: " + (str == str2));
		System.out.println("2: "+ str.equals(str2));	//String은 equals 메소드를 오버라이딩(재정의)해서 값 비교로 바꿈.
		
		Value val1 = new Value(1);
		Value val2 = new Value(1);
		
		System.out.println("3: " + (val1 == val2));
		System.out.println("4: "+ val1.equals(val2));		//Object에 있는 원래 equals 메소드는 주소값 비교하는 메소드
	}
}
