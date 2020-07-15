package com.koreait.hs.second;

public class Gugudan {
	
	public static void main(String[] args) {
		//gugudan(2,5);
		
		int sum = sum(1,2); //3
		System.out.println(sum);
		sum = sum(1,2,3); //6
		System.out.println(sum);
		sum = sum(1,2,3,4,5,6,7,8,9,10); //다 더한값
		System.out.println(sum);
		
		int result = Utils.parseStringToInt("10",0); //10정수값 리턴
		System.out.println(result);
		result = Utils.parseStringToInt("aa10",1); //파싱할 수 없을 때 두번째 인자값 리턴
		System.out.println(result);
		result = Utils.parseStringToInt("7");
		System.out.println(result);
		result = Utils.parseStringToInt("3adf");
		System.out.println(result);
		
		int[] arr = {4,5,11,223,3,10};
		
		Utils.sortASC(arr); //오름차순 정렬
		Utils.printArr(arr); //[3,4,5,10,11,223]
		Utils.sortDESC(arr); //내림차순 정렬
		Utils.printArr(arr); //[223,11,10,5,4,3]
		
		int[] rArr = Utils.createRandomArr(5,15,5); //1~9 랜덤값을 5칸 가지는 정수형 배열을 리턴하시오
		Utils.printArr(rArr); 
		
		rArr = Utils.createRandomArrNoDuplication(1,9,9);	//중복 없이
		Utils.printArr(rArr); 
		
		
		
		rArr = Utils.createRandomArrNoDuplication(1,9,10);	//나올 수 있는 숫자 범위보다 배열 크기가 큰 경우 arr is null 출력			
		Utils.printArr(rArr);
		
		String star = makeStarTriangle(5);
		System.out.println(star);
		// "*\n**\n***\n****\n*****\n"
		
		//*
		//**
		//***
		//****
		//*****

	}
	
	public static void gugudan(int n1, int n2) {
		for(int i=n1; i<=n2; i++) {
			for(int z=1; z<=9; z++) {
				if((i*z)%2 ==0) {
					System.out.printf("%d * %d = %d\n", i, z, i*z);
				}
			}
			System.out.println();
		}
	}
	
	public static int sum (int...num) {
		int sum=0;
		
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		
		return sum;
	}
	
	public static String makeStarTriangle(int num) {
		String str = "";
		
		for(int i=0; i<num; i++) {
			for(int z=0; z<=i; z++) {
				str += "*";
			}
			str += "\n";
		}
		
		return str;
	}
}
