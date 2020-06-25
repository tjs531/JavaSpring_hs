package com.koreait.hs.baseball;

public class Checker {

	//S:0 / B:0 / O:0
	//성공하면(S:3이면) false,  성공전이면 true
	public static boolean check(int len, Baseball base, MyBall m_base) {
		int s=0, b=0;
		
		for(int i=0; i<len; i++) {
			for(int z=0; z<len; z++) {
				if(base.get(i) == m_base.get(z)) {
					if(i==z) {
						s++;
					}else {
						b++;
					}
				}
			}
		}
		
		System.out.printf("S: %d / B: %d / O: %d\n", s,b,len-s-b);
		
		if(s==3) {
			return false;
		}
		return true;
	}
}
