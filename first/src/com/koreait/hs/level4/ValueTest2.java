package com.koreait.hs.level4;

public class ValueTest2 {
	public static void main(String[] args) {
		String str = new String("안녕");
		System.out.println("str: " + str);
		
		System.out.println();
		
		Value val = new Value(2);
		System.out.println("val: " + val);		//문자열 + object라서 자동으로 object.toString()호출
												//println은 자동으로 String으로 바꿔서 출력.문자열 없이 val만 출력해도 toString 호출
												//toString()은 Object에 있는 메소드. 
												//오브젝트의 toString은 값을 출력해주는 것이 아니라 주소값을 문자열로 출력해주기 때문에 값을 출력하려면 오버라이딩 해줘야 함
		
		//String strVal = String.valueOf(val);		/*println 메소드 안에서 처리하는 일
		//String strVal2 = strVal.toString();		 (String으로 변환하는 과정) */
	}
}
