package com.koreait.hs.baseball;

import java.util.Scanner;

public class MyBall {
	
	private int[] myArr;
	private Scanner scan;
	
	public MyBall(int num) {
		myArr = new int[num];
		scan = new Scanner(System.in);
	}
	
	void setNumbers() {
		for(int i=0;i<myArr.length; i++) {
			System.out.printf("숫자%d:",i+1);
			String val= scan.nextLine();
			
			try {
				myArr[i] = Integer.parseInt(val);	//입력받은 문자를 숫자로 파싱
			}catch(Exception e){					//문자를 입력해서 에러날 시 0을 입력
				i--;
				System.out.println("숫자만 입력해라");
				continue;
			}
			
			if(myArr[i] < 1 || myArr[i] > 9) {
				System.out.println("범위를 벗어났다.(1~9)");
				i--;
				continue;
			}
			
			for(int z=0; z<i; z++) {
				if(myArr[i] == myArr[z]) {
					System.out.println("중복된 숫자입니다.다시 입력해라.");
					i--;
					break;
				}
			}
		}
	}
	
	public int get(int index) {
		return myArr[index];
	}
}
