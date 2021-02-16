package com.base;

public class Pride {
	//int i;
	//i = 10;
	int wheelNum = 4;
	//Pride herCar = new Pride(); //인스턴스화
	//herCar.wheelNum = 0;//선언부에는(전역변수는) 초기화와 선언을 분리할 수 없다.
	void go(int x) {
		
	}
	
	public static void main(String[] args) {
		Pride herCar = new Pride(); //인스턴스화
		Pride gnomCar = new Pride(); //인스턴스화
		//insert here - 자동차 바퀴수가 4개 입니다.
		//non-static의 변수 wheelNum은 static영역인 main안에서 사용할 수 없다.
		//해결방법: 인스턴스화를 통해 class안의 변수를 호출할 수 있다.
		System.out.println("자동차 바퀴수가 " + herCar.wheelNum + " 입니다.");
		gnomCar.wheelNum = 6;
		System.out.println("자동차 바퀴수가 " + gnomCar.wheelNum + " 입니다.");
	}

}
