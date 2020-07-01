package com.koreait.hs.level8;

import java.lang.ClassNotFoundException;
import java.sql.SQLException;

public class TryCatchTest {
	//런타임에러 뜨면 프로그램 종료가 된다. 에러가 터져도 종료가 안되도록 예외처리.
	//애초에 에러가 안터지게 개발하는 방법도 있지만 어쩔 수 없이 사용하는 경우가 있다. 특히 통신하는 경우에 에러가 많이 남.
	
	public static void main(String[] args) {	
		meth();
		
		try {
			meth2();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();							//에러메세지 띄우기
		}
		System.out.println("dddd");							//위에서 에러뜨지만 예외처리 해줬기 때문에 이 문장도 실행 된다.
			
		try {
			System.out.println(div(10,0));
		}catch (Exception e) {
			System.out.println("0으로 나누면 안됩니다");
		}
	}
	
	public static int div(int n1, int n2) throws Exception{		//에러가 발생하면 Exception을 던지겠다! 그냥 메소드에서 try catch 해줘도 됨.
		return n1/n2;
	}
	
	public static void meth2() throws ClassNotFoundException {	//throws를 쓰면 이 메소드에서는 에러나도 문제 없지만. but 이 메소드를 사용하는 곳에서 try catch문으로 처리해줘야 한다.

		Class.forName("ㅇㄴ");						//데이터베이스 통신할 떄 배우자.. 에러날 가능성이 있어서 단독으로 쓰면 빨간줄 뜸
	}
	
	public static void meth() {
		int result = 2;
		
		try {									//에러가 안터지면 실행되는 부분.
			//result = 10/0;
			
			Class.forName("");
		}//catch(SQLException e) {				//에러 종류에 따라 다르게 실행할 수 있다. 이 종류의 에러 날 가능성이 없는데 써주면 빨간줄..
			
		//}
		catch(ClassNotFoundException e) {
			
		}
		catch(Exception e) {					//catch: 에러가 터질때만 실행되는 부분. Exception e는 웬만하면 써주는게 좋다.
			e.printStackTrace();
			System.out.println("예외가 발생하였습니다.");
		}
		
		finally {								//에러의 유무에 상관없이 무조건 실행되는 부분. 위에서 return을 만나도 무조건 실행된다. ex> 스트림 연결하면 무조건 끊어줘야 하기 때문에 finally에 써줌
			System.out.println("finally");
		}
		System.out.println("result: " + result);
		System.out.println("종료");
	}
}
