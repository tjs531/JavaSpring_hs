package com.koreait.hs.level3;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		
		Car car1 = new Car("소나타", "흰색", 2500); 	//생성자
		car.introduceMyCar();
		car1.introduceMyCar();
	}
}
