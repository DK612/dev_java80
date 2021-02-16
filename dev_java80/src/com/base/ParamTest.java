package com.base;

class Param {
	int ival; //전역변수는 초기화 생략가능
}

public class ParamTest {

	public static void main(String[] args) {
		ParamTest pt = new ParamTest();
		Param p = new Param(); //#1
		p.ival = 100;
		pt.effectParam(p); //pt.effectParam 메소드는 매개변수가 참조형변수이므로 주소를 복사해 전달한다
		System.out.println("main ival = " + p.ival); //p.ival은 #1 Param의 속성
		//p의 주소를 전달하였지 p에 무언가 새로 할당된것이 아니므로 p는 기존의 #1 Param클래스의 주소를 그대로 가지고 있다.
	}
	void effectParam(Param p) {
		p = new Param();// #2 //Param형 매개변수 p에 새로운 #2 Param클래스의 주소가 할당됨
		p.ival = 500;	// 새로 할당되었으므로 main에서 사용된 #1 Param클래스와는 상관이 없다
		System.out.println("sub ival = " + p.ival); //이곳의 p.ival은 #2 Param의 속성이므로 main의 p.ival에 영향을 미치지 않는다.
		
	}
}
