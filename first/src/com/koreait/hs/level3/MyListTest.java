package com.koreait.hs.level3;

public class MyListTest {			//1. 자바 파일과 이름이 같은 클래스가 있어야 한다.
									//2. 그 클래스에만 public을 붙일 수 있다.
									//3. 메인메소드는 그 클래스 안에만 만들 수 있다.
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(1,100);
		
		int delVal = list.remove();
		int delVal2 = list.remove(1);
				
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+ ", ");
		}
		System.out.println();
		System.out.println(delVal);
		System.out.println(delVal2);
	}
}

class MyList {
	private int[] arr;
	
	MyList(){
		arr = new int[0];
	}
	
	int size() {
		return arr.length;
	}
	
	int get(int index) {
		return arr[index];
	}
	
	void add(int num) {
		/*int[] temp = new int[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length]=num;
		arr = temp;*/
		add(arr.length, num);						//만들어놓은 메소드 활용하깅
	}
	
	void add(int index, int num) {
		int[] temp = new int[arr.length+1];
		/*
		for(int i=0; i<index ; i++) {
			temp[i] = arr[i];
		}

		temp[index]= num;
		
		for(int i=index; i<arr.length; i++) {
			temp[i+1] = arr[i];
		}*/
		
		for(int i=0; i<arr.length;i++) {
			temp[(i<index)? i : i+1] = arr[i];			//삼항연산자 사용...!!!!
		}
		temp[index] = num;
		arr = temp;
	}
	
	int remove(int index) {
		int[] temp = new int[arr.length-1];
		int d_num = arr[index];
		for(int i=0; i<temp.length; i++) {
			temp[i] = (i<index) ? arr[i] : arr[i+1];
		}
		arr = temp;
		
		return d_num;
	}
	
	int remove() {
		/*int[] temp = new int[arr.length-1];
		int d_num = arr[arr.length-1];
		for(int i=0; i<temp.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		
		return d_num;*/
		return remove(arr.length-1);
	}
}