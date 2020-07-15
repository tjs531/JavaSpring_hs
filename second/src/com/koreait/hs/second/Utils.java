package com.koreait.hs.second;

public class Utils {

	public static int parseStringToInt(String str, int num){
		int result = num;
		try {
			result = Integer.parseInt(str);
		}catch(Exception e) {}
		return result;
	}
	
	public static int parseStringToInt(String str){
		return parseStringToInt(str, 0);
	}
	
	public static void sortASC(int[] arr) {
		int temp;
		
		/*for(int i=0; i<arr.length; i++) {
			for(int z=0; z<i; z++) {
				if(arr[i] < arr[z]) {
					temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
			}
		}*/
		
		sort(arr, true);
	}
	
	public static int[] printArr(int[] arr) {
		if(arr == null) {
			System.out.println("arr is null");
		}else {
			System.out.print("[");
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]);
				System.out.print(i==arr.length-1 ? "]\n" : ", ");
			}
		}
		return arr;
	}
	
	public static void sortDESC(int[] arr) {
		int temp;
		
		/*for(int i=0; i<arr.length; i++) {
			for(int z=0; z<i; z++) {
				if(arr[i] > arr[z]) {
					temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
			}
		}*/
		sort(arr, false);
	}
	
	private static void sort(int[] arr, boolean tf) {		//정렬하는 소스 중복되므로 따로 만들어주면 좋음.
		for(int i=0; i<arr.length-1; i++) {
			for(int z=i+1; z<arr.length; z++) {
				if(tf == (arr[i] > arr[z])) {
					int temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
			}
		}
	}
	
	public static int[] createRandomArr(int start, int end, int arrlen) {
		int[] arr = new int[arrlen];
		
		for(int i=0; i<arrlen; i++) {
			arr[i] = (int)(Math.random()* end +1 -start) + start;
		}
		
		return arr;
	}
	
	public static int[] createRandomArrNoDuplication(int start, int end, int arrlen) {
		
		if((end-start+1) < arrlen) {
			return null;
		}
		
		int[] arr = new int[arrlen];
		for(int i=0; i<arrlen; i++) {
			arr[i] = (int)(Math.random()* end +1 -start) + start;
			for(int z=0; z<i; z++) {
				if(arr[i] == arr[z]) {
					i--;
					break;
				}
			}
		}
		return arr;
	}
}
